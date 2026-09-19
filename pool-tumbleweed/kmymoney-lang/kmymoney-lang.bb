SUMMARY = "Translations for package kmymoney"
DESCRIPTION = "Provides translations for the 'kmymoney' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.2.2"

RPM_NAME = "kmymoney-lang-5.2.2-1.7.noarch.rpm"
RPM_HASH = "416a179a1fe3cb51accc556213ecb6ebd978cd8d1e64032c0b09fdfbde320a7ff992c5984975b95dc4c70077c9dd269e3ba190d54c4b92856248baf479bd59cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmymoney-lang \
kmymoney-lang-all \
locale-kmymoney-ar \
locale-kmymoney-ast \
locale-kmymoney-bg \
locale-kmymoney-bs \
locale-kmymoney-ca \
locale-kmymoney-ca@valencia \
locale-kmymoney-cs \
locale-kmymoney-da \
locale-kmymoney-de \
locale-kmymoney-el \
locale-kmymoney-en-GB \
locale-kmymoney-eo \
locale-kmymoney-es \
locale-kmymoney-et \
locale-kmymoney-eu \
locale-kmymoney-fi \
locale-kmymoney-fr \
locale-kmymoney-ga \
locale-kmymoney-gl \
locale-kmymoney-hu \
locale-kmymoney-ia \
locale-kmymoney-it \
locale-kmymoney-ja \
locale-kmymoney-ka \
locale-kmymoney-kk \
locale-kmymoney-ko \
locale-kmymoney-lt \
locale-kmymoney-mr \
locale-kmymoney-ms \
locale-kmymoney-nb \
locale-kmymoney-nds \
locale-kmymoney-nl \
locale-kmymoney-pl \
locale-kmymoney-pt \
locale-kmymoney-pt-BR \
locale-kmymoney-ro \
locale-kmymoney-ru \
locale-kmymoney-sk \
locale-kmymoney-sl \
locale-kmymoney-sv \
locale-kmymoney-tr \
locale-kmymoney-ug \
locale-kmymoney-uk \
locale-kmymoney-zh-CN \
locale-kmymoney-zh-TW"

RDEPENDS:${PN} += "kmymoney"

inherit rpm
