SUMMARY = "ISO country flags in PNG"
DESCRIPTION = "A collection of country flags in PNG. \
They correspond to the fancy 4x3 set in 320x200 resolution."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.0.4"

RPM_NAME = "iso-country-flags-png-1.0.4-1.2.noarch.rpm"
RPM_HASH = "867761b75dab041fd17698c6fb26f3da68f1f71072e646fbef5ce3b25d1ce45038b3086545cd600cf073975a3a01f07826dd48be72a418614ce7787d4be9e217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-country-flags-png"

RDEPENDS:${PN} += ""

inherit rpm
