SUMMARY = "Translations for package keysmith"
DESCRIPTION = "Provides translations for the 'keysmith' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "keysmith-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "e82c7503eb5cd8677e181f6ba78ba5c3466dabdc7756c2a86ceb0e39b75fa4845a34a4ebf39373b1adf97fa46e18c882d18c9f8af1a2e02c004cc78e0bb682c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keysmith-lang \
keysmith-lang-all \
locale-keysmith-ar \
locale-keysmith-ast \
locale-keysmith-ca \
locale-keysmith-ca@valencia \
locale-keysmith-cs \
locale-keysmith-de \
locale-keysmith-en-GB \
locale-keysmith-eo \
locale-keysmith-es \
locale-keysmith-et \
locale-keysmith-eu \
locale-keysmith-fi \
locale-keysmith-fr \
locale-keysmith-ga \
locale-keysmith-gl \
locale-keysmith-he \
locale-keysmith-hi \
locale-keysmith-hu \
locale-keysmith-ia \
locale-keysmith-it \
locale-keysmith-ja \
locale-keysmith-ka \
locale-keysmith-ko \
locale-keysmith-lt \
locale-keysmith-nl \
locale-keysmith-nn \
locale-keysmith-pa \
locale-keysmith-pl \
locale-keysmith-pt \
locale-keysmith-pt-BR \
locale-keysmith-ro \
locale-keysmith-ru \
locale-keysmith-sk \
locale-keysmith-sl \
locale-keysmith-sv \
locale-keysmith-tr \
locale-keysmith-ug \
locale-keysmith-uk \
locale-keysmith-zh-CN \
locale-keysmith-zh-TW"

RDEPENDS:${PN} += "keysmith"

inherit rpm
