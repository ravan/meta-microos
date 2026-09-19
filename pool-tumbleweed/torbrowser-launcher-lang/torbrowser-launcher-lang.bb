SUMMARY = "Translations for package torbrowser-launcher"
DESCRIPTION = "Provides translations for the 'torbrowser-launcher' package."
LICENSE = "MIT"

PV = "0.3.9"

RPM_NAME = "torbrowser-launcher-lang-0.3.9-1.3.noarch.rpm"
RPM_HASH = "a33cd9385b874bea73247e527a33e946178917bfe0c9f647df5fe3437be71e7aa65a50dc5a18e63c37eadab3a25c1a7645533fc05c6dc0036fb1ae3a05355f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-torbrowser-launcher-be \
locale-torbrowser-launcher-cs \
locale-torbrowser-launcher-da \
locale-torbrowser-launcher-de \
locale-torbrowser-launcher-fr \
locale-torbrowser-launcher-hr \
locale-torbrowser-launcher-hu \
locale-torbrowser-launcher-nl \
locale-torbrowser-launcher-pl \
locale-torbrowser-launcher-pt-BR \
locale-torbrowser-launcher-ru \
locale-torbrowser-launcher-sv \
locale-torbrowser-launcher-tr \
locale-torbrowser-launcher-zh-TW \
torbrowser-launcher-lang \
torbrowser-launcher-lang-all"

RDEPENDS:${PN} += "torbrowser-launcher"

inherit rpm
