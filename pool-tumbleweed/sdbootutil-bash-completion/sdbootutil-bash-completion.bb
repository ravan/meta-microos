SUMMARY = "Bash completions for sdbootutil"
DESCRIPTION = "Bash completions script for sdbootutil. \
Allows the user to press TAB to see available commands, \
options and parameters."
LICENSE = "MIT"

PV = "1+git20260909.7cfa1f0"

RPM_NAME = "sdbootutil-bash-completion-1+git20260909.7cfa1f0-1.1.noarch.rpm"
RPM_HASH = "c038c847a95e18e7b12113d72a0c5bef574c9fc3a70b42c1bef0b70fd479d3f6d701ab487f90923f525f2a0be1c32a5128fcb4a319d435c6248d48457ef4e5be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbootutil-bash-completion"

RDEPENDS:${PN} += "bash \
bash-completion \
sdbootutil"

inherit rpm
