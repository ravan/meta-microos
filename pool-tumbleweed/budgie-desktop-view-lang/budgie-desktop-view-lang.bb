SUMMARY = "Translations for package budgie-desktop-view"
DESCRIPTION = "Provides translations for the 'budgie-desktop-view' package."
LICENSE = "Apache-2.0"

PV = "10.10.0+0"

RPM_NAME = "budgie-desktop-view-lang-10.10.0+0-1.3.noarch.rpm"
RPM_HASH = "188ed2c0d32d33d843da69fe917d41080a168f69338b78a33e70fd8445affe41e21cb0aa91c1224f7af6fb49379d0fdb7c6fb25f60f2fdd462ae02e674466d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-view-lang \
budgie-desktop-view-lang-all \
locale-budgie-desktop-view-cs \
locale-budgie-desktop-view-en-GB \
locale-budgie-desktop-view-en-US \
locale-budgie-desktop-view-es \
locale-budgie-desktop-view-es-MX \
locale-budgie-desktop-view-fr \
locale-budgie-desktop-view-he \
locale-budgie-desktop-view-ja \
locale-budgie-desktop-view-ka \
locale-budgie-desktop-view-ko \
locale-budgie-desktop-view-lt \
locale-budgie-desktop-view-oc \
locale-budgie-desktop-view-pt-BR \
locale-budgie-desktop-view-pt-PT \
locale-budgie-desktop-view-ru \
locale-budgie-desktop-view-sq \
locale-budgie-desktop-view-tr \
locale-budgie-desktop-view-uk \
locale-budgie-desktop-view-zh \
locale-budgie-desktop-view-zh-CN"

RDEPENDS:${PN} += "budgie-desktop-view"

inherit rpm
