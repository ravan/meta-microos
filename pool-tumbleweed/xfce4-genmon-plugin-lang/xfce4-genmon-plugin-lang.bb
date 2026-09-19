SUMMARY = "Translations for package xfce4-genmon-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-genmon-plugin' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "xfce4-genmon-plugin-lang-4.3.0-1.4.noarch.rpm"
RPM_HASH = "c7ae837a48ef7bfa1240b43b279b0fac4aa14a2bf4bd2d93d9eeccffd47bffae42cb4e4b7fcb9045d8aebbbe4537536d3c00792e4a426b4cbc80434269e3b65c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-genmon-plugin-ar \
locale-xfce4-genmon-plugin-be \
locale-xfce4-genmon-plugin-bg \
locale-xfce4-genmon-plugin-ca \
locale-xfce4-genmon-plugin-cs \
locale-xfce4-genmon-plugin-da \
locale-xfce4-genmon-plugin-de \
locale-xfce4-genmon-plugin-el \
locale-xfce4-genmon-plugin-en-AU \
locale-xfce4-genmon-plugin-en-CA \
locale-xfce4-genmon-plugin-en-GB \
locale-xfce4-genmon-plugin-es \
locale-xfce4-genmon-plugin-et \
locale-xfce4-genmon-plugin-eu \
locale-xfce4-genmon-plugin-fi \
locale-xfce4-genmon-plugin-fr \
locale-xfce4-genmon-plugin-gl \
locale-xfce4-genmon-plugin-he \
locale-xfce4-genmon-plugin-hi \
locale-xfce4-genmon-plugin-hr \
locale-xfce4-genmon-plugin-hu \
locale-xfce4-genmon-plugin-id \
locale-xfce4-genmon-plugin-is \
locale-xfce4-genmon-plugin-it \
locale-xfce4-genmon-plugin-ja \
locale-xfce4-genmon-plugin-ko \
locale-xfce4-genmon-plugin-lt \
locale-xfce4-genmon-plugin-lv \
locale-xfce4-genmon-plugin-ms \
locale-xfce4-genmon-plugin-nb \
locale-xfce4-genmon-plugin-nl \
locale-xfce4-genmon-plugin-oc \
locale-xfce4-genmon-plugin-pl \
locale-xfce4-genmon-plugin-pt \
locale-xfce4-genmon-plugin-pt-BR \
locale-xfce4-genmon-plugin-ro \
locale-xfce4-genmon-plugin-ru \
locale-xfce4-genmon-plugin-sk \
locale-xfce4-genmon-plugin-sl \
locale-xfce4-genmon-plugin-sq \
locale-xfce4-genmon-plugin-sr \
locale-xfce4-genmon-plugin-sv \
locale-xfce4-genmon-plugin-th \
locale-xfce4-genmon-plugin-tr \
locale-xfce4-genmon-plugin-ug \
locale-xfce4-genmon-plugin-uk \
locale-xfce4-genmon-plugin-zh-CN \
locale-xfce4-genmon-plugin-zh-TW \
xfce4-genmon-plugin-lang \
xfce4-genmon-plugin-lang-all \
xfce4-panel-plugin-genmon-lang"

RDEPENDS:${PN} += "xfce4-genmon-plugin"

inherit rpm
