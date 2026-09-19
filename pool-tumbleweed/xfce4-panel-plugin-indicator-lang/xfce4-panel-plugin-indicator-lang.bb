SUMMARY = "Translations for package xfce4-panel-plugin-indicator"
DESCRIPTION = "Provides translations for the 'xfce4-panel-plugin-indicator' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "xfce4-panel-plugin-indicator-lang-2.4.1-1.17.noarch.rpm"
RPM_HASH = "35151ff6f0c5f2d7721dd99521e6be54a2e16f8307e036f4dcca25e5bbdf72026558ba96ed9a59a920ab00e15ab005b7672f3ec1b4bb7c1563405ea8a73df7b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-panel-plugin-indicator-ar \
locale-xfce4-panel-plugin-indicator-ast \
locale-xfce4-panel-plugin-indicator-be \
locale-xfce4-panel-plugin-indicator-bg \
locale-xfce4-panel-plugin-indicator-ca \
locale-xfce4-panel-plugin-indicator-cs \
locale-xfce4-panel-plugin-indicator-da \
locale-xfce4-panel-plugin-indicator-de \
locale-xfce4-panel-plugin-indicator-el \
locale-xfce4-panel-plugin-indicator-en-AU \
locale-xfce4-panel-plugin-indicator-en-GB \
locale-xfce4-panel-plugin-indicator-es \
locale-xfce4-panel-plugin-indicator-eu \
locale-xfce4-panel-plugin-indicator-fi \
locale-xfce4-panel-plugin-indicator-fr \
locale-xfce4-panel-plugin-indicator-gl \
locale-xfce4-panel-plugin-indicator-he \
locale-xfce4-panel-plugin-indicator-hr \
locale-xfce4-panel-plugin-indicator-hu \
locale-xfce4-panel-plugin-indicator-id \
locale-xfce4-panel-plugin-indicator-is \
locale-xfce4-panel-plugin-indicator-it \
locale-xfce4-panel-plugin-indicator-ja \
locale-xfce4-panel-plugin-indicator-ko \
locale-xfce4-panel-plugin-indicator-lt \
locale-xfce4-panel-plugin-indicator-ms \
locale-xfce4-panel-plugin-indicator-nb \
locale-xfce4-panel-plugin-indicator-nl \
locale-xfce4-panel-plugin-indicator-oc \
locale-xfce4-panel-plugin-indicator-pl \
locale-xfce4-panel-plugin-indicator-pt \
locale-xfce4-panel-plugin-indicator-pt-BR \
locale-xfce4-panel-plugin-indicator-ro \
locale-xfce4-panel-plugin-indicator-ru \
locale-xfce4-panel-plugin-indicator-sk \
locale-xfce4-panel-plugin-indicator-sl \
locale-xfce4-panel-plugin-indicator-sq \
locale-xfce4-panel-plugin-indicator-sr \
locale-xfce4-panel-plugin-indicator-sv \
locale-xfce4-panel-plugin-indicator-th \
locale-xfce4-panel-plugin-indicator-tr \
locale-xfce4-panel-plugin-indicator-ug \
locale-xfce4-panel-plugin-indicator-uk \
locale-xfce4-panel-plugin-indicator-zh-CN \
locale-xfce4-panel-plugin-indicator-zh-TW \
xfce4-panel-plugin-indicator-lang \
xfce4-panel-plugin-indicator-lang-all"

RDEPENDS:${PN} += "xfce4-panel-plugin-indicator"

inherit rpm
