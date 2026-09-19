SUMMARY = "Translations for package libkleo"
DESCRIPTION = "Provides translations for the 'libkleo' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkleo-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "0b65dc85f8c80cbc60670dbbdcface03b4e423b96c18151061318c1b0cf9be8149df7ed1466e29cca8fb54176cc77aab052082821f4116ceba572221e3f93d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkleo-lang \
libkleo-lang-all \
locale-libkleo-ar \
locale-libkleo-ast \
locale-libkleo-be \
locale-libkleo-bg \
locale-libkleo-br \
locale-libkleo-bs \
locale-libkleo-ca \
locale-libkleo-ca@valencia \
locale-libkleo-cs \
locale-libkleo-cy \
locale-libkleo-da \
locale-libkleo-de \
locale-libkleo-el \
locale-libkleo-en-GB \
locale-libkleo-eo \
locale-libkleo-es \
locale-libkleo-et \
locale-libkleo-eu \
locale-libkleo-fa \
locale-libkleo-fi \
locale-libkleo-fr \
locale-libkleo-ga \
locale-libkleo-gl \
locale-libkleo-he \
locale-libkleo-hi \
locale-libkleo-hr \
locale-libkleo-hu \
locale-libkleo-ia \
locale-libkleo-is \
locale-libkleo-it \
locale-libkleo-ja \
locale-libkleo-ka \
locale-libkleo-kk \
locale-libkleo-km \
locale-libkleo-ko \
locale-libkleo-lt \
locale-libkleo-lv \
locale-libkleo-mai \
locale-libkleo-mk \
locale-libkleo-mr \
locale-libkleo-ms \
locale-libkleo-nb \
locale-libkleo-nds \
locale-libkleo-ne \
locale-libkleo-nl \
locale-libkleo-nn \
locale-libkleo-pa \
locale-libkleo-pl \
locale-libkleo-pt \
locale-libkleo-pt-BR \
locale-libkleo-ro \
locale-libkleo-ru \
locale-libkleo-sk \
locale-libkleo-sl \
locale-libkleo-sq \
locale-libkleo-sr \
locale-libkleo-sr@ijekavian \
locale-libkleo-sr@ijekavianlatin \
locale-libkleo-sr@latin \
locale-libkleo-sv \
locale-libkleo-ta \
locale-libkleo-tr \
locale-libkleo-ug \
locale-libkleo-uk \
locale-libkleo-zh-CN \
locale-libkleo-zh-TW"

RDEPENDS:${PN} += "libkleo"

inherit rpm
