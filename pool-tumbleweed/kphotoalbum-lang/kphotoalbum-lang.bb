SUMMARY = "Translations for package kphotoalbum"
DESCRIPTION = "Provides translations for the 'kphotoalbum' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "kphotoalbum-lang-6.2.0-1.4.noarch.rpm"
RPM_HASH = "ad3fa3455459eaacc3baaebb7f83b2c7343fd4e953c0c8916544101ce8917fce4b49db6e4f5cc13de7c78a52e2f9ea6fb62e6b312c0a33ef5d5ab40692791bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kphotoalbum-lang \
kphotoalbum-lang-all \
locale-kphotoalbum-ar \
locale-kphotoalbum-be \
locale-kphotoalbum-bg \
locale-kphotoalbum-bs \
locale-kphotoalbum-ca \
locale-kphotoalbum-ca@valencia \
locale-kphotoalbum-cs \
locale-kphotoalbum-da \
locale-kphotoalbum-de \
locale-kphotoalbum-el \
locale-kphotoalbum-en-GB \
locale-kphotoalbum-eo \
locale-kphotoalbum-es \
locale-kphotoalbum-et \
locale-kphotoalbum-eu \
locale-kphotoalbum-fi \
locale-kphotoalbum-fr \
locale-kphotoalbum-ga \
locale-kphotoalbum-gl \
locale-kphotoalbum-he \
locale-kphotoalbum-hi \
locale-kphotoalbum-hr \
locale-kphotoalbum-hu \
locale-kphotoalbum-ia \
locale-kphotoalbum-id \
locale-kphotoalbum-is \
locale-kphotoalbum-it \
locale-kphotoalbum-ja \
locale-kphotoalbum-ka \
locale-kphotoalbum-km \
locale-kphotoalbum-lt \
locale-kphotoalbum-lv \
locale-kphotoalbum-mai \
locale-kphotoalbum-mr \
locale-kphotoalbum-nb \
locale-kphotoalbum-nds \
locale-kphotoalbum-nl \
locale-kphotoalbum-nn \
locale-kphotoalbum-pa \
locale-kphotoalbum-pl \
locale-kphotoalbum-pt \
locale-kphotoalbum-pt-BR \
locale-kphotoalbum-ro \
locale-kphotoalbum-ru \
locale-kphotoalbum-sk \
locale-kphotoalbum-sl \
locale-kphotoalbum-sv \
locale-kphotoalbum-tr \
locale-kphotoalbum-ug \
locale-kphotoalbum-uk \
locale-kphotoalbum-vi \
locale-kphotoalbum-zh-CN \
locale-kphotoalbum-zh-TW"

RDEPENDS:${PN} += "kphotoalbum"

inherit rpm
