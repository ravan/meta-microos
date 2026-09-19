SUMMARY = "Translations for package xfdashboard"
DESCRIPTION = "Provides translations for the 'xfdashboard' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "xfdashboard-lang-1.1.0-1.4.noarch.rpm"
RPM_HASH = "ba7e5a0eb8f5aca84c62e62e5c03d9e00fb0041e6072824de7c4961b84e0a12cf5654039ff690e0f1ef677e003e128a7d3ba3fc0e502de5da951dd159021a2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfdashboard-be \
locale-xfdashboard-bg \
locale-xfdashboard-ca \
locale-xfdashboard-cs \
locale-xfdashboard-da \
locale-xfdashboard-de \
locale-xfdashboard-el \
locale-xfdashboard-en-GB \
locale-xfdashboard-es \
locale-xfdashboard-et \
locale-xfdashboard-eu \
locale-xfdashboard-fr \
locale-xfdashboard-gl \
locale-xfdashboard-he \
locale-xfdashboard-id \
locale-xfdashboard-it \
locale-xfdashboard-it-IT \
locale-xfdashboard-ja \
locale-xfdashboard-kk \
locale-xfdashboard-ko \
locale-xfdashboard-lt \
locale-xfdashboard-nb \
locale-xfdashboard-nl \
locale-xfdashboard-oc \
locale-xfdashboard-pl \
locale-xfdashboard-pt \
locale-xfdashboard-pt-BR \
locale-xfdashboard-ro \
locale-xfdashboard-ru \
locale-xfdashboard-ru-RU \
locale-xfdashboard-sk \
locale-xfdashboard-sl \
locale-xfdashboard-sq \
locale-xfdashboard-sr \
locale-xfdashboard-sv \
locale-xfdashboard-tr \
locale-xfdashboard-uk \
locale-xfdashboard-zh-CN \
xfdashboard-lang \
xfdashboard-lang-all"

RDEPENDS:${PN} += "xfdashboard"

inherit rpm
