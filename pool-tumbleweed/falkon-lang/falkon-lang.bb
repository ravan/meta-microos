SUMMARY = "Translations for package falkon"
DESCRIPTION = "Provides translations for the 'falkon' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "falkon-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "adc0ba1408b0332a33de52aa904d7726f010c8d3c329b2d99bd967b6e5ba2f38cc18f49329ffa6bb55c66bab55013ac884faafb5854ccc84edbe5a6d10a4655f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "falkon-lang \
falkon-lang-all \
locale-falkon-ar \
locale-falkon-ast \
locale-falkon-az \
locale-falkon-bg \
locale-falkon-ca \
locale-falkon-ca@valencia \
locale-falkon-cs \
locale-falkon-da \
locale-falkon-de \
locale-falkon-el \
locale-falkon-en \
locale-falkon-en-GB \
locale-falkon-eo \
locale-falkon-es \
locale-falkon-et \
locale-falkon-eu \
locale-falkon-fa \
locale-falkon-fi \
locale-falkon-fr \
locale-falkon-ga \
locale-falkon-gl \
locale-falkon-he \
locale-falkon-hi \
locale-falkon-hu \
locale-falkon-ia \
locale-falkon-id \
locale-falkon-is \
locale-falkon-it \
locale-falkon-ja \
locale-falkon-ka \
locale-falkon-ko \
locale-falkon-lt \
locale-falkon-lv \
locale-falkon-nb \
locale-falkon-nl \
locale-falkon-nn \
locale-falkon-pa \
locale-falkon-pl \
locale-falkon-pt \
locale-falkon-pt-BR \
locale-falkon-ru \
locale-falkon-sk \
locale-falkon-sl \
locale-falkon-sr \
locale-falkon-sr@ijekavian \
locale-falkon-sr@ijekavianlatin \
locale-falkon-sr@latin \
locale-falkon-sv \
locale-falkon-ta \
locale-falkon-tr \
locale-falkon-ug \
locale-falkon-uk \
locale-falkon-zh-CN \
locale-falkon-zh-HK \
locale-falkon-zh-TW"

RDEPENDS:${PN} += "falkon"

inherit rpm
