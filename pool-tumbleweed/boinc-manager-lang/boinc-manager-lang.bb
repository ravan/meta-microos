SUMMARY = "Translations for package boinc-manager"
DESCRIPTION = "Provides translations for the 'boinc-manager' package."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "8.2.15"

RPM_NAME = "boinc-manager-lang-8.2.15-2.1.noarch.rpm"
RPM_HASH = "a4e0612998761476d3f3a7422cab7324d7db82722fc99f385301999b733070085ab8d014a3b1ac92fe5ef5afa39a457a54196d62bc0fd376f9f84d0589aa627c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boinc-manager-lang \
boinc-manager-lang-all \
locale-boinc-manager-bg \
locale-boinc-manager-ca \
locale-boinc-manager-cs \
locale-boinc-manager-da \
locale-boinc-manager-de \
locale-boinc-manager-es \
locale-boinc-manager-fi \
locale-boinc-manager-fr \
locale-boinc-manager-he \
locale-boinc-manager-hu \
locale-boinc-manager-it-IT \
locale-boinc-manager-ja \
locale-boinc-manager-ka \
locale-boinc-manager-ko \
locale-boinc-manager-lv \
locale-boinc-manager-nb \
locale-boinc-manager-nl \
locale-boinc-manager-pl \
locale-boinc-manager-pt-BR \
locale-boinc-manager-ro \
locale-boinc-manager-ru \
locale-boinc-manager-sk \
locale-boinc-manager-sv \
locale-boinc-manager-tr \
locale-boinc-manager-uk \
locale-boinc-manager-zh-CN \
locale-boinc-manager-zh-TW"

RDEPENDS:${PN} += "boinc-manager"

inherit rpm
