SUMMARY = "Translations for package gnucash"
DESCRIPTION = "Provides translations for the 'gnucash' package."
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "5.16"

RPM_NAME = "gnucash-lang-5.16-1.1.noarch.rpm"
RPM_HASH = "c42bb9676ee2df2bfa5a92f9fcdd640a7b638bb00a64eb4978e0b4dbbb08cf3db039baeb6e405e3889c3adfc4e5c8322d69357df003e6c83c4deff228952695b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnucash-lang \
gnucash-lang-all \
locale-gnucash-ar \
locale-gnucash-as \
locale-gnucash-az \
locale-gnucash-bg \
locale-gnucash-ca \
locale-gnucash-cs \
locale-gnucash-da \
locale-gnucash-de \
locale-gnucash-el \
locale-gnucash-en-AU \
locale-gnucash-en-GB \
locale-gnucash-en-NZ \
locale-gnucash-es \
locale-gnucash-es-NI \
locale-gnucash-et \
locale-gnucash-eu \
locale-gnucash-fa \
locale-gnucash-fi \
locale-gnucash-fr \
locale-gnucash-gu \
locale-gnucash-he \
locale-gnucash-hi \
locale-gnucash-hr \
locale-gnucash-hu \
locale-gnucash-id \
locale-gnucash-it \
locale-gnucash-ja \
locale-gnucash-kn \
locale-gnucash-ko \
locale-gnucash-lt \
locale-gnucash-lv \
locale-gnucash-mai \
locale-gnucash-mk \
locale-gnucash-mr \
locale-gnucash-nb \
locale-gnucash-ne \
locale-gnucash-nl \
locale-gnucash-pl \
locale-gnucash-pt \
locale-gnucash-pt-BR \
locale-gnucash-ro \
locale-gnucash-ru \
locale-gnucash-sk \
locale-gnucash-sr \
locale-gnucash-sv \
locale-gnucash-ta \
locale-gnucash-te \
locale-gnucash-tr \
locale-gnucash-uk \
locale-gnucash-vi \
locale-gnucash-zh-CN \
locale-gnucash-zh-TW"

RDEPENDS:${PN} += "gnucash"

inherit rpm
