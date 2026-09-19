SUMMARY = "Translations for package libKTorrent6"
DESCRIPTION = "Provides translations for the 'libKTorrent6' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKTorrent6-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4c8577c9471fdd6c3a05cda9f510929144f0a1561a6c7a51ade30f866923c85ea8a6a439ac56b9f395d3d5fed1483fe58c12f305e70a562983d7c1563d679a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKTorrent6-lang \
libKTorrent6-lang-all \
locale-libKTorrent6-ar \
locale-libKTorrent6-ast \
locale-libKTorrent6-be \
locale-libKTorrent6-bg \
locale-libKTorrent6-bs \
locale-libKTorrent6-ca \
locale-libKTorrent6-ca@valencia \
locale-libKTorrent6-cs \
locale-libKTorrent6-da \
locale-libKTorrent6-de \
locale-libKTorrent6-el \
locale-libKTorrent6-en-GB \
locale-libKTorrent6-eo \
locale-libKTorrent6-es \
locale-libKTorrent6-et \
locale-libKTorrent6-eu \
locale-libKTorrent6-fi \
locale-libKTorrent6-fr \
locale-libKTorrent6-ga \
locale-libKTorrent6-gl \
locale-libKTorrent6-he \
locale-libKTorrent6-hi \
locale-libKTorrent6-hr \
locale-libKTorrent6-hu \
locale-libKTorrent6-ia \
locale-libKTorrent6-is \
locale-libKTorrent6-it \
locale-libKTorrent6-ja \
locale-libKTorrent6-ka \
locale-libKTorrent6-kk \
locale-libKTorrent6-km \
locale-libKTorrent6-ko \
locale-libKTorrent6-lt \
locale-libKTorrent6-lv \
locale-libKTorrent6-mr \
locale-libKTorrent6-ms \
locale-libKTorrent6-nb \
locale-libKTorrent6-nds \
locale-libKTorrent6-nl \
locale-libKTorrent6-nn \
locale-libKTorrent6-oc \
locale-libKTorrent6-pl \
locale-libKTorrent6-pt \
locale-libKTorrent6-pt-BR \
locale-libKTorrent6-ro \
locale-libKTorrent6-ru \
locale-libKTorrent6-si \
locale-libKTorrent6-sk \
locale-libKTorrent6-sl \
locale-libKTorrent6-sr \
locale-libKTorrent6-sr@ijekavian \
locale-libKTorrent6-sr@ijekavianlatin \
locale-libKTorrent6-sr@latin \
locale-libKTorrent6-sv \
locale-libKTorrent6-tr \
locale-libKTorrent6-ug \
locale-libKTorrent6-uk \
locale-libKTorrent6-zh-CN \
locale-libKTorrent6-zh-TW"

RDEPENDS:${PN} += "libKTorrent6"

inherit rpm
