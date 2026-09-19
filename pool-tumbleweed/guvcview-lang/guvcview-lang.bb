SUMMARY = "Translations for package guvcview"
DESCRIPTION = "Provides translations for the 'guvcview' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "guvcview-lang-2.2.2-1.7.noarch.rpm"
RPM_HASH = "264fc296b0e793f6c25394bad9298c120b2e2e6e09172db4a190ab4bafa6fae43c46c258b56372b63d84f32697db0b74d00a5ae3df681428b152403e2c2e137b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guvcview-lang \
guvcview-lang-all \
locale-guvcview-bg \
locale-guvcview-bs \
locale-guvcview-cs \
locale-guvcview-da \
locale-guvcview-de \
locale-guvcview-en-AU \
locale-guvcview-es \
locale-guvcview-eu \
locale-guvcview-fr \
locale-guvcview-gl \
locale-guvcview-he \
locale-guvcview-hr \
locale-guvcview-it \
locale-guvcview-ja \
locale-guvcview-lv \
locale-guvcview-nl \
locale-guvcview-pl \
locale-guvcview-pt \
locale-guvcview-pt-BR \
locale-guvcview-ru \
locale-guvcview-si \
locale-guvcview-sr \
locale-guvcview-tr \
locale-guvcview-uk \
locale-guvcview-zh-TW"

RDEPENDS:${PN} += "guvcview"

inherit rpm
