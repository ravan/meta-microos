SUMMARY = "Translations for package mailimporter"
DESCRIPTION = "Provides translations for the 'mailimporter' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "mailimporter-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "c725b587012aac3b559deb4be8c9e7f7f8df92fb0674ad525781f9fea963a6c48c3ff27e4202a5d9de8319a0f8b60dab799a669828b733f1dc46735156cc97c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mailimporter-af \
locale-mailimporter-ar \
locale-mailimporter-ast \
locale-mailimporter-be \
locale-mailimporter-bg \
locale-mailimporter-br \
locale-mailimporter-bs \
locale-mailimporter-ca \
locale-mailimporter-ca@valencia \
locale-mailimporter-cs \
locale-mailimporter-cy \
locale-mailimporter-da \
locale-mailimporter-de \
locale-mailimporter-el \
locale-mailimporter-en-GB \
locale-mailimporter-eo \
locale-mailimporter-es \
locale-mailimporter-et \
locale-mailimporter-eu \
locale-mailimporter-fa \
locale-mailimporter-fi \
locale-mailimporter-fr \
locale-mailimporter-ga \
locale-mailimporter-gl \
locale-mailimporter-he \
locale-mailimporter-hi \
locale-mailimporter-hr \
locale-mailimporter-hu \
locale-mailimporter-ia \
locale-mailimporter-is \
locale-mailimporter-it \
locale-mailimporter-ja \
locale-mailimporter-ka \
locale-mailimporter-kk \
locale-mailimporter-km \
locale-mailimporter-ko \
locale-mailimporter-lt \
locale-mailimporter-lv \
locale-mailimporter-mai \
locale-mailimporter-mk \
locale-mailimporter-mr \
locale-mailimporter-ms \
locale-mailimporter-nb \
locale-mailimporter-nds \
locale-mailimporter-ne \
locale-mailimporter-nl \
locale-mailimporter-nn \
locale-mailimporter-pa \
locale-mailimporter-pl \
locale-mailimporter-pt \
locale-mailimporter-pt-BR \
locale-mailimporter-ro \
locale-mailimporter-ru \
locale-mailimporter-sk \
locale-mailimporter-sl \
locale-mailimporter-sq \
locale-mailimporter-sr \
locale-mailimporter-sr@ijekavian \
locale-mailimporter-sr@ijekavianlatin \
locale-mailimporter-sr@latin \
locale-mailimporter-sv \
locale-mailimporter-ta \
locale-mailimporter-th \
locale-mailimporter-tr \
locale-mailimporter-ug \
locale-mailimporter-uk \
locale-mailimporter-zh-CN \
locale-mailimporter-zh-TW \
mailimporter-lang \
mailimporter-lang-all"

RDEPENDS:${PN} += "mailimporter"

inherit rpm
