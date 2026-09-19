SUMMARY = "Translations for package xfce4-timer-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-timer-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "xfce4-timer-plugin-lang-1.8.0-1.4.noarch.rpm"
RPM_HASH = "51b40c59fbc03ae1b80565d10d42c5e9748fb6f3eeeb07359f3ab75987e4881ff46f7a9342bb58a272c547c6c1dbb75d1a64deb2ad65c0a3928a5fdd6403cb94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-timer-plugin-ar \
locale-xfce4-timer-plugin-ast \
locale-xfce4-timer-plugin-be \
locale-xfce4-timer-plugin-bg \
locale-xfce4-timer-plugin-ca \
locale-xfce4-timer-plugin-cs \
locale-xfce4-timer-plugin-da \
locale-xfce4-timer-plugin-de \
locale-xfce4-timer-plugin-el \
locale-xfce4-timer-plugin-en-AU \
locale-xfce4-timer-plugin-en-GB \
locale-xfce4-timer-plugin-eo \
locale-xfce4-timer-plugin-es \
locale-xfce4-timer-plugin-et \
locale-xfce4-timer-plugin-eu \
locale-xfce4-timer-plugin-fi \
locale-xfce4-timer-plugin-fr \
locale-xfce4-timer-plugin-gl \
locale-xfce4-timer-plugin-he \
locale-xfce4-timer-plugin-hr \
locale-xfce4-timer-plugin-hu \
locale-xfce4-timer-plugin-id \
locale-xfce4-timer-plugin-is \
locale-xfce4-timer-plugin-it \
locale-xfce4-timer-plugin-ja \
locale-xfce4-timer-plugin-ko \
locale-xfce4-timer-plugin-lt \
locale-xfce4-timer-plugin-lv \
locale-xfce4-timer-plugin-ms \
locale-xfce4-timer-plugin-nb \
locale-xfce4-timer-plugin-nl \
locale-xfce4-timer-plugin-oc \
locale-xfce4-timer-plugin-pl \
locale-xfce4-timer-plugin-pt \
locale-xfce4-timer-plugin-pt-BR \
locale-xfce4-timer-plugin-ro \
locale-xfce4-timer-plugin-ru \
locale-xfce4-timer-plugin-sk \
locale-xfce4-timer-plugin-sl \
locale-xfce4-timer-plugin-sq \
locale-xfce4-timer-plugin-sr \
locale-xfce4-timer-plugin-sv \
locale-xfce4-timer-plugin-th \
locale-xfce4-timer-plugin-tr \
locale-xfce4-timer-plugin-ug \
locale-xfce4-timer-plugin-uk \
locale-xfce4-timer-plugin-zh-CN \
locale-xfce4-timer-plugin-zh-TW \
xfce4-panel-plugin-timer-lang \
xfce4-timer-plugin-lang \
xfce4-timer-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-timer-plugin"

inherit rpm
