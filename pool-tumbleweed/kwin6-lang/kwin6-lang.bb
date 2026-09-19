SUMMARY = "Translations for package kwin6"
DESCRIPTION = "Provides translations for the 'kwin6' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "kwin6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "822f23e8640ade03925034ed2866d933129bc514569b4b47696c2cf37fcd2977d2b59014d6f0e90c3d21fb656556189cb8b17331b475a0ea4b812b5f6f9884d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwin6-lang \
kwin6-lang-all \
locale-kwin6-af \
locale-kwin6-ar \
locale-kwin6-as \
locale-kwin6-ast \
locale-kwin6-az \
locale-kwin6-be \
locale-kwin6-be@latin \
locale-kwin6-bg \
locale-kwin6-bn \
locale-kwin6-bn-IN \
locale-kwin6-br \
locale-kwin6-bs \
locale-kwin6-ca \
locale-kwin6-ca@valencia \
locale-kwin6-cs \
locale-kwin6-cy \
locale-kwin6-da \
locale-kwin6-de \
locale-kwin6-el \
locale-kwin6-en-GB \
locale-kwin6-eo \
locale-kwin6-es \
locale-kwin6-et \
locale-kwin6-eu \
locale-kwin6-fa \
locale-kwin6-fi \
locale-kwin6-fr \
locale-kwin6-ga \
locale-kwin6-gl \
locale-kwin6-gu \
locale-kwin6-he \
locale-kwin6-hi \
locale-kwin6-hr \
locale-kwin6-hu \
locale-kwin6-ia \
locale-kwin6-id \
locale-kwin6-is \
locale-kwin6-it \
locale-kwin6-ja \
locale-kwin6-ka \
locale-kwin6-kk \
locale-kwin6-km \
locale-kwin6-kn \
locale-kwin6-ko \
locale-kwin6-lt \
locale-kwin6-lv \
locale-kwin6-mai \
locale-kwin6-mk \
locale-kwin6-ml \
locale-kwin6-mr \
locale-kwin6-ms \
locale-kwin6-nb \
locale-kwin6-nds \
locale-kwin6-ne \
locale-kwin6-nl \
locale-kwin6-nn \
locale-kwin6-oc \
locale-kwin6-or \
locale-kwin6-pa \
locale-kwin6-pl \
locale-kwin6-pt \
locale-kwin6-pt-BR \
locale-kwin6-ro \
locale-kwin6-ru \
locale-kwin6-si \
locale-kwin6-sk \
locale-kwin6-sl \
locale-kwin6-sq \
locale-kwin6-sr \
locale-kwin6-sr@ijekavian \
locale-kwin6-sr@ijekavianlatin \
locale-kwin6-sr@latin \
locale-kwin6-sv \
locale-kwin6-ta \
locale-kwin6-te \
locale-kwin6-th \
locale-kwin6-tr \
locale-kwin6-ug \
locale-kwin6-uk \
locale-kwin6-vi \
locale-kwin6-wa \
locale-kwin6-zh-CN \
locale-kwin6-zh-TW"

RDEPENDS:${PN} += "kwin6"

inherit rpm
