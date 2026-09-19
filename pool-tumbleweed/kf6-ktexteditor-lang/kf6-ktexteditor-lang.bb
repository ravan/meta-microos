SUMMARY = "Translations for package kf6-ktexteditor"
DESCRIPTION = "Provides translations for the 'kf6-ktexteditor' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-ktexteditor-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "3f2fff9af3a084c3fde67cf038db645fbbc96aa81c5318676e90c82d6faa9aea426f03060c43bdc8ed3b31fc0ca7e879db2454db3894a256ff1e6e9de4c9c95f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-ktexteditor-lang \
kf6-ktexteditor-lang-all \
locale-kf6-ktexteditor-af \
locale-kf6-ktexteditor-ar \
locale-kf6-ktexteditor-ast \
locale-kf6-ktexteditor-az \
locale-kf6-ktexteditor-be \
locale-kf6-ktexteditor-bg \
locale-kf6-ktexteditor-bn \
locale-kf6-ktexteditor-br \
locale-kf6-ktexteditor-bs \
locale-kf6-ktexteditor-ca \
locale-kf6-ktexteditor-ca@valencia \
locale-kf6-ktexteditor-cs \
locale-kf6-ktexteditor-cy \
locale-kf6-ktexteditor-da \
locale-kf6-ktexteditor-de \
locale-kf6-ktexteditor-el \
locale-kf6-ktexteditor-en-GB \
locale-kf6-ktexteditor-eo \
locale-kf6-ktexteditor-es \
locale-kf6-ktexteditor-et \
locale-kf6-ktexteditor-eu \
locale-kf6-ktexteditor-fa \
locale-kf6-ktexteditor-fi \
locale-kf6-ktexteditor-fr \
locale-kf6-ktexteditor-ga \
locale-kf6-ktexteditor-gl \
locale-kf6-ktexteditor-gu \
locale-kf6-ktexteditor-he \
locale-kf6-ktexteditor-hi \
locale-kf6-ktexteditor-hr \
locale-kf6-ktexteditor-hu \
locale-kf6-ktexteditor-ia \
locale-kf6-ktexteditor-id \
locale-kf6-ktexteditor-is \
locale-kf6-ktexteditor-it \
locale-kf6-ktexteditor-ja \
locale-kf6-ktexteditor-ka \
locale-kf6-ktexteditor-kk \
locale-kf6-ktexteditor-km \
locale-kf6-ktexteditor-ko \
locale-kf6-ktexteditor-lt \
locale-kf6-ktexteditor-lv \
locale-kf6-ktexteditor-mai \
locale-kf6-ktexteditor-mk \
locale-kf6-ktexteditor-ml \
locale-kf6-ktexteditor-mr \
locale-kf6-ktexteditor-ms \
locale-kf6-ktexteditor-nb \
locale-kf6-ktexteditor-nds \
locale-kf6-ktexteditor-ne \
locale-kf6-ktexteditor-nl \
locale-kf6-ktexteditor-nn \
locale-kf6-ktexteditor-oc \
locale-kf6-ktexteditor-pa \
locale-kf6-ktexteditor-pl \
locale-kf6-ktexteditor-pt \
locale-kf6-ktexteditor-pt-BR \
locale-kf6-ktexteditor-ro \
locale-kf6-ktexteditor-ru \
locale-kf6-ktexteditor-si \
locale-kf6-ktexteditor-sk \
locale-kf6-ktexteditor-sl \
locale-kf6-ktexteditor-sq \
locale-kf6-ktexteditor-sr \
locale-kf6-ktexteditor-sr@ijekavian \
locale-kf6-ktexteditor-sr@ijekavianlatin \
locale-kf6-ktexteditor-sr@latin \
locale-kf6-ktexteditor-sv \
locale-kf6-ktexteditor-ta \
locale-kf6-ktexteditor-th \
locale-kf6-ktexteditor-tr \
locale-kf6-ktexteditor-ug \
locale-kf6-ktexteditor-uk \
locale-kf6-ktexteditor-vi \
locale-kf6-ktexteditor-wa \
locale-kf6-ktexteditor-zh-CN \
locale-kf6-ktexteditor-zh-TW"

RDEPENDS:${PN} += "kf6-ktexteditor"

inherit rpm
