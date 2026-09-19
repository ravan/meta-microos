SUMMARY = "Translations for package boinc-client"
DESCRIPTION = "Provides translations for the 'boinc-client' package."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "8.2.15"

RPM_NAME = "boinc-client-lang-8.2.15-2.1.noarch.rpm"
RPM_HASH = "d2183ad9257c0e331f9d3a48b3bd2833d12b126fea91f431281a0be503dcc680c82f1edc012827d63fd780e584e93c1c6a91561342a11477cb6733d09492efa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boinc-client-lang \
boinc-client-lang-all \
locale-boinc-client-ar \
locale-boinc-client-bg \
locale-boinc-client-ca \
locale-boinc-client-cs \
locale-boinc-client-da \
locale-boinc-client-de \
locale-boinc-client-el \
locale-boinc-client-es \
locale-boinc-client-fi \
locale-boinc-client-fr \
locale-boinc-client-he \
locale-boinc-client-hu \
locale-boinc-client-it-IT \
locale-boinc-client-ja \
locale-boinc-client-ka \
locale-boinc-client-ko \
locale-boinc-client-lt \
locale-boinc-client-lv \
locale-boinc-client-nb \
locale-boinc-client-nl \
locale-boinc-client-pl \
locale-boinc-client-pt-BR \
locale-boinc-client-ro \
locale-boinc-client-ru \
locale-boinc-client-sk \
locale-boinc-client-sv \
locale-boinc-client-tr \
locale-boinc-client-uk \
locale-boinc-client-zh-CN \
locale-boinc-client-zh-TW"

RDEPENDS:${PN} += "boinc-client"

inherit rpm
