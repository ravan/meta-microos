SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-livecd-kde-20260915-3446.1.aarch64.rpm"
RPM_HASH = "336e2183f05ea47ed78c46f43107939c48df4d9671626f1cbe1217a256c7a58985e9f6bc343eb9d6a1718daecb37e217595c4d79993cb419c1924db32b899b04"

RPROVIDES:${PN} += "flavor-livecd-kde \
openSUSE-release-livecd-kde \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
