SUMMARY = "Translations for package krusader"
DESCRIPTION = "Provides translations for the 'krusader' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.0"

RPM_NAME = "krusader-lang-2.9.0-1.6.noarch.rpm"
RPM_HASH = "1cd52bddf6808c78e75bb0d789bf4aa9b93eb33d27f565cf4312d981b1936bc673aa55ae1e3e4610641a9f37f0fe7520069f750dd95082f198548d1eddf7661a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krusader-lang \
krusader-lang-all \
locale-krusader-ar \
locale-krusader-bg \
locale-krusader-bs \
locale-krusader-ca \
locale-krusader-ca@valencia \
locale-krusader-cs \
locale-krusader-da \
locale-krusader-de \
locale-krusader-el \
locale-krusader-en-GB \
locale-krusader-eo \
locale-krusader-es \
locale-krusader-et \
locale-krusader-eu \
locale-krusader-fi \
locale-krusader-fr \
locale-krusader-ga \
locale-krusader-gl \
locale-krusader-he \
locale-krusader-hr \
locale-krusader-hu \
locale-krusader-ia \
locale-krusader-it \
locale-krusader-ja \
locale-krusader-ka \
locale-krusader-ko \
locale-krusader-lt \
locale-krusader-mai \
locale-krusader-mr \
locale-krusader-nb \
locale-krusader-nds \
locale-krusader-nl \
locale-krusader-nn \
locale-krusader-pa \
locale-krusader-pl \
locale-krusader-pt \
locale-krusader-pt-BR \
locale-krusader-ro \
locale-krusader-ru \
locale-krusader-sk \
locale-krusader-sl \
locale-krusader-sr \
locale-krusader-sr@ijekavian \
locale-krusader-sr@ijekavianlatin \
locale-krusader-sr@latin \
locale-krusader-sv \
locale-krusader-tr \
locale-krusader-ug \
locale-krusader-uk \
locale-krusader-zh-CN \
locale-krusader-zh-TW"

RDEPENDS:${PN} += "krusader"

inherit rpm
