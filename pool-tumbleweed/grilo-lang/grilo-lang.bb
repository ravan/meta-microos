SUMMARY = "Translations for package grilo"
DESCRIPTION = "Provides translations for the 'grilo' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "grilo-lang-0.3.19-2.5.noarch.rpm"
RPM_HASH = "005af091bfc8add1deac1883063c61667283e5d39655524ed5941fbd54655695f6cfa01713c0aa7bea9d55dcd2654640e49480e6662891b6ca3686a0788d5274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grilo-lang \
grilo-lang-all \
locale-grilo-as \
locale-grilo-be \
locale-grilo-bg \
locale-grilo-bs \
locale-grilo-ca \
locale-grilo-ca@valencia \
locale-grilo-cs \
locale-grilo-da \
locale-grilo-de \
locale-grilo-el \
locale-grilo-en-GB \
locale-grilo-eo \
locale-grilo-es \
locale-grilo-eu \
locale-grilo-fa \
locale-grilo-fi \
locale-grilo-fr \
locale-grilo-fur \
locale-grilo-gl \
locale-grilo-he \
locale-grilo-hi \
locale-grilo-hr \
locale-grilo-hu \
locale-grilo-id \
locale-grilo-it \
locale-grilo-ja \
locale-grilo-ka \
locale-grilo-ko \
locale-grilo-lt \
locale-grilo-lv \
locale-grilo-ml \
locale-grilo-ms \
locale-grilo-nb \
locale-grilo-ne \
locale-grilo-nl \
locale-grilo-oc \
locale-grilo-pa \
locale-grilo-pl \
locale-grilo-pt \
locale-grilo-pt-BR \
locale-grilo-ro \
locale-grilo-ru \
locale-grilo-sk \
locale-grilo-sl \
locale-grilo-sr \
locale-grilo-sr@latin \
locale-grilo-sv \
locale-grilo-th \
locale-grilo-tr \
locale-grilo-uk \
locale-grilo-zh-CN \
locale-grilo-zh-HK \
locale-grilo-zh-TW"

RDEPENDS:${PN} += "grilo"

inherit rpm
