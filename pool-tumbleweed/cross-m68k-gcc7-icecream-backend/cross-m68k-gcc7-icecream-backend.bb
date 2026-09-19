SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-m68k-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "eaa4d0245192e16cb043d76205e85dd9ab98fe915ba7c262f9861ea4ae0e220a1c701b0492a2b0ee2176959076cc972ce113b7814a51a49b2a2a6af48a369103"

RPROVIDES:${PN} += "cross-m68k-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
