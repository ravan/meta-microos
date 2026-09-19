SUMMARY = "Translations for package xfce4-mailwatch-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-mailwatch-plugin' package."
LICENSE = "GPL-2.0-only"

PV = "1.4.0"

RPM_NAME = "xfce4-mailwatch-plugin-lang-1.4.0-1.4.noarch.rpm"
RPM_HASH = "ca3d1adca336a3dc0490e566326c2eaf29b534b4b3fcc8bdf51b9d0d8acfbc99618638d407e42ef4281218def7889020b514dd39dd4f4f40657654da4a14b51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-mailwatch-plugin-ar \
locale-xfce4-mailwatch-plugin-be \
locale-xfce4-mailwatch-plugin-bg \
locale-xfce4-mailwatch-plugin-ca \
locale-xfce4-mailwatch-plugin-cs \
locale-xfce4-mailwatch-plugin-da \
locale-xfce4-mailwatch-plugin-de \
locale-xfce4-mailwatch-plugin-el \
locale-xfce4-mailwatch-plugin-en-AU \
locale-xfce4-mailwatch-plugin-en-GB \
locale-xfce4-mailwatch-plugin-es \
locale-xfce4-mailwatch-plugin-eu \
locale-xfce4-mailwatch-plugin-fi \
locale-xfce4-mailwatch-plugin-fr \
locale-xfce4-mailwatch-plugin-gl \
locale-xfce4-mailwatch-plugin-he \
locale-xfce4-mailwatch-plugin-hr \
locale-xfce4-mailwatch-plugin-hu \
locale-xfce4-mailwatch-plugin-id \
locale-xfce4-mailwatch-plugin-is \
locale-xfce4-mailwatch-plugin-it \
locale-xfce4-mailwatch-plugin-ja \
locale-xfce4-mailwatch-plugin-ko \
locale-xfce4-mailwatch-plugin-lt \
locale-xfce4-mailwatch-plugin-lv \
locale-xfce4-mailwatch-plugin-ms \
locale-xfce4-mailwatch-plugin-nb \
locale-xfce4-mailwatch-plugin-nl \
locale-xfce4-mailwatch-plugin-oc \
locale-xfce4-mailwatch-plugin-pl \
locale-xfce4-mailwatch-plugin-pt \
locale-xfce4-mailwatch-plugin-pt-BR \
locale-xfce4-mailwatch-plugin-ro \
locale-xfce4-mailwatch-plugin-ru \
locale-xfce4-mailwatch-plugin-sk \
locale-xfce4-mailwatch-plugin-sl \
locale-xfce4-mailwatch-plugin-sq \
locale-xfce4-mailwatch-plugin-sr \
locale-xfce4-mailwatch-plugin-sv \
locale-xfce4-mailwatch-plugin-th \
locale-xfce4-mailwatch-plugin-tr \
locale-xfce4-mailwatch-plugin-ug \
locale-xfce4-mailwatch-plugin-uk \
locale-xfce4-mailwatch-plugin-vi \
locale-xfce4-mailwatch-plugin-zh-CN \
locale-xfce4-mailwatch-plugin-zh-TW \
xfce4-mailwatch-plugin-lang \
xfce4-mailwatch-plugin-lang-all \
xfce4-panel-plugin-mailwatch-lang"

RDEPENDS:${PN} += "xfce4-mailwatch-plugin"

inherit rpm
