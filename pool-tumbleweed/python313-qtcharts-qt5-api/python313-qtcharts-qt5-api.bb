SUMMARY = "Eric API files for python313-qtcharts-qt5"
DESCRIPTION = "This package provides Qt5 Charts library API files for the Eric IDE."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python313-qtcharts-qt5-api-5.15.6-5.8.aarch64.rpm"
RPM_HASH = "cf3624c4becb843fbaac33ad3d0be27ed24c94af810b0c83c667958e86e041539dfb49be17c27b1bf71e2444aeba13a05c47e6b50f44a85506a14b20f9c1cac4"

RPROVIDES:${PN} += "python3-qtcharts-qt5-api \
python313-qtcharts-qt5-api"

RDEPENDS:${PN} += ""

inherit rpm
