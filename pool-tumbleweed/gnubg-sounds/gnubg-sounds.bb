SUMMARY = "Sounds for gnubg"
DESCRIPTION = "Sounds for GNU Backgammon. See description of gnubg for more details."
LICENSE = "GPL-3.0-or-later"

PV = "1.08.003"

RPM_NAME = "gnubg-sounds-1.08.003-1.6.noarch.rpm"
RPM_HASH = "356edceeeec7972730b76fcfe039cc915f07cf8ab1e0bcd2958105b9387dd9a0583c3da8b5bce674a3486a891948bcfbf64487130672a2946fda04befe8b5beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-sounds"

RDEPENDS:${PN} += "gnubg"

inherit rpm
