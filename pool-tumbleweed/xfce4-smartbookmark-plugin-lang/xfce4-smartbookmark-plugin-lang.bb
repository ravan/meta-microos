SUMMARY = "Translations for package xfce4-smartbookmark-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-smartbookmark-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "xfce4-smartbookmark-plugin-lang-0.6.0-1.4.noarch.rpm"
RPM_HASH = "787219d06bab20ba78dced0f083f5c87160a66948bda9357d04c3f8d08f8871d5fd745e7325f00ac1ea2261fa47f1f98484d4fcb04737e356f049b2476f87857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-smartbookmark-plugin-ar \
locale-xfce4-smartbookmark-plugin-be \
locale-xfce4-smartbookmark-plugin-bg \
locale-xfce4-smartbookmark-plugin-ca \
locale-xfce4-smartbookmark-plugin-cs \
locale-xfce4-smartbookmark-plugin-da \
locale-xfce4-smartbookmark-plugin-de \
locale-xfce4-smartbookmark-plugin-el \
locale-xfce4-smartbookmark-plugin-en-AU \
locale-xfce4-smartbookmark-plugin-en-CA \
locale-xfce4-smartbookmark-plugin-en-GB \
locale-xfce4-smartbookmark-plugin-es \
locale-xfce4-smartbookmark-plugin-et \
locale-xfce4-smartbookmark-plugin-eu \
locale-xfce4-smartbookmark-plugin-fi \
locale-xfce4-smartbookmark-plugin-fr \
locale-xfce4-smartbookmark-plugin-gl \
locale-xfce4-smartbookmark-plugin-he \
locale-xfce4-smartbookmark-plugin-hi \
locale-xfce4-smartbookmark-plugin-hr \
locale-xfce4-smartbookmark-plugin-hu \
locale-xfce4-smartbookmark-plugin-id \
locale-xfce4-smartbookmark-plugin-is \
locale-xfce4-smartbookmark-plugin-it \
locale-xfce4-smartbookmark-plugin-ja \
locale-xfce4-smartbookmark-plugin-ko \
locale-xfce4-smartbookmark-plugin-lt \
locale-xfce4-smartbookmark-plugin-lv \
locale-xfce4-smartbookmark-plugin-ms \
locale-xfce4-smartbookmark-plugin-nb \
locale-xfce4-smartbookmark-plugin-nl \
locale-xfce4-smartbookmark-plugin-oc \
locale-xfce4-smartbookmark-plugin-pl \
locale-xfce4-smartbookmark-plugin-pt \
locale-xfce4-smartbookmark-plugin-pt-BR \
locale-xfce4-smartbookmark-plugin-ro \
locale-xfce4-smartbookmark-plugin-ru \
locale-xfce4-smartbookmark-plugin-sk \
locale-xfce4-smartbookmark-plugin-sl \
locale-xfce4-smartbookmark-plugin-sq \
locale-xfce4-smartbookmark-plugin-sr \
locale-xfce4-smartbookmark-plugin-sv \
locale-xfce4-smartbookmark-plugin-th \
locale-xfce4-smartbookmark-plugin-tr \
locale-xfce4-smartbookmark-plugin-ug \
locale-xfce4-smartbookmark-plugin-uk \
locale-xfce4-smartbookmark-plugin-zh-CN \
locale-xfce4-smartbookmark-plugin-zh-TW \
xfce4-panel-plugin-smartbookmark-lang \
xfce4-smartbookmark-plugin-lang \
xfce4-smartbookmark-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-smartbookmark-plugin"

inherit rpm
