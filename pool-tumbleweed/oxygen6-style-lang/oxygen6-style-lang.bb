SUMMARY = "Translations for package oxygen6-style"
DESCRIPTION = "Provides translations for the 'oxygen6-style' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "oxygen6-style-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "b625ce5452bf40a4e9a14bbea6034a772d9c3fe70872ab7d529c88316887ad5b6a120cf2dad24635280cde6edffb5643fb538acf919b4e80ad51ada6f05aa8b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-oxygen6-style-af \
locale-oxygen6-style-ar \
locale-oxygen6-style-ast \
locale-oxygen6-style-az \
locale-oxygen6-style-be \
locale-oxygen6-style-be@latin \
locale-oxygen6-style-bg \
locale-oxygen6-style-bn-IN \
locale-oxygen6-style-br \
locale-oxygen6-style-bs \
locale-oxygen6-style-ca \
locale-oxygen6-style-ca@valencia \
locale-oxygen6-style-cs \
locale-oxygen6-style-cy \
locale-oxygen6-style-da \
locale-oxygen6-style-de \
locale-oxygen6-style-el \
locale-oxygen6-style-en-GB \
locale-oxygen6-style-eo \
locale-oxygen6-style-es \
locale-oxygen6-style-et \
locale-oxygen6-style-eu \
locale-oxygen6-style-fa \
locale-oxygen6-style-fi \
locale-oxygen6-style-fr \
locale-oxygen6-style-ga \
locale-oxygen6-style-gl \
locale-oxygen6-style-gu \
locale-oxygen6-style-he \
locale-oxygen6-style-hi \
locale-oxygen6-style-hr \
locale-oxygen6-style-hu \
locale-oxygen6-style-ia \
locale-oxygen6-style-id \
locale-oxygen6-style-is \
locale-oxygen6-style-it \
locale-oxygen6-style-ja \
locale-oxygen6-style-ka \
locale-oxygen6-style-kk \
locale-oxygen6-style-km \
locale-oxygen6-style-kn \
locale-oxygen6-style-ko \
locale-oxygen6-style-lt \
locale-oxygen6-style-lv \
locale-oxygen6-style-mai \
locale-oxygen6-style-mk \
locale-oxygen6-style-ml \
locale-oxygen6-style-mr \
locale-oxygen6-style-ms \
locale-oxygen6-style-nb \
locale-oxygen6-style-nds \
locale-oxygen6-style-ne \
locale-oxygen6-style-nl \
locale-oxygen6-style-nn \
locale-oxygen6-style-or \
locale-oxygen6-style-pa \
locale-oxygen6-style-pl \
locale-oxygen6-style-pt \
locale-oxygen6-style-pt-BR \
locale-oxygen6-style-ro \
locale-oxygen6-style-ru \
locale-oxygen6-style-si \
locale-oxygen6-style-sk \
locale-oxygen6-style-sl \
locale-oxygen6-style-sq \
locale-oxygen6-style-sr \
locale-oxygen6-style-sr@ijekavian \
locale-oxygen6-style-sr@ijekavianlatin \
locale-oxygen6-style-sr@latin \
locale-oxygen6-style-sv \
locale-oxygen6-style-ta \
locale-oxygen6-style-te \
locale-oxygen6-style-th \
locale-oxygen6-style-tr \
locale-oxygen6-style-ug \
locale-oxygen6-style-uk \
locale-oxygen6-style-vi \
locale-oxygen6-style-wa \
locale-oxygen6-style-zh-CN \
locale-oxygen6-style-zh-TW \
oxygen6-style-lang \
oxygen6-style-lang-all"

RDEPENDS:${PN} += "oxygen6-style"

inherit rpm
