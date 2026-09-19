SUMMARY = "Translations for package kiriki"
DESCRIPTION = "Provides translations for the 'kiriki' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kiriki-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "261437a776be893c0510af8c6700f094057bc28cb6c825f1c37c45b71267a8e7b7fed8f879c607e3b0c4b7f17e16d22e0b1d84f3fef7dc4abd0c2aeb81455ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiriki-lang \
kiriki-lang-all \
locale-kiriki-ar \
locale-kiriki-ast \
locale-kiriki-be \
locale-kiriki-bs \
locale-kiriki-ca \
locale-kiriki-ca@valencia \
locale-kiriki-cs \
locale-kiriki-da \
locale-kiriki-de \
locale-kiriki-el \
locale-kiriki-en-GB \
locale-kiriki-eo \
locale-kiriki-es \
locale-kiriki-et \
locale-kiriki-eu \
locale-kiriki-fi \
locale-kiriki-fr \
locale-kiriki-ga \
locale-kiriki-gl \
locale-kiriki-he \
locale-kiriki-hi \
locale-kiriki-hr \
locale-kiriki-hu \
locale-kiriki-ia \
locale-kiriki-id \
locale-kiriki-is \
locale-kiriki-it \
locale-kiriki-ja \
locale-kiriki-ka \
locale-kiriki-kk \
locale-kiriki-km \
locale-kiriki-ko \
locale-kiriki-lt \
locale-kiriki-lv \
locale-kiriki-mai \
locale-kiriki-ml \
locale-kiriki-mr \
locale-kiriki-nb \
locale-kiriki-nds \
locale-kiriki-nl \
locale-kiriki-nn \
locale-kiriki-oc \
locale-kiriki-pl \
locale-kiriki-pt \
locale-kiriki-pt-BR \
locale-kiriki-ro \
locale-kiriki-ru \
locale-kiriki-sk \
locale-kiriki-sl \
locale-kiriki-sr \
locale-kiriki-sr@ijekavian \
locale-kiriki-sr@ijekavianlatin \
locale-kiriki-sr@latin \
locale-kiriki-sv \
locale-kiriki-tr \
locale-kiriki-ug \
locale-kiriki-uk \
locale-kiriki-zh-CN \
locale-kiriki-zh-TW"

RDEPENDS:${PN} += "kiriki"

inherit rpm
