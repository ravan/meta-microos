SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-wsl-20260915-3446.1.aarch64.rpm"
RPM_HASH = "2032a81bb8954515c05a638c72256116b425f89f7dd09646494564a5be54328f480c62c5ae0a497b0190b8a3f781dc5f509a04bba4cf602c0da600e156e11056"

RPROVIDES:${PN} += "flavor-appliance-wsl \
openSUSE-release-appliance-wsl \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
