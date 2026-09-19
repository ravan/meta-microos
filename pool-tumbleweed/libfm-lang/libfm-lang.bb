SUMMARY = "Translations for package libfm"
DESCRIPTION = "Provides translations for the 'libfm' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libfm-lang-1.4.1-2.5.noarch.rpm"
RPM_HASH = "0816d3ff0cd59ea3ee815e0aac1a4f78389b2a0aebf516c590d0cff35dbe43a0faa892cb05112178863c09225bd7ff6ac69f59d22e99d10e3451276f6127ba7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-lang \
libfm-lang-all \
locale-libfm-af \
locale-libfm-ar \
locale-libfm-be \
locale-libfm-bg \
locale-libfm-bn \
locale-libfm-bn-IN \
locale-libfm-ca \
locale-libfm-cs \
locale-libfm-da \
locale-libfm-de \
locale-libfm-el \
locale-libfm-en-GB \
locale-libfm-es \
locale-libfm-et \
locale-libfm-eu \
locale-libfm-fa \
locale-libfm-fi \
locale-libfm-fr \
locale-libfm-gl \
locale-libfm-he \
locale-libfm-hr \
locale-libfm-hu \
locale-libfm-id \
locale-libfm-is \
locale-libfm-it \
locale-libfm-ja \
locale-libfm-ka \
locale-libfm-kk \
locale-libfm-ko \
locale-libfm-lt \
locale-libfm-ml \
locale-libfm-ms \
locale-libfm-nb \
locale-libfm-nl \
locale-libfm-nn \
locale-libfm-pa \
locale-libfm-pl \
locale-libfm-pt \
locale-libfm-pt-BR \
locale-libfm-ro \
locale-libfm-ru \
locale-libfm-sk \
locale-libfm-sl \
locale-libfm-sr \
locale-libfm-sr@latin \
locale-libfm-sv \
locale-libfm-te \
locale-libfm-th \
locale-libfm-tr \
locale-libfm-ug \
locale-libfm-uk \
locale-libfm-vi \
locale-libfm-zh-CN \
locale-libfm-zh-TW"

RDEPENDS:${PN} += "libfm"

inherit rpm
