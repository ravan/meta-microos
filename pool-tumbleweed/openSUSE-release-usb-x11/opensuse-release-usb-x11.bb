SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-usb-x11-20260915-3446.1.aarch64.rpm"
RPM_HASH = "e4f609cc2cf4d53540ff8223f9b557cb70675ef1f587cb71d8ef3a734d44284d32a0c9f3b8cc47933e52939365f3a2769941f462eafa75ca52ab049215bae90c"

RPROVIDES:${PN} += "flavor-usb-x11 \
openSUSE-release-usb-x11 \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
