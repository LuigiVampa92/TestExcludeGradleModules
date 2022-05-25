if ! grep -q "stubs.enabled=true" "local.properties"; then
  echo "ERROR - NOT IN A STUB MODE"
  exit 1
else
  gradle_task="compileDebugSources"
  gradle_projects=""
  while read line; do gradle_projects="$gradle_projects$line:$gradle_task "; done < stubs_available.conf
  gradle_exec="./gradlew $gradle_projects"
#  echo "$gradle_exec"
#  gradle_exec_res=`eval "$gradle_exec"`
  eval "$gradle_exec"
fi
