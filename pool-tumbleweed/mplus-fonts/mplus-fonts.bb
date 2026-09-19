SUMMARY = "Font set incorporating all Kanji until level 2, and latin glyphs"
DESCRIPTION = "This is a metapackage containing the non-variable M PLUS 1/2 fonts."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "621d7fed42c88424e5012e57835f8a2bb1b23fd51b7f27189f9c2578ce96b22ccdfae2518ac4d647ac3c4d31b80b9adf31244055f6d25ea3b9d25f4ed83e2e14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus-fonts"

RDEPENDS:${PN} += "mplus1-fonts \
mplus2-fonts"

inherit rpm
