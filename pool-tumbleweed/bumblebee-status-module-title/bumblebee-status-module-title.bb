SUMMARY = "Widget to display focused i3 window title"
DESCRIPTION = "Widget to displays focused i3 window title."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-title-2.1.5-4.7.noarch.rpm"
RPM_HASH = "29df0ba103fd6e5bb47153042c6d7c80c1c8ee0d1fee2ac260775f1a8a74fea1a2fe9c019861b7d18762e3f1c7d357de30ecedf64fda839ab4d7c52b282e75ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-title"

RDEPENDS:${PN} += "bumblebee-status \
python3-i3ipc"

inherit rpm
