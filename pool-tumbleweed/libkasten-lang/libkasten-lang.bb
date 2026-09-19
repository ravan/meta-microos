SUMMARY = "Translations for package libkasten"
DESCRIPTION = "Provides translations for the 'libkasten' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.28"

RPM_NAME = "libkasten-lang-0.26.28-1.1.noarch.rpm"
RPM_HASH = "127e5fb3aa41152ecae14a777e34ca512d5ac8f17910a31a3b103667f1ff567000a803f3bb1893e417c82ad029ae64ae753313ee29d33206e28c587f726a6d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkasten-lang \
libkasten-lang-all \
locale-libkasten-ar \
locale-libkasten-ast \
locale-libkasten-be \
locale-libkasten-bg \
locale-libkasten-bs \
locale-libkasten-ca \
locale-libkasten-ca@valencia \
locale-libkasten-cs \
locale-libkasten-da \
locale-libkasten-de \
locale-libkasten-el \
locale-libkasten-en-GB \
locale-libkasten-eo \
locale-libkasten-es \
locale-libkasten-et \
locale-libkasten-eu \
locale-libkasten-fi \
locale-libkasten-fr \
locale-libkasten-ga \
locale-libkasten-gl \
locale-libkasten-hr \
locale-libkasten-hu \
locale-libkasten-ia \
locale-libkasten-id \
locale-libkasten-is \
locale-libkasten-it \
locale-libkasten-ja \
locale-libkasten-ka \
locale-libkasten-kk \
locale-libkasten-km \
locale-libkasten-ko \
locale-libkasten-lt \
locale-libkasten-lv \
locale-libkasten-mai \
locale-libkasten-mr \
locale-libkasten-nb \
locale-libkasten-nds \
locale-libkasten-nl \
locale-libkasten-nn \
locale-libkasten-oc \
locale-libkasten-pl \
locale-libkasten-pt \
locale-libkasten-pt-BR \
locale-libkasten-ro \
locale-libkasten-ru \
locale-libkasten-sk \
locale-libkasten-sl \
locale-libkasten-sr \
locale-libkasten-sr@ijekavian \
locale-libkasten-sr@ijekavianlatin \
locale-libkasten-sr@latin \
locale-libkasten-sv \
locale-libkasten-th \
locale-libkasten-tr \
locale-libkasten-ug \
locale-libkasten-uk \
locale-libkasten-zh-CN \
locale-libkasten-zh-TW"

RDEPENDS:${PN} += "libkasten"

inherit rpm
