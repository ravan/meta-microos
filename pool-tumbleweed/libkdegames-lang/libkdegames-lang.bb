SUMMARY = "Translations for package libkdegames"
DESCRIPTION = "Provides translations for the 'libkdegames' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkdegames-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "395e6fd1bb9dda2658f56b8450d990d926a271241de01231d5548e095b88b2f05e46522c267edcbdf7029742b8fbff6919c76e210f8cf780ecd53b19f9d31c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkdegames-lang \
libkdegames-lang-all \
locale-libkdegames-af \
locale-libkdegames-ar \
locale-libkdegames-ast \
locale-libkdegames-be \
locale-libkdegames-bg \
locale-libkdegames-bn \
locale-libkdegames-br \
locale-libkdegames-bs \
locale-libkdegames-ca \
locale-libkdegames-ca@valencia \
locale-libkdegames-cs \
locale-libkdegames-cy \
locale-libkdegames-da \
locale-libkdegames-de \
locale-libkdegames-el \
locale-libkdegames-en-GB \
locale-libkdegames-eo \
locale-libkdegames-es \
locale-libkdegames-et \
locale-libkdegames-eu \
locale-libkdegames-fa \
locale-libkdegames-fi \
locale-libkdegames-fr \
locale-libkdegames-ga \
locale-libkdegames-gl \
locale-libkdegames-he \
locale-libkdegames-hi \
locale-libkdegames-hr \
locale-libkdegames-hu \
locale-libkdegames-ia \
locale-libkdegames-id \
locale-libkdegames-is \
locale-libkdegames-it \
locale-libkdegames-ja \
locale-libkdegames-ka \
locale-libkdegames-kk \
locale-libkdegames-km \
locale-libkdegames-ko \
locale-libkdegames-lt \
locale-libkdegames-lv \
locale-libkdegames-mai \
locale-libkdegames-mk \
locale-libkdegames-ml \
locale-libkdegames-mr \
locale-libkdegames-nb \
locale-libkdegames-nds \
locale-libkdegames-ne \
locale-libkdegames-nl \
locale-libkdegames-nn \
locale-libkdegames-oc \
locale-libkdegames-pa \
locale-libkdegames-pl \
locale-libkdegames-pt \
locale-libkdegames-pt-BR \
locale-libkdegames-ro \
locale-libkdegames-ru \
locale-libkdegames-sk \
locale-libkdegames-sl \
locale-libkdegames-sq \
locale-libkdegames-sr \
locale-libkdegames-sr@ijekavian \
locale-libkdegames-sr@ijekavianlatin \
locale-libkdegames-sr@latin \
locale-libkdegames-sv \
locale-libkdegames-ta \
locale-libkdegames-te \
locale-libkdegames-th \
locale-libkdegames-tr \
locale-libkdegames-ug \
locale-libkdegames-uk \
locale-libkdegames-wa \
locale-libkdegames-zh-CN \
locale-libkdegames-zh-TW"

RDEPENDS:${PN} += "libkdegames"

inherit rpm
