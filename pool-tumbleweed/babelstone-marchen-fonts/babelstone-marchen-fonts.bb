SUMMARY = "BabelStone Font for Marchen script"
DESCRIPTION = "BabelStone Marchen is a font for the sMar-chen script, which is based \
on the deprecated experimental BabelStone Tibetan sMar-chen font. This \
font uses the encoding specified by Unicode for Marchen script."
LICENSE = "OFL-1.1"

PV = "9.003"

RPM_NAME = "babelstone-marchen-fonts-9.003-1.9.noarch.rpm"
RPM_HASH = "563519c6db96397bca18ed4dc0aad1172e49d02d1cfaa0a39c17cd6adf77b6adf9ad49ec4f5e98e786301935df62fef4778c7b4fed156e53b8106fccf11486da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-marchen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
