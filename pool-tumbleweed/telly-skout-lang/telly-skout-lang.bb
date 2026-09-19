SUMMARY = "Translations for package telly-skout"
DESCRIPTION = "Provides translations for the 'telly-skout' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "telly-skout-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "dbf586ee0416fb9971238df5a8b1853177194207417811c59c3a0e5d5a87aaaabbfe49dc0fdbfb455bcfb13594eb8fad5b5cc952cda3428bfd520bbfef2ea397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-telly-skout-ar \
locale-telly-skout-ast \
locale-telly-skout-ca \
locale-telly-skout-ca@valencia \
locale-telly-skout-cs \
locale-telly-skout-de \
locale-telly-skout-en-GB \
locale-telly-skout-eo \
locale-telly-skout-es \
locale-telly-skout-eu \
locale-telly-skout-fi \
locale-telly-skout-fr \
locale-telly-skout-ga \
locale-telly-skout-gl \
locale-telly-skout-he \
locale-telly-skout-hi \
locale-telly-skout-hu \
locale-telly-skout-ia \
locale-telly-skout-it \
locale-telly-skout-ja \
locale-telly-skout-ka \
locale-telly-skout-ko \
locale-telly-skout-lt \
locale-telly-skout-lv \
locale-telly-skout-nl \
locale-telly-skout-pl \
locale-telly-skout-pt \
locale-telly-skout-pt-BR \
locale-telly-skout-ru \
locale-telly-skout-sk \
locale-telly-skout-sl \
locale-telly-skout-sv \
locale-telly-skout-tr \
locale-telly-skout-ug \
locale-telly-skout-uk \
locale-telly-skout-zh-CN \
locale-telly-skout-zh-TW \
telly-skout-lang \
telly-skout-lang-all"

RDEPENDS:${PN} += "telly-skout"

inherit rpm
