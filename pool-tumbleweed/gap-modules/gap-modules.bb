SUMMARY = "GAP: Abelian Finitely Presented Modules over Computable Rings"
DESCRIPTION = "The Modules package provides ring independent homological algebra \
functionality for the abelian category of finitely presented modules \
over computable rings."
LICENSE = "GPL-2.0-only"

PV = "2026.04.01"

RPM_NAME = "gap-modules-2026.04.01-1.2.noarch.rpm"
RPM_HASH = "7d05a2be7d0a1119a62658bbc9c1cc739c69f72b08f8a04bf9249160a0d386376ecc36f6930b81992472915e4f441beb8363cf1b3d014ba5e6851794be15e7e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-modules"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
gap-gaussforhomalg \
gap-homalg \
gap-matricesforhomalg \
gap-toolsforhomalg"

inherit rpm
