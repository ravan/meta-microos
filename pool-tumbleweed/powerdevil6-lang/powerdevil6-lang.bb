SUMMARY = "Translations for package powerdevil6"
DESCRIPTION = "Provides translations for the 'powerdevil6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "powerdevil6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "7026281c1e3904a9131c0fd858c85265b13e0d3695c827b48781d9b8c0638a62477e954cd28939de7c868c5c711bcb9e6a2f823b9a0790d0133dd5c6b1454dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-powerdevil6-ar \
locale-powerdevil6-as \
locale-powerdevil6-ast \
locale-powerdevil6-az \
locale-powerdevil6-be \
locale-powerdevil6-be@latin \
locale-powerdevil6-bg \
locale-powerdevil6-bn \
locale-powerdevil6-bn-IN \
locale-powerdevil6-bs \
locale-powerdevil6-ca \
locale-powerdevil6-ca@valencia \
locale-powerdevil6-cs \
locale-powerdevil6-da \
locale-powerdevil6-de \
locale-powerdevil6-el \
locale-powerdevil6-en-GB \
locale-powerdevil6-eo \
locale-powerdevil6-es \
locale-powerdevil6-et \
locale-powerdevil6-eu \
locale-powerdevil6-fa \
locale-powerdevil6-fi \
locale-powerdevil6-fr \
locale-powerdevil6-ga \
locale-powerdevil6-gl \
locale-powerdevil6-gu \
locale-powerdevil6-he \
locale-powerdevil6-hi \
locale-powerdevil6-hr \
locale-powerdevil6-hu \
locale-powerdevil6-ia \
locale-powerdevil6-id \
locale-powerdevil6-is \
locale-powerdevil6-it \
locale-powerdevil6-ja \
locale-powerdevil6-ka \
locale-powerdevil6-kk \
locale-powerdevil6-km \
locale-powerdevil6-kn \
locale-powerdevil6-ko \
locale-powerdevil6-lt \
locale-powerdevil6-lv \
locale-powerdevil6-mai \
locale-powerdevil6-mk \
locale-powerdevil6-ml \
locale-powerdevil6-mr \
locale-powerdevil6-ms \
locale-powerdevil6-nb \
locale-powerdevil6-nds \
locale-powerdevil6-ne \
locale-powerdevil6-nl \
locale-powerdevil6-nn \
locale-powerdevil6-oc \
locale-powerdevil6-or \
locale-powerdevil6-pa \
locale-powerdevil6-pl \
locale-powerdevil6-pt \
locale-powerdevil6-pt-BR \
locale-powerdevil6-ro \
locale-powerdevil6-ru \
locale-powerdevil6-si \
locale-powerdevil6-sk \
locale-powerdevil6-sl \
locale-powerdevil6-sq \
locale-powerdevil6-sr \
locale-powerdevil6-sr@ijekavian \
locale-powerdevil6-sr@ijekavianlatin \
locale-powerdevil6-sr@latin \
locale-powerdevil6-sv \
locale-powerdevil6-ta \
locale-powerdevil6-te \
locale-powerdevil6-th \
locale-powerdevil6-tr \
locale-powerdevil6-ug \
locale-powerdevil6-uk \
locale-powerdevil6-vi \
locale-powerdevil6-wa \
locale-powerdevil6-zh-CN \
locale-powerdevil6-zh-TW \
powerdevil6-lang \
powerdevil6-lang-all"

RDEPENDS:${PN} += "powerdevil6"

inherit rpm
