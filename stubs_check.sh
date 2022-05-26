# This is a stubs check script. Not very effective really, should be replaced with better approach later.
# It runs a task to compile the code in stubs to make sure it is not broken and up to date.
# Beware that it cannot check the code on the calling side in other projects.
# The task is picked the way it has no time consuming dependencies and will take as little time as possible.
#
# This file is intended to be stored under VCS.

gradle_task_for_a_check="compileDebugSources"

if ! grep -q "stubs.enabled=true" "local.properties"; then
  echo "ERROR - NOT IN A STUB MODE"
  exit 1
else
  gradle_projects=""
  while read line; do
    if [[ "$line" == ":"* ]]; then
      gradle_projects="$gradle_projects$line:$gradle_task_for_a_check ";
    fi
  done < stubs_available.conf
  gradle_exec="./gradlew $gradle_projects"
  eval "$gradle_exec"
fi
