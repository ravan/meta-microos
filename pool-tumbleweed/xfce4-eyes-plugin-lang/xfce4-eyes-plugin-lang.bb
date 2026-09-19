SUMMARY = "Translations for package xfce4-eyes-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-eyes-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.7.0"

RPM_NAME = "xfce4-eyes-plugin-lang-4.7.0-1.4.noarch.rpm"
RPM_HASH = "caedf09c780dba8edb4053cbd1a53adbfb57c8ccf10f18f7c65b98c6623839f3f3ae7b211c3d211b713d28c77d473b991648d8ab30a3d4a78b143dfbf7eb4208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-eyes-plugin-ar \
locale-xfce4-eyes-plugin-ast \
locale-xfce4-eyes-plugin-be \
locale-xfce4-eyes-plugin-bg \
locale-xfce4-eyes-plugin-ca \
locale-xfce4-eyes-plugin-cs \
locale-xfce4-eyes-plugin-da \
locale-xfce4-eyes-plugin-de \
locale-xfce4-eyes-plugin-el \
locale-xfce4-eyes-plugin-en-AU \
locale-xfce4-eyes-plugin-en-CA \
locale-xfce4-eyes-plugin-en-GB \
locale-xfce4-eyes-plugin-eo \
locale-xfce4-eyes-plugin-es \
locale-xfce4-eyes-plugin-et \
locale-xfce4-eyes-plugin-eu \
locale-xfce4-eyes-plugin-fi \
locale-xfce4-eyes-plugin-fr \
locale-xfce4-eyes-plugin-ga \
locale-xfce4-eyes-plugin-gl \
locale-xfce4-eyes-plugin-he \
locale-xfce4-eyes-plugin-hi \
locale-xfce4-eyes-plugin-hr \
locale-xfce4-eyes-plugin-hu \
locale-xfce4-eyes-plugin-id \
locale-xfce4-eyes-plugin-is \
locale-xfce4-eyes-plugin-it \
locale-xfce4-eyes-plugin-ja \
locale-xfce4-eyes-plugin-kk \
locale-xfce4-eyes-plugin-ko \
locale-xfce4-eyes-plugin-lt \
locale-xfce4-eyes-plugin-lv \
locale-xfce4-eyes-plugin-ms \
locale-xfce4-eyes-plugin-nb \
locale-xfce4-eyes-plugin-nl \
locale-xfce4-eyes-plugin-oc \
locale-xfce4-eyes-plugin-pa \
locale-xfce4-eyes-plugin-pl \
locale-xfce4-eyes-plugin-pt \
locale-xfce4-eyes-plugin-pt-BR \
locale-xfce4-eyes-plugin-ro \
locale-xfce4-eyes-plugin-ru \
locale-xfce4-eyes-plugin-sk \
locale-xfce4-eyes-plugin-sl \
locale-xfce4-eyes-plugin-sq \
locale-xfce4-eyes-plugin-sr \
locale-xfce4-eyes-plugin-sv \
locale-xfce4-eyes-plugin-th \
locale-xfce4-eyes-plugin-tr \
locale-xfce4-eyes-plugin-ug \
locale-xfce4-eyes-plugin-uk \
locale-xfce4-eyes-plugin-vi \
locale-xfce4-eyes-plugin-zh-CN \
locale-xfce4-eyes-plugin-zh-TW \
xfce4-eyes-plugin-lang \
xfce4-eyes-plugin-lang-all \
xfce4-panel-plugin-eyes-lang"

RDEPENDS:${PN} += "xfce4-eyes-plugin"

inherit rpm
