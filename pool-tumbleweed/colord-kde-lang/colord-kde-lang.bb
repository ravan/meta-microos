SUMMARY = "Translations for package colord-kde"
DESCRIPTION = "Provides translations for the 'colord-kde' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "colord-kde-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "efb3db27e66cc7c2fcda32419a22acbccbd43a87c6902e216c511902649044394e0802c77a6d56adaa9d036f5cb5c2f0792120b39ca1ce2610b176bb67062a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-kde-lang \
colord-kde-lang-all \
locale-colord-kde-ar \
locale-colord-kde-ast \
locale-colord-kde-az \
locale-colord-kde-bg \
locale-colord-kde-bs \
locale-colord-kde-ca \
locale-colord-kde-ca@valencia \
locale-colord-kde-cs \
locale-colord-kde-da \
locale-colord-kde-de \
locale-colord-kde-el \
locale-colord-kde-en-GB \
locale-colord-kde-eo \
locale-colord-kde-es \
locale-colord-kde-et \
locale-colord-kde-eu \
locale-colord-kde-fi \
locale-colord-kde-fr \
locale-colord-kde-ga \
locale-colord-kde-gl \
locale-colord-kde-he \
locale-colord-kde-hi \
locale-colord-kde-hu \
locale-colord-kde-ia \
locale-colord-kde-id \
locale-colord-kde-is \
locale-colord-kde-it \
locale-colord-kde-ja \
locale-colord-kde-ka \
locale-colord-kde-km \
locale-colord-kde-ko \
locale-colord-kde-lt \
locale-colord-kde-lv \
locale-colord-kde-mr \
locale-colord-kde-nl \
locale-colord-kde-nn \
locale-colord-kde-pa \
locale-colord-kde-pl \
locale-colord-kde-pt \
locale-colord-kde-pt-BR \
locale-colord-kde-ro \
locale-colord-kde-ru \
locale-colord-kde-sk \
locale-colord-kde-sl \
locale-colord-kde-sv \
locale-colord-kde-ta \
locale-colord-kde-tr \
locale-colord-kde-ug \
locale-colord-kde-uk \
locale-colord-kde-zh-CN \
locale-colord-kde-zh-TW"

RDEPENDS:${PN} += "colord-kde"

inherit rpm
