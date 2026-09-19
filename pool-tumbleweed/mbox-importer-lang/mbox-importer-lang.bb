SUMMARY = "Translations for package mbox-importer"
DESCRIPTION = "Provides translations for the 'mbox-importer' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "mbox-importer-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "34c031864cea8326230a561228b97aa3af28e66c75fc1fa022e38cf719984232cf987c7b250186604dc27929a978112ed878fff34a775a6b44bbf853a1842456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mbox-importer-ar \
locale-mbox-importer-ast \
locale-mbox-importer-bg \
locale-mbox-importer-bs \
locale-mbox-importer-ca \
locale-mbox-importer-ca@valencia \
locale-mbox-importer-cs \
locale-mbox-importer-da \
locale-mbox-importer-de \
locale-mbox-importer-el \
locale-mbox-importer-en-GB \
locale-mbox-importer-eo \
locale-mbox-importer-es \
locale-mbox-importer-et \
locale-mbox-importer-eu \
locale-mbox-importer-fi \
locale-mbox-importer-fr \
locale-mbox-importer-ga \
locale-mbox-importer-gl \
locale-mbox-importer-he \
locale-mbox-importer-hi \
locale-mbox-importer-hu \
locale-mbox-importer-ia \
locale-mbox-importer-it \
locale-mbox-importer-ja \
locale-mbox-importer-ka \
locale-mbox-importer-kk \
locale-mbox-importer-ko \
locale-mbox-importer-lt \
locale-mbox-importer-lv \
locale-mbox-importer-nb \
locale-mbox-importer-nds \
locale-mbox-importer-nl \
locale-mbox-importer-nn \
locale-mbox-importer-pl \
locale-mbox-importer-pt \
locale-mbox-importer-pt-BR \
locale-mbox-importer-ro \
locale-mbox-importer-ru \
locale-mbox-importer-sk \
locale-mbox-importer-sl \
locale-mbox-importer-sr \
locale-mbox-importer-sr@ijekavian \
locale-mbox-importer-sr@ijekavianlatin \
locale-mbox-importer-sr@latin \
locale-mbox-importer-sv \
locale-mbox-importer-tr \
locale-mbox-importer-ug \
locale-mbox-importer-uk \
locale-mbox-importer-zh-CN \
locale-mbox-importer-zh-TW \
mbox-importer-lang \
mbox-importer-lang-all"

RDEPENDS:${PN} += "mbox-importer"

inherit rpm
