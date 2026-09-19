SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-usb-kde-20260915-3446.1.aarch64.rpm"
RPM_HASH = "191a350835873026e3173e61e67475ca10ea9327371a55828cb366e05f54ef57ebb401b2884a49b73dd54bfba5fa75356dc116ecb5e7f84f92e64d03883d8abb"

RPROVIDES:${PN} += "flavor-usb-kde \
openSUSE-release-usb-kde \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
