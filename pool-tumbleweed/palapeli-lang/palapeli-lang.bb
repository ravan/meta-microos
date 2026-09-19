SUMMARY = "Translations for package palapeli"
DESCRIPTION = "Provides translations for the 'palapeli' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "palapeli-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "9a8bb7d3bcfbf54dd27f0ba798eef5407b2e35306e67ca6fa84483f179f6d5976929176a0b939d99ffd2b33cdd85819cf6adf6d23bc34667c9ecf5b2b8d581e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-palapeli-ar \
locale-palapeli-ast \
locale-palapeli-bs \
locale-palapeli-ca \
locale-palapeli-ca@valencia \
locale-palapeli-cs \
locale-palapeli-da \
locale-palapeli-de \
locale-palapeli-el \
locale-palapeli-en-GB \
locale-palapeli-eo \
locale-palapeli-es \
locale-palapeli-et \
locale-palapeli-eu \
locale-palapeli-fi \
locale-palapeli-fr \
locale-palapeli-ga \
locale-palapeli-gl \
locale-palapeli-he \
locale-palapeli-hi \
locale-palapeli-hr \
locale-palapeli-hu \
locale-palapeli-ia \
locale-palapeli-is \
locale-palapeli-it \
locale-palapeli-ja \
locale-palapeli-ka \
locale-palapeli-kk \
locale-palapeli-km \
locale-palapeli-ko \
locale-palapeli-lt \
locale-palapeli-lv \
locale-palapeli-mai \
locale-palapeli-ml \
locale-palapeli-mr \
locale-palapeli-nb \
locale-palapeli-nds \
locale-palapeli-nl \
locale-palapeli-nn \
locale-palapeli-pl \
locale-palapeli-pt \
locale-palapeli-pt-BR \
locale-palapeli-ro \
locale-palapeli-ru \
locale-palapeli-sk \
locale-palapeli-sl \
locale-palapeli-sq \
locale-palapeli-sr \
locale-palapeli-sr@ijekavian \
locale-palapeli-sr@ijekavianlatin \
locale-palapeli-sr@latin \
locale-palapeli-sv \
locale-palapeli-tr \
locale-palapeli-ug \
locale-palapeli-uk \
locale-palapeli-zh-CN \
locale-palapeli-zh-TW \
palapeli-lang \
palapeli-lang-all"

RDEPENDS:${PN} += "palapeli"

inherit rpm
