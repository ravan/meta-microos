SUMMARY = "Frisian (Frysk) Dictionary for Aspell"
DESCRIPTION = "A Frisian (Frysk) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "aspell-fy-0.12-4.7.aarch64.rpm"
RPM_HASH = "bc71a9b86afc0a1fa9232e4a2806f71566fdba4f10a090b10978181db2f3aa333eca0b632e06f4f6ac4b9385c034af83a70a7f016ffa77f6bd3a025116b65a3d"

RPROVIDES:${PN} += "aspell-fy \
locale-aspell-fy"

RDEPENDS:${PN} += ""

inherit rpm
