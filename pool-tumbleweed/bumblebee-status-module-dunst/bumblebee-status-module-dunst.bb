SUMMARY = "Widget to toggle dunst notifications"
DESCRIPTION = "Widget to toggle dunst notifications."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-dunst-2.1.5-4.7.noarch.rpm"
RPM_HASH = "26c5cc45e25dd308667bbeda625d4c19b34d4ec7f7cac2d3191374160b9324d77635f51114f671cb2981b2675d5a406f5355cf866d54e32cfa669ec6af64ec7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-dunst"

RDEPENDS:${PN} += "bumblebee-status \
dunst"

inherit rpm
