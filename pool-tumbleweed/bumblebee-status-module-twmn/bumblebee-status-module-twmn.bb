SUMMARY = "Widget to toggle twmn notifications"
DESCRIPTION = "Widget to toggle twmn notifications."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-twmn-2.1.5-4.7.noarch.rpm"
RPM_HASH = "e949981672300a4e8fa2906e8b25013fcea64b667e9e8e338958eeac84fd1c9e0a53840bf505727b6cd5aee76d0788c6e39249cc8f36dc78525f81716d104598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-twmn"

RDEPENDS:${PN} += "bumblebee-status \
systemd"

inherit rpm
