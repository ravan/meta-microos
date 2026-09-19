SUMMARY = "Translations for package lollypop"
DESCRIPTION = "Provides translations for the 'lollypop' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.40"

RPM_NAME = "lollypop-lang-1.4.40-1.7.noarch.rpm"
RPM_HASH = "ad4a08a3f72c47a78dfd43f54f091983689e60b96ef858b49431edeed0b1748c712dc9bdebf37f1eb59abf35b55cb62ee4e0c9423852ea1b834a596433366253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lollypop-ar \
locale-lollypop-bg \
locale-lollypop-bn \
locale-lollypop-ca \
locale-lollypop-cs \
locale-lollypop-da \
locale-lollypop-de \
locale-lollypop-el \
locale-lollypop-en-GB \
locale-lollypop-eo \
locale-lollypop-es \
locale-lollypop-es-EC \
locale-lollypop-eu \
locale-lollypop-fa \
locale-lollypop-fi \
locale-lollypop-fr \
locale-lollypop-ga \
locale-lollypop-gl \
locale-lollypop-he \
locale-lollypop-hr \
locale-lollypop-hu \
locale-lollypop-id \
locale-lollypop-it \
locale-lollypop-ja \
locale-lollypop-ka \
locale-lollypop-ko \
locale-lollypop-lt \
locale-lollypop-nb-NO \
locale-lollypop-nl \
locale-lollypop-nl-BE \
locale-lollypop-pl \
locale-lollypop-pt \
locale-lollypop-pt-BR \
locale-lollypop-pt-PT \
locale-lollypop-ro \
locale-lollypop-ru \
locale-lollypop-sk \
locale-lollypop-sr \
locale-lollypop-sr@latin \
locale-lollypop-sv \
locale-lollypop-tr \
locale-lollypop-uk \
locale-lollypop-zh-CN \
locale-lollypop-zh-Hant \
lollypop-lang \
lollypop-lang-all"

RDEPENDS:${PN} += "lollypop"

inherit rpm
