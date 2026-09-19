SUMMARY = "Translations for package xfce4-xkb-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-xkb-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "xfce4-xkb-plugin-lang-0.9.0-1.4.noarch.rpm"
RPM_HASH = "b91076876cd0fa1997812f3bcf6ac1ef9d3aa4d1cc9287413c4d6e31c669fc8cf8c3690ca95725943535262cd6b8716ac266965fa33608f0f9a2da11c98d93db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-xkb-plugin-ar \
locale-xfce4-xkb-plugin-be \
locale-xfce4-xkb-plugin-bg \
locale-xfce4-xkb-plugin-ca \
locale-xfce4-xkb-plugin-cs \
locale-xfce4-xkb-plugin-da \
locale-xfce4-xkb-plugin-de \
locale-xfce4-xkb-plugin-el \
locale-xfce4-xkb-plugin-en-AU \
locale-xfce4-xkb-plugin-en-CA \
locale-xfce4-xkb-plugin-en-GB \
locale-xfce4-xkb-plugin-es \
locale-xfce4-xkb-plugin-et \
locale-xfce4-xkb-plugin-eu \
locale-xfce4-xkb-plugin-fi \
locale-xfce4-xkb-plugin-fr \
locale-xfce4-xkb-plugin-gl \
locale-xfce4-xkb-plugin-he \
locale-xfce4-xkb-plugin-hr \
locale-xfce4-xkb-plugin-hu \
locale-xfce4-xkb-plugin-id \
locale-xfce4-xkb-plugin-is \
locale-xfce4-xkb-plugin-it \
locale-xfce4-xkb-plugin-ja \
locale-xfce4-xkb-plugin-ka \
locale-xfce4-xkb-plugin-ko \
locale-xfce4-xkb-plugin-lt \
locale-xfce4-xkb-plugin-lv \
locale-xfce4-xkb-plugin-ms \
locale-xfce4-xkb-plugin-nb \
locale-xfce4-xkb-plugin-nl \
locale-xfce4-xkb-plugin-oc \
locale-xfce4-xkb-plugin-pl \
locale-xfce4-xkb-plugin-pt \
locale-xfce4-xkb-plugin-pt-BR \
locale-xfce4-xkb-plugin-ro \
locale-xfce4-xkb-plugin-ru \
locale-xfce4-xkb-plugin-sk \
locale-xfce4-xkb-plugin-sl \
locale-xfce4-xkb-plugin-sq \
locale-xfce4-xkb-plugin-sr \
locale-xfce4-xkb-plugin-sv \
locale-xfce4-xkb-plugin-th \
locale-xfce4-xkb-plugin-tr \
locale-xfce4-xkb-plugin-ug \
locale-xfce4-xkb-plugin-uk \
locale-xfce4-xkb-plugin-zh-CN \
locale-xfce4-xkb-plugin-zh-TW \
xfce4-xkb-plugin-lang \
xfce4-xkb-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-xkb-plugin"

inherit rpm
