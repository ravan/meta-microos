SUMMARY = "Translations for package kollision"
DESCRIPTION = "Provides translations for the 'kollision' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kollision-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "03fff2986d9d010cd8c3ca43810bb3cc25fbec83f7d0df2359e03c62370e13adeb9f92d5e9f9a1d9ff05d892ca153856331cfadb37a0c800c60b3a8b7f601101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kollision-lang \
kollision-lang-all \
locale-kollision-ar \
locale-kollision-ast \
locale-kollision-bs \
locale-kollision-ca \
locale-kollision-ca@valencia \
locale-kollision-cs \
locale-kollision-da \
locale-kollision-de \
locale-kollision-el \
locale-kollision-en-GB \
locale-kollision-eo \
locale-kollision-es \
locale-kollision-et \
locale-kollision-eu \
locale-kollision-fi \
locale-kollision-fr \
locale-kollision-ga \
locale-kollision-gl \
locale-kollision-gu \
locale-kollision-he \
locale-kollision-hi \
locale-kollision-hr \
locale-kollision-hu \
locale-kollision-ia \
locale-kollision-id \
locale-kollision-is \
locale-kollision-it \
locale-kollision-ja \
locale-kollision-ka \
locale-kollision-kk \
locale-kollision-km \
locale-kollision-ko \
locale-kollision-lt \
locale-kollision-lv \
locale-kollision-mai \
locale-kollision-ml \
locale-kollision-mr \
locale-kollision-nb \
locale-kollision-nds \
locale-kollision-nl \
locale-kollision-nn \
locale-kollision-pa \
locale-kollision-pl \
locale-kollision-pt \
locale-kollision-pt-BR \
locale-kollision-ro \
locale-kollision-ru \
locale-kollision-sk \
locale-kollision-sl \
locale-kollision-sq \
locale-kollision-sr \
locale-kollision-sr@ijekavian \
locale-kollision-sr@ijekavianlatin \
locale-kollision-sr@latin \
locale-kollision-sv \
locale-kollision-th \
locale-kollision-tr \
locale-kollision-ug \
locale-kollision-uk \
locale-kollision-zh-CN \
locale-kollision-zh-TW"

RDEPENDS:${PN} += "kollision"

inherit rpm
