SUMMARY = "Translations for package glibc"
DESCRIPTION = "Provides translations for the 'glibc' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.44"

RPM_NAME = "glibc-lang-2.44-2.1.noarch.rpm"
RPM_HASH = "5667503cda07eb3676b4990d46997d48daa1911cdbb8258a5fa5647a54d0c3fa283cdcadc16487c57f7913333176ad1e21704d951af6110482853c4ef22e068c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-lang \
glibc-lang-all \
locale-glibc-ar \
locale-glibc-be \
locale-glibc-bg \
locale-glibc-ca \
locale-glibc-cs \
locale-glibc-da \
locale-glibc-de \
locale-glibc-el \
locale-glibc-en-GB \
locale-glibc-eo \
locale-glibc-es \
locale-glibc-fi \
locale-glibc-fr \
locale-glibc-gl \
locale-glibc-hr \
locale-glibc-hu \
locale-glibc-ia \
locale-glibc-id \
locale-glibc-it \
locale-glibc-ja \
locale-glibc-ka \
locale-glibc-ko \
locale-glibc-lt \
locale-glibc-nb \
locale-glibc-nl \
locale-glibc-pl \
locale-glibc-pt \
locale-glibc-pt-BR \
locale-glibc-ro \
locale-glibc-ru \
locale-glibc-sk \
locale-glibc-sl \
locale-glibc-sr \
locale-glibc-sv \
locale-glibc-tr \
locale-glibc-uk \
locale-glibc-vi \
locale-glibc-zh-CN \
locale-glibc-zh-TW"

RDEPENDS:${PN} += "glibc"

inherit rpm
