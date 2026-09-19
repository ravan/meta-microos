SUMMARY = "Translations for package libkgapi6"
DESCRIPTION = "Provides translations for the 'libkgapi6' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkgapi6-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "a19ca1cc3467e7bf2d493bdc4d55b9e2361e82c3c627f881d78f904d63c6dbc746c51dff97ec77e47788c33eb1da1389638a7030bea8c63d3bdfdfa2517b4d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkgapi6-lang \
libkgapi6-lang-all \
locale-libkgapi6-ar \
locale-libkgapi6-ast \
locale-libkgapi6-bs \
locale-libkgapi6-ca \
locale-libkgapi6-ca@valencia \
locale-libkgapi6-cs \
locale-libkgapi6-da \
locale-libkgapi6-de \
locale-libkgapi6-el \
locale-libkgapi6-en-GB \
locale-libkgapi6-eo \
locale-libkgapi6-es \
locale-libkgapi6-et \
locale-libkgapi6-eu \
locale-libkgapi6-fi \
locale-libkgapi6-fr \
locale-libkgapi6-ga \
locale-libkgapi6-gl \
locale-libkgapi6-he \
locale-libkgapi6-hi \
locale-libkgapi6-hu \
locale-libkgapi6-ia \
locale-libkgapi6-it \
locale-libkgapi6-ja \
locale-libkgapi6-ka \
locale-libkgapi6-kk \
locale-libkgapi6-km \
locale-libkgapi6-ko \
locale-libkgapi6-lt \
locale-libkgapi6-lv \
locale-libkgapi6-mr \
locale-libkgapi6-nb \
locale-libkgapi6-nds \
locale-libkgapi6-nl \
locale-libkgapi6-nn \
locale-libkgapi6-pl \
locale-libkgapi6-pt \
locale-libkgapi6-pt-BR \
locale-libkgapi6-ro \
locale-libkgapi6-ru \
locale-libkgapi6-sk \
locale-libkgapi6-sl \
locale-libkgapi6-sr \
locale-libkgapi6-sr@ijekavian \
locale-libkgapi6-sr@ijekavianlatin \
locale-libkgapi6-sr@latin \
locale-libkgapi6-sv \
locale-libkgapi6-ta \
locale-libkgapi6-tr \
locale-libkgapi6-ug \
locale-libkgapi6-uk \
locale-libkgapi6-zh-CN \
locale-libkgapi6-zh-TW"

RDEPENDS:${PN} += "libkgapi6"

inherit rpm
