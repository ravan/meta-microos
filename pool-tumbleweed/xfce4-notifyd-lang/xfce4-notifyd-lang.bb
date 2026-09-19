SUMMARY = "Translations for package xfce4-notifyd"
DESCRIPTION = "Provides translations for the 'xfce4-notifyd' package."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "xfce4-notifyd-lang-0.9.7-1.7.noarch.rpm"
RPM_HASH = "234e8c04e4c4a76b72790b03907069f8daf2e11ec3d4c87c82bca3bb5d72f27892b56c2351f3ead61d295169c18d57d88f3e11b06f15d6e39f06d4f0f04e4c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-notifyd-ar \
locale-xfce4-notifyd-ast \
locale-xfce4-notifyd-be \
locale-xfce4-notifyd-bg \
locale-xfce4-notifyd-ca \
locale-xfce4-notifyd-cs \
locale-xfce4-notifyd-da \
locale-xfce4-notifyd-de \
locale-xfce4-notifyd-el \
locale-xfce4-notifyd-en-AU \
locale-xfce4-notifyd-en-GB \
locale-xfce4-notifyd-es \
locale-xfce4-notifyd-et \
locale-xfce4-notifyd-eu \
locale-xfce4-notifyd-fi \
locale-xfce4-notifyd-fr \
locale-xfce4-notifyd-gl \
locale-xfce4-notifyd-he \
locale-xfce4-notifyd-hr \
locale-xfce4-notifyd-hu \
locale-xfce4-notifyd-id \
locale-xfce4-notifyd-is \
locale-xfce4-notifyd-it \
locale-xfce4-notifyd-ja \
locale-xfce4-notifyd-ka \
locale-xfce4-notifyd-kk \
locale-xfce4-notifyd-ko \
locale-xfce4-notifyd-lt \
locale-xfce4-notifyd-lv \
locale-xfce4-notifyd-ms \
locale-xfce4-notifyd-nb \
locale-xfce4-notifyd-nl \
locale-xfce4-notifyd-oc \
locale-xfce4-notifyd-pa \
locale-xfce4-notifyd-pl \
locale-xfce4-notifyd-pt \
locale-xfce4-notifyd-pt-BR \
locale-xfce4-notifyd-ro \
locale-xfce4-notifyd-ru \
locale-xfce4-notifyd-si \
locale-xfce4-notifyd-sk \
locale-xfce4-notifyd-sl \
locale-xfce4-notifyd-sq \
locale-xfce4-notifyd-sr \
locale-xfce4-notifyd-sv \
locale-xfce4-notifyd-th \
locale-xfce4-notifyd-tr \
locale-xfce4-notifyd-ug \
locale-xfce4-notifyd-uk \
locale-xfce4-notifyd-vi \
locale-xfce4-notifyd-zh-CN \
locale-xfce4-notifyd-zh-TW \
xfce4-notifyd-lang \
xfce4-notifyd-lang-all"

RDEPENDS:${PN} += "xfce4-notifyd"

inherit rpm
