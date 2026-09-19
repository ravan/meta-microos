SUMMARY = "Translations for package plasma6-nm"
DESCRIPTION = "Provides translations for the 'plasma6-nm' package."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "d4310dc053444babc6c503c29d8b5542b741899614712c0a8bfcf84f86d9d21e4329b4feb4bfd57a633e5c6d97edcd1e5cdb440bca152cef665538685bf679ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-nm-ar \
locale-plasma6-nm-ast \
locale-plasma6-nm-az \
locale-plasma6-nm-be \
locale-plasma6-nm-bg \
locale-plasma6-nm-bs \
locale-plasma6-nm-ca \
locale-plasma6-nm-ca@valencia \
locale-plasma6-nm-cs \
locale-plasma6-nm-da \
locale-plasma6-nm-de \
locale-plasma6-nm-el \
locale-plasma6-nm-en-GB \
locale-plasma6-nm-eo \
locale-plasma6-nm-es \
locale-plasma6-nm-et \
locale-plasma6-nm-eu \
locale-plasma6-nm-fa \
locale-plasma6-nm-fi \
locale-plasma6-nm-fr \
locale-plasma6-nm-ga \
locale-plasma6-nm-gl \
locale-plasma6-nm-he \
locale-plasma6-nm-hi \
locale-plasma6-nm-hr \
locale-plasma6-nm-hu \
locale-plasma6-nm-ia \
locale-plasma6-nm-id \
locale-plasma6-nm-is \
locale-plasma6-nm-it \
locale-plasma6-nm-ja \
locale-plasma6-nm-ka \
locale-plasma6-nm-km \
locale-plasma6-nm-ko \
locale-plasma6-nm-lt \
locale-plasma6-nm-lv \
locale-plasma6-nm-mai \
locale-plasma6-nm-ml \
locale-plasma6-nm-mr \
locale-plasma6-nm-ms \
locale-plasma6-nm-nb \
locale-plasma6-nm-nds \
locale-plasma6-nm-nl \
locale-plasma6-nm-nn \
locale-plasma6-nm-pa \
locale-plasma6-nm-pl \
locale-plasma6-nm-pt \
locale-plasma6-nm-pt-BR \
locale-plasma6-nm-ro \
locale-plasma6-nm-ru \
locale-plasma6-nm-sk \
locale-plasma6-nm-sl \
locale-plasma6-nm-sr \
locale-plasma6-nm-sr@ijekavian \
locale-plasma6-nm-sr@ijekavianlatin \
locale-plasma6-nm-sr@latin \
locale-plasma6-nm-sv \
locale-plasma6-nm-ta \
locale-plasma6-nm-th \
locale-plasma6-nm-tr \
locale-plasma6-nm-ug \
locale-plasma6-nm-uk \
locale-plasma6-nm-zh-CN \
locale-plasma6-nm-zh-TW \
plasma6-nm-lang \
plasma6-nm-lang-all"

RDEPENDS:${PN} += "plasma6-nm"

inherit rpm
