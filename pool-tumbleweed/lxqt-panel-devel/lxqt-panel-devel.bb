SUMMARY = "Devel files for lxqt-panel"
DESCRIPTION = "LXQt panel development files and headers"
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.1"

RPM_NAME = "lxqt-panel-devel-2.4.1-1.4.noarch.rpm"
RPM_HASH = "3b0db8a344460599f53b9a8da6cd7f56a005e14833073a68caab2fd67e0f27d8150e07188d67cefcc49595cd0ccaf3b1fa355e6be6c748c0a386ff975cf4907c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-panel-devel"

RDEPENDS:${PN} += "lxqt-panel"

inherit rpm
