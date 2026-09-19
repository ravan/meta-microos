SUMMARY = "Documentation for AppStream"
DESCRIPTION = "AppStream-Core makes it easy to access application information from the \
AppStream database over a nice GObject-based interface. \
 \
This package contains the documentation files for AppStream."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.5"

RPM_NAME = "AppStream-doc-1.1.5-1.1.noarch.rpm"
RPM_HASH = "9ccbe04c50dbd3dafdec3a10480574f422ba5880ff01fed2f18ec51ae3a01186d0e8dca94f22ed4b74fe37809dbecf870e88eeaccba7d967722d97397886c2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AppStream-doc"

RDEPENDS:${PN} += ""

inherit rpm
