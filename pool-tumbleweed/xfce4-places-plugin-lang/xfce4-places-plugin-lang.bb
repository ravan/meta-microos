SUMMARY = "Translations for package xfce4-places-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-places-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "xfce4-places-plugin-lang-1.9.0-1.4.noarch.rpm"
RPM_HASH = "5fc130481a6e876934451eecc52f45174fb8abbfa2de57f7a5b419b125998ea010e8b9ef8e13d02d2439d2ae0abf6d9fb3478bdd6e1b7f610e21b5aac86463df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-places-plugin-ar \
locale-xfce4-places-plugin-be \
locale-xfce4-places-plugin-bg \
locale-xfce4-places-plugin-ca \
locale-xfce4-places-plugin-cs \
locale-xfce4-places-plugin-da \
locale-xfce4-places-plugin-de \
locale-xfce4-places-plugin-el \
locale-xfce4-places-plugin-en-AU \
locale-xfce4-places-plugin-en-GB \
locale-xfce4-places-plugin-es \
locale-xfce4-places-plugin-et \
locale-xfce4-places-plugin-eu \
locale-xfce4-places-plugin-fi \
locale-xfce4-places-plugin-fr \
locale-xfce4-places-plugin-gl \
locale-xfce4-places-plugin-he \
locale-xfce4-places-plugin-hr \
locale-xfce4-places-plugin-hu \
locale-xfce4-places-plugin-id \
locale-xfce4-places-plugin-is \
locale-xfce4-places-plugin-it \
locale-xfce4-places-plugin-ja \
locale-xfce4-places-plugin-ko \
locale-xfce4-places-plugin-lt \
locale-xfce4-places-plugin-lv \
locale-xfce4-places-plugin-ms \
locale-xfce4-places-plugin-nb \
locale-xfce4-places-plugin-nl \
locale-xfce4-places-plugin-oc \
locale-xfce4-places-plugin-pa \
locale-xfce4-places-plugin-pl \
locale-xfce4-places-plugin-pt \
locale-xfce4-places-plugin-pt-BR \
locale-xfce4-places-plugin-ro \
locale-xfce4-places-plugin-ru \
locale-xfce4-places-plugin-sk \
locale-xfce4-places-plugin-sl \
locale-xfce4-places-plugin-sq \
locale-xfce4-places-plugin-sr \
locale-xfce4-places-plugin-sv \
locale-xfce4-places-plugin-th \
locale-xfce4-places-plugin-tr \
locale-xfce4-places-plugin-ug \
locale-xfce4-places-plugin-uk \
locale-xfce4-places-plugin-vi \
locale-xfce4-places-plugin-zh-CN \
locale-xfce4-places-plugin-zh-TW \
xfce4-panel-plugin-places-lang \
xfce4-places-plugin-lang \
xfce4-places-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-places-plugin"

inherit rpm
