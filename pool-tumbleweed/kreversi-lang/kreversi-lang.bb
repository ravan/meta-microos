SUMMARY = "Translations for package kreversi"
DESCRIPTION = "Provides translations for the 'kreversi' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kreversi-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "a4ec17be6a991762ff2ce11989ad7ec135b1c1ef4a845c2f0dcc72758527824b58a6e6070f0038d3948b6f2d952d04c2cf2b8eeb93cddd9627ce750871977b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kreversi-lang \
kreversi-lang-all \
locale-kreversi-af \
locale-kreversi-ar \
locale-kreversi-ast \
locale-kreversi-be \
locale-kreversi-bn \
locale-kreversi-br \
locale-kreversi-bs \
locale-kreversi-ca \
locale-kreversi-ca@valencia \
locale-kreversi-cs \
locale-kreversi-cy \
locale-kreversi-da \
locale-kreversi-de \
locale-kreversi-el \
locale-kreversi-en-GB \
locale-kreversi-eo \
locale-kreversi-es \
locale-kreversi-et \
locale-kreversi-eu \
locale-kreversi-fa \
locale-kreversi-fi \
locale-kreversi-fr \
locale-kreversi-ga \
locale-kreversi-gl \
locale-kreversi-he \
locale-kreversi-hi \
locale-kreversi-hr \
locale-kreversi-hu \
locale-kreversi-ia \
locale-kreversi-id \
locale-kreversi-is \
locale-kreversi-it \
locale-kreversi-ja \
locale-kreversi-ka \
locale-kreversi-kk \
locale-kreversi-km \
locale-kreversi-ko \
locale-kreversi-lt \
locale-kreversi-lv \
locale-kreversi-mai \
locale-kreversi-mk \
locale-kreversi-ml \
locale-kreversi-mr \
locale-kreversi-nb \
locale-kreversi-nds \
locale-kreversi-ne \
locale-kreversi-nl \
locale-kreversi-nn \
locale-kreversi-oc \
locale-kreversi-pa \
locale-kreversi-pl \
locale-kreversi-pt \
locale-kreversi-pt-BR \
locale-kreversi-ro \
locale-kreversi-ru \
locale-kreversi-sk \
locale-kreversi-sl \
locale-kreversi-sq \
locale-kreversi-sr \
locale-kreversi-sr@ijekavian \
locale-kreversi-sr@ijekavianlatin \
locale-kreversi-sr@latin \
locale-kreversi-sv \
locale-kreversi-ta \
locale-kreversi-th \
locale-kreversi-tr \
locale-kreversi-ug \
locale-kreversi-uk \
locale-kreversi-zh-CN \
locale-kreversi-zh-TW"

RDEPENDS:${PN} += "kreversi"

inherit rpm
