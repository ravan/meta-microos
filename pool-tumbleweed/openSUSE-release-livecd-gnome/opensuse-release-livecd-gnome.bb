SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-livecd-gnome-20260915-3446.1.aarch64.rpm"
RPM_HASH = "9688fa3a6ec3900118388197c516097fbc0aeca376ecc2251b6668dccfeda8120cfc9353ab18b7b6a1aa8758fad67938b53832e90b8ad63d88663e563e7fe94a"

RPROVIDES:${PN} += "flavor-livecd-gnome \
openSUSE-release-livecd-gnome \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
