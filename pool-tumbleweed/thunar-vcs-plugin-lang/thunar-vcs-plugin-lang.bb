SUMMARY = "Translations for package thunar-vcs-plugin"
DESCRIPTION = "Provides translations for the 'thunar-vcs-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "thunar-vcs-plugin-lang-0.4.0-1.5.noarch.rpm"
RPM_HASH = "9ae2b552cc03ae63d4878ba7d22c0ba43b6d496e364d7d7fc9976ac5c522395f25d241815ae9a97317865d871dfba457693a39062ced848a32261bd66776b22d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-vcs-plugin-ar \
locale-thunar-vcs-plugin-be \
locale-thunar-vcs-plugin-bg \
locale-thunar-vcs-plugin-ca \
locale-thunar-vcs-plugin-cs \
locale-thunar-vcs-plugin-da \
locale-thunar-vcs-plugin-de \
locale-thunar-vcs-plugin-el \
locale-thunar-vcs-plugin-en-AU \
locale-thunar-vcs-plugin-en-GB \
locale-thunar-vcs-plugin-es \
locale-thunar-vcs-plugin-eu \
locale-thunar-vcs-plugin-fi \
locale-thunar-vcs-plugin-fr \
locale-thunar-vcs-plugin-gl \
locale-thunar-vcs-plugin-he \
locale-thunar-vcs-plugin-hr \
locale-thunar-vcs-plugin-hu \
locale-thunar-vcs-plugin-id \
locale-thunar-vcs-plugin-is \
locale-thunar-vcs-plugin-it \
locale-thunar-vcs-plugin-ko \
locale-thunar-vcs-plugin-lt \
locale-thunar-vcs-plugin-lv \
locale-thunar-vcs-plugin-ms \
locale-thunar-vcs-plugin-nb \
locale-thunar-vcs-plugin-nl \
locale-thunar-vcs-plugin-oc \
locale-thunar-vcs-plugin-pl \
locale-thunar-vcs-plugin-pt \
locale-thunar-vcs-plugin-pt-BR \
locale-thunar-vcs-plugin-ro \
locale-thunar-vcs-plugin-ru \
locale-thunar-vcs-plugin-sk \
locale-thunar-vcs-plugin-sl \
locale-thunar-vcs-plugin-sq \
locale-thunar-vcs-plugin-sr \
locale-thunar-vcs-plugin-sv \
locale-thunar-vcs-plugin-th \
locale-thunar-vcs-plugin-tr \
locale-thunar-vcs-plugin-ug \
locale-thunar-vcs-plugin-uk \
locale-thunar-vcs-plugin-zh-CN \
locale-thunar-vcs-plugin-zh-TW \
thunar-vcs-plugin-lang \
thunar-vcs-plugin-lang-all"

RDEPENDS:${PN} += "thunar-vcs-plugin"

inherit rpm
