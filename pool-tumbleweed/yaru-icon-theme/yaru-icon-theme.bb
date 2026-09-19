SUMMARY = "Yaru icon theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the icon theme."
LICENSE = "CC-BY-SA-4.0"

PV = "24.04.0"

RPM_NAME = "yaru-icon-theme-24.04.0-1.9.noarch.rpm"
RPM_HASH = "02093defa2a7c2c880430359f7a232a7af3899eeb5f00685247614d14b3ecaab79815f6a69acac71153b735120191649143fef8f7b9a171974315acc6e7485e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yaru-icon-theme"

RDEPENDS:${PN} += "hicolor-icon-theme \
humanity-icon-theme"

inherit rpm
