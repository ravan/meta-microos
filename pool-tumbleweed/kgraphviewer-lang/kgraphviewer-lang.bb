SUMMARY = "Translations for package kgraphviewer"
DESCRIPTION = "Provides translations for the 'kgraphviewer' package."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kgraphviewer-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "63c4fa1731a9cfc42d87c685d50a0686a68acf8d8e8665464ec2473fe6d8a07283865b657128706ebcd84b5d2b17f7230186fde6a2d2bd895e458c3ee758e42c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgraphviewer-lang \
kgraphviewer-lang-all \
locale-kgraphviewer-ar \
locale-kgraphviewer-be \
locale-kgraphviewer-bs \
locale-kgraphviewer-ca \
locale-kgraphviewer-ca@valencia \
locale-kgraphviewer-cs \
locale-kgraphviewer-da \
locale-kgraphviewer-de \
locale-kgraphviewer-el \
locale-kgraphviewer-en-GB \
locale-kgraphviewer-eo \
locale-kgraphviewer-es \
locale-kgraphviewer-et \
locale-kgraphviewer-eu \
locale-kgraphviewer-fi \
locale-kgraphviewer-fr \
locale-kgraphviewer-ga \
locale-kgraphviewer-gl \
locale-kgraphviewer-he \
locale-kgraphviewer-hi \
locale-kgraphviewer-hr \
locale-kgraphviewer-hu \
locale-kgraphviewer-ia \
locale-kgraphviewer-is \
locale-kgraphviewer-it \
locale-kgraphviewer-ja \
locale-kgraphviewer-ka \
locale-kgraphviewer-km \
locale-kgraphviewer-ko \
locale-kgraphviewer-lt \
locale-kgraphviewer-lv \
locale-kgraphviewer-mai \
locale-kgraphviewer-mr \
locale-kgraphviewer-nb \
locale-kgraphviewer-nds \
locale-kgraphviewer-nl \
locale-kgraphviewer-nn \
locale-kgraphviewer-pa \
locale-kgraphviewer-pl \
locale-kgraphviewer-pt \
locale-kgraphviewer-pt-BR \
locale-kgraphviewer-ro \
locale-kgraphviewer-ru \
locale-kgraphviewer-sk \
locale-kgraphviewer-sl \
locale-kgraphviewer-sv \
locale-kgraphviewer-th \
locale-kgraphviewer-tr \
locale-kgraphviewer-ug \
locale-kgraphviewer-uk \
locale-kgraphviewer-vi \
locale-kgraphviewer-zh-CN \
locale-kgraphviewer-zh-TW"

RDEPENDS:${PN} += "kgraphviewer"

inherit rpm
