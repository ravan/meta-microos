SUMMARY = "Variable M PLUS 2 Sans Serif font"
DESCRIPTION = "M PLUS 2 is a Sans Serif variable font, supporting GF Latin Plus \
glyph set with 5,700+ Kanjis for Japanese."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus2-variable-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "3c03d837818b5478aae36a400d5daff9293472d9a250d3db0d7aea4b0ee0167bb3102f351c7cbdb3a1f31b978163eda4ab4aa7ff397e44da23d57ca485d6c93d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus2-variable-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
