SUMMARY = "Widget to display number of pending tasks in TaskWarrior"
DESCRIPTION = "Widget to displays the number of pending tasks in TaskWarrior."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-taskwarrior-2.1.5-4.7.noarch.rpm"
RPM_HASH = "e46307e25cc2dd8b6e6da7012f6c076a23e6b3ea6a094741a416c0bb3702193efb3cc411bb175539e66a1d040fefcf8b50cf95f5a70cb683fc7149964d85291a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-taskwarrior"

RDEPENDS:${PN} += "bumblebee-status \
python3-taskw"

inherit rpm
