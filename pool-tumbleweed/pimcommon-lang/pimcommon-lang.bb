SUMMARY = "Translations for package pimcommon"
DESCRIPTION = "Provides translations for the 'pimcommon' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "pimcommon-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "c1626073345b5685f9638fded0b8e0f73363a88bb872b91ecdf3039fd649ac7ac7698ee27622c6f8a09b86562810e04bdbca79237e10a8e750877df939f8af38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pimcommon-ar \
locale-pimcommon-ast \
locale-pimcommon-bs \
locale-pimcommon-ca \
locale-pimcommon-ca@valencia \
locale-pimcommon-cs \
locale-pimcommon-da \
locale-pimcommon-de \
locale-pimcommon-el \
locale-pimcommon-en-GB \
locale-pimcommon-eo \
locale-pimcommon-es \
locale-pimcommon-et \
locale-pimcommon-eu \
locale-pimcommon-fi \
locale-pimcommon-fr \
locale-pimcommon-ga \
locale-pimcommon-gl \
locale-pimcommon-he \
locale-pimcommon-hi \
locale-pimcommon-hu \
locale-pimcommon-ia \
locale-pimcommon-it \
locale-pimcommon-ja \
locale-pimcommon-ka \
locale-pimcommon-kk \
locale-pimcommon-ko \
locale-pimcommon-lt \
locale-pimcommon-lv \
locale-pimcommon-mr \
locale-pimcommon-nb \
locale-pimcommon-nds \
locale-pimcommon-nl \
locale-pimcommon-pl \
locale-pimcommon-pt \
locale-pimcommon-pt-BR \
locale-pimcommon-ro \
locale-pimcommon-ru \
locale-pimcommon-sk \
locale-pimcommon-sl \
locale-pimcommon-sr \
locale-pimcommon-sr@ijekavian \
locale-pimcommon-sr@ijekavianlatin \
locale-pimcommon-sr@latin \
locale-pimcommon-sv \
locale-pimcommon-ta \
locale-pimcommon-tr \
locale-pimcommon-ug \
locale-pimcommon-uk \
locale-pimcommon-zh-CN \
locale-pimcommon-zh-TW \
pimcommon-lang \
pimcommon-lang-all"

RDEPENDS:${PN} += "pimcommon"

inherit rpm
