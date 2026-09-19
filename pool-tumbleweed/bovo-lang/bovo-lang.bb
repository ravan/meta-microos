SUMMARY = "Translations for package bovo"
DESCRIPTION = "Provides translations for the 'bovo' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "bovo-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "c5ca90045b1d2d7cb9d8d8e3e67d5be17bfe2a9a08c20652b9a1982b7c45a3d6bf2b6b1bb6fb3874a4d55756908f9dab502cfe1d3fc59720dc4175f6cb1c1726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bovo-lang \
bovo-lang-all \
locale-bovo-ar \
locale-bovo-ast \
locale-bovo-be \
locale-bovo-bg \
locale-bovo-bs \
locale-bovo-ca \
locale-bovo-ca@valencia \
locale-bovo-cs \
locale-bovo-da \
locale-bovo-de \
locale-bovo-el \
locale-bovo-en-GB \
locale-bovo-eo \
locale-bovo-es \
locale-bovo-et \
locale-bovo-eu \
locale-bovo-fi \
locale-bovo-fr \
locale-bovo-ga \
locale-bovo-gl \
locale-bovo-he \
locale-bovo-hi \
locale-bovo-hr \
locale-bovo-hu \
locale-bovo-ia \
locale-bovo-id \
locale-bovo-is \
locale-bovo-it \
locale-bovo-ja \
locale-bovo-ka \
locale-bovo-kk \
locale-bovo-km \
locale-bovo-ko \
locale-bovo-lt \
locale-bovo-lv \
locale-bovo-mai \
locale-bovo-ml \
locale-bovo-mr \
locale-bovo-nb \
locale-bovo-nds \
locale-bovo-nl \
locale-bovo-nn \
locale-bovo-oc \
locale-bovo-pa \
locale-bovo-pl \
locale-bovo-pt \
locale-bovo-pt-BR \
locale-bovo-ro \
locale-bovo-ru \
locale-bovo-sk \
locale-bovo-sl \
locale-bovo-sq \
locale-bovo-sr \
locale-bovo-sr@ijekavian \
locale-bovo-sr@ijekavianlatin \
locale-bovo-sr@latin \
locale-bovo-sv \
locale-bovo-tr \
locale-bovo-ug \
locale-bovo-uk \
locale-bovo-zh-CN \
locale-bovo-zh-TW"

RDEPENDS:${PN} += "bovo"

inherit rpm
