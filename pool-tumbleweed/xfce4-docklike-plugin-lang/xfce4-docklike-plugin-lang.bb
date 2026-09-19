SUMMARY = "Translations for package xfce4-docklike-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-docklike-plugin' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "xfce4-docklike-plugin-lang-0.5.1-1.2.noarch.rpm"
RPM_HASH = "316c1ca774dfb7f044c8fa9fb0f07b68a41d924da33f830ec06cafdf6ee4bc551493fb6d11e257785baae8cb329414098dbb8d6a0e1f1d7f07aed83810a1fa31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-docklike-plugin-bg \
locale-xfce4-docklike-plugin-ca \
locale-xfce4-docklike-plugin-cs \
locale-xfce4-docklike-plugin-da \
locale-xfce4-docklike-plugin-de \
locale-xfce4-docklike-plugin-el \
locale-xfce4-docklike-plugin-en-CA \
locale-xfce4-docklike-plugin-en-GB \
locale-xfce4-docklike-plugin-es \
locale-xfce4-docklike-plugin-et \
locale-xfce4-docklike-plugin-eu \
locale-xfce4-docklike-plugin-fi \
locale-xfce4-docklike-plugin-fr \
locale-xfce4-docklike-plugin-gl \
locale-xfce4-docklike-plugin-he \
locale-xfce4-docklike-plugin-hr \
locale-xfce4-docklike-plugin-id \
locale-xfce4-docklike-plugin-it \
locale-xfce4-docklike-plugin-ja \
locale-xfce4-docklike-plugin-kk \
locale-xfce4-docklike-plugin-ko \
locale-xfce4-docklike-plugin-lt \
locale-xfce4-docklike-plugin-nb \
locale-xfce4-docklike-plugin-nl \
locale-xfce4-docklike-plugin-oc \
locale-xfce4-docklike-plugin-pl \
locale-xfce4-docklike-plugin-pt \
locale-xfce4-docklike-plugin-pt-BR \
locale-xfce4-docklike-plugin-ro \
locale-xfce4-docklike-plugin-ru \
locale-xfce4-docklike-plugin-sk \
locale-xfce4-docklike-plugin-sl \
locale-xfce4-docklike-plugin-sq \
locale-xfce4-docklike-plugin-sr \
locale-xfce4-docklike-plugin-sv \
locale-xfce4-docklike-plugin-th \
locale-xfce4-docklike-plugin-tr \
locale-xfce4-docklike-plugin-ug \
locale-xfce4-docklike-plugin-uk \
locale-xfce4-docklike-plugin-vi \
locale-xfce4-docklike-plugin-zh-CN \
locale-xfce4-docklike-plugin-zh-TW \
xfce4-docklike-plugin-lang \
xfce4-docklike-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-docklike-plugin"

inherit rpm
