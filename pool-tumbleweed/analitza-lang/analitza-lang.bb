SUMMARY = "Translations for package analitza"
DESCRIPTION = "Provides translations for the 'analitza' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "analitza-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "5cc1705cb50066e18438edec527c8a48a2233598ed9219a13ccdbcd118db4330c4fa777b6f03d1f967a387218e62fc727ec13316f943090598bd512ec820aac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "analitza-lang \
analitza-lang-all \
locale-analitza-ar \
locale-analitza-ast \
locale-analitza-bs \
locale-analitza-ca \
locale-analitza-ca@valencia \
locale-analitza-cs \
locale-analitza-da \
locale-analitza-de \
locale-analitza-el \
locale-analitza-en-GB \
locale-analitza-eo \
locale-analitza-es \
locale-analitza-et \
locale-analitza-eu \
locale-analitza-fi \
locale-analitza-fr \
locale-analitza-ga \
locale-analitza-gl \
locale-analitza-hi \
locale-analitza-hu \
locale-analitza-ia \
locale-analitza-it \
locale-analitza-ja \
locale-analitza-ka \
locale-analitza-kk \
locale-analitza-ko \
locale-analitza-lt \
locale-analitza-lv \
locale-analitza-ml \
locale-analitza-mr \
locale-analitza-nb \
locale-analitza-nds \
locale-analitza-nl \
locale-analitza-nn \
locale-analitza-pl \
locale-analitza-pt \
locale-analitza-pt-BR \
locale-analitza-ru \
locale-analitza-sk \
locale-analitza-sl \
locale-analitza-sv \
locale-analitza-tr \
locale-analitza-ug \
locale-analitza-uk \
locale-analitza-zh-CN \
locale-analitza-zh-TW"

RDEPENDS:${PN} += "analitza"

inherit rpm
