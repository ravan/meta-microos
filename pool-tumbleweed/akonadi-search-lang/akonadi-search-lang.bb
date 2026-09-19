SUMMARY = "Translations for package akonadi-search"
DESCRIPTION = "Provides translations for the 'akonadi-search' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "akonadi-search-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "71f21b58bd8185e613e0690532e797428d3336f3045ef406182f01a7b91484a37df65771ed962eb914996463a04b6cf8bd87bbc1d6a918cc7830558781f315a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-search-lang \
akonadi-search-lang-all \
locale-akonadi-search-ar \
locale-akonadi-search-ast \
locale-akonadi-search-az \
locale-akonadi-search-bg \
locale-akonadi-search-ca \
locale-akonadi-search-ca@valencia \
locale-akonadi-search-cs \
locale-akonadi-search-da \
locale-akonadi-search-de \
locale-akonadi-search-el \
locale-akonadi-search-en-GB \
locale-akonadi-search-eo \
locale-akonadi-search-es \
locale-akonadi-search-et \
locale-akonadi-search-eu \
locale-akonadi-search-fi \
locale-akonadi-search-fr \
locale-akonadi-search-ga \
locale-akonadi-search-gl \
locale-akonadi-search-he \
locale-akonadi-search-hi \
locale-akonadi-search-hu \
locale-akonadi-search-ia \
locale-akonadi-search-id \
locale-akonadi-search-it \
locale-akonadi-search-ja \
locale-akonadi-search-ka \
locale-akonadi-search-ko \
locale-akonadi-search-lt \
locale-akonadi-search-lv \
locale-akonadi-search-nb \
locale-akonadi-search-nl \
locale-akonadi-search-nn \
locale-akonadi-search-pl \
locale-akonadi-search-pt \
locale-akonadi-search-pt-BR \
locale-akonadi-search-ro \
locale-akonadi-search-ru \
locale-akonadi-search-sk \
locale-akonadi-search-sl \
locale-akonadi-search-sr \
locale-akonadi-search-sr@ijekavian \
locale-akonadi-search-sr@ijekavianlatin \
locale-akonadi-search-sr@latin \
locale-akonadi-search-sv \
locale-akonadi-search-ta \
locale-akonadi-search-tr \
locale-akonadi-search-ug \
locale-akonadi-search-uk \
locale-akonadi-search-zh-CN \
locale-akonadi-search-zh-TW"

RDEPENDS:${PN} += "akonadi-search"

inherit rpm
