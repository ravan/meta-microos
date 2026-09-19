SUMMARY = "Translations for package ksquares"
DESCRIPTION = "Provides translations for the 'ksquares' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ksquares-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "f5335b9fe79e8ca010309c506c0c506a31a832984ab1db4e340605ab03d2bdb02256a4c468d55d4085203a1c6859e2ea02076e866a1f603b3b700108f19c25a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksquares-lang \
ksquares-lang-all \
locale-ksquares-ar \
locale-ksquares-ast \
locale-ksquares-be \
locale-ksquares-bs \
locale-ksquares-ca \
locale-ksquares-ca@valencia \
locale-ksquares-cs \
locale-ksquares-da \
locale-ksquares-de \
locale-ksquares-el \
locale-ksquares-en-GB \
locale-ksquares-eo \
locale-ksquares-es \
locale-ksquares-et \
locale-ksquares-eu \
locale-ksquares-fi \
locale-ksquares-fr \
locale-ksquares-ga \
locale-ksquares-gl \
locale-ksquares-he \
locale-ksquares-hi \
locale-ksquares-hr \
locale-ksquares-hu \
locale-ksquares-ia \
locale-ksquares-is \
locale-ksquares-it \
locale-ksquares-ja \
locale-ksquares-ka \
locale-ksquares-kk \
locale-ksquares-km \
locale-ksquares-ko \
locale-ksquares-lt \
locale-ksquares-lv \
locale-ksquares-mai \
locale-ksquares-ml \
locale-ksquares-mr \
locale-ksquares-nb \
locale-ksquares-nds \
locale-ksquares-nl \
locale-ksquares-nn \
locale-ksquares-oc \
locale-ksquares-pl \
locale-ksquares-pt \
locale-ksquares-pt-BR \
locale-ksquares-ro \
locale-ksquares-ru \
locale-ksquares-sk \
locale-ksquares-sl \
locale-ksquares-sq \
locale-ksquares-sr \
locale-ksquares-sr@ijekavian \
locale-ksquares-sr@ijekavianlatin \
locale-ksquares-sr@latin \
locale-ksquares-sv \
locale-ksquares-tr \
locale-ksquares-ug \
locale-ksquares-uk \
locale-ksquares-zh-CN \
locale-ksquares-zh-TW"

RDEPENDS:${PN} += "ksquares"

inherit rpm
