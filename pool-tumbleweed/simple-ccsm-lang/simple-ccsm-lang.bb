SUMMARY = "Translations for package simple-ccsm"
DESCRIPTION = "Provides translations for the 'simple-ccsm' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "simple-ccsm-lang-0.8.18-2.21.noarch.rpm"
RPM_HASH = "72c21e66304a9742e61c40051d632fd08014dcebb5e76c8e73ef5c31f538c3c03061ed29238bf029a349e43a8f7871095c8680eb6c69ade5fae52eb8b7c1b176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-simple-ccsm-bg \
locale-simple-ccsm-ca \
locale-simple-ccsm-cs \
locale-simple-ccsm-da \
locale-simple-ccsm-de \
locale-simple-ccsm-el \
locale-simple-ccsm-en-GB \
locale-simple-ccsm-es \
locale-simple-ccsm-eu \
locale-simple-ccsm-fi \
locale-simple-ccsm-fr \
locale-simple-ccsm-gl \
locale-simple-ccsm-hu \
locale-simple-ccsm-it \
locale-simple-ccsm-ja \
locale-simple-ccsm-ko \
locale-simple-ccsm-nb \
locale-simple-ccsm-nl \
locale-simple-ccsm-pl \
locale-simple-ccsm-pt \
locale-simple-ccsm-pt-BR \
locale-simple-ccsm-ru \
locale-simple-ccsm-sk \
locale-simple-ccsm-sv \
locale-simple-ccsm-tr \
locale-simple-ccsm-zh-CN \
locale-simple-ccsm-zh-TW \
simple-ccsm-lang \
simple-ccsm-lang-all"

RDEPENDS:${PN} += "simple-ccsm"

inherit rpm
