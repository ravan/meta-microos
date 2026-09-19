SUMMARY = "Widget to show xkb layout"
DESCRIPTION = "Widget for displaying information about the xkb layout."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-layout-xkb-2.1.5-4.7.noarch.rpm"
RPM_HASH = "470d017082b57edc9209fe03d5401ea9f6d8cffa56d3f1909ae4dd339b28a1ec271a52cb91d1d38ba08ddd1b9d0c769d88a43d9c6eb758c6b5273ab9459d66a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-layout-xkb"

RDEPENDS:${PN} += "bumblebee-status \
python3-xkbgroup"

inherit rpm
