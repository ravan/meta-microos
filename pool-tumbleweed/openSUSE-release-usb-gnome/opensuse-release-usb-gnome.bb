SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-usb-gnome-20260915-3446.1.aarch64.rpm"
RPM_HASH = "fbefe29980e4cf7ef171a0ba54d3851cf47655e578cf80b97abe7f7575ab8aea325400f9ce38d68b7ab7b45ebaa00a4e5d12a016b7c8be823aa203f9b9642870"

RPROVIDES:${PN} += "flavor-usb-gnome \
openSUSE-release-usb-gnome \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
