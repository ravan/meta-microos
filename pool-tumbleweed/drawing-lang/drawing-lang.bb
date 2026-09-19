SUMMARY = "Translations for package drawing"
DESCRIPTION = "Provides translations for the 'drawing' package."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "drawing-lang-1.0.2-1.10.noarch.rpm"
RPM_HASH = "040ff1de47a85b6f0137d13802d0f879a8047a2992e38cdd025a93f8e4993853a323e9ec0690274be28e98c5b81058f25efb48db665e358e5d899f978b7d7aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drawing-lang \
drawing-lang-all \
locale-drawing-ca \
locale-drawing-cs \
locale-drawing-da \
locale-drawing-de \
locale-drawing-es \
locale-drawing-eu \
locale-drawing-fi \
locale-drawing-fr \
locale-drawing-he \
locale-drawing-hi \
locale-drawing-hr \
locale-drawing-hu \
locale-drawing-id \
locale-drawing-it \
locale-drawing-ja \
locale-drawing-ko \
locale-drawing-nl \
locale-drawing-oc \
locale-drawing-pl \
locale-drawing-pt-BR \
locale-drawing-ru \
locale-drawing-sv \
locale-drawing-tr \
locale-drawing-zh-CN \
locale-drawing-zh-TW"

RDEPENDS:${PN} += "drawing"

inherit rpm
