SUMMARY = "Development files for bridge-utils"
DESCRIPTION = "The bridge-utils devel package contains files needed for development."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "bridge-utils-devel-1.7.1-3.6.aarch64.rpm"
RPM_HASH = "1cf01bbd41ed1facfd721284979669ac4e8f46ae277416ec15e94ca1aab3ce26802bb26b7abc497e958e6b1a36f81c06129ee0b6676871e73d74ca6960c913b9"

RPROVIDES:${PN} += "bridge-utils-devel"

RDEPENDS:${PN} += "bridge-utils"

inherit rpm
