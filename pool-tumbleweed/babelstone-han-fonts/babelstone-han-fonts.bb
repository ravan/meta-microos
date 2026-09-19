SUMMARY = "BabelStone font for Han Script"
DESCRIPTION = "BabelStone Han is a dual-width Unicode Han font in Song/Ming style \
with G-source glyphs used in the People's Republic of China."
LICENSE = "Arphic-1999"

PV = "16.0.3"

RPM_NAME = "babelstone-han-fonts-16.0.3-1.5.noarch.rpm"
RPM_HASH = "4c8dfb491f1a67bb469f3bf698215b76da61a99e9a49d88d72ff4fe672d111b909b6234f54bd18435da9259dc64abc1c50fd8ea3b2d2c537702ddab1413a427f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-han-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
