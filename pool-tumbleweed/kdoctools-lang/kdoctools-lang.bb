SUMMARY = "Translations for package kdoctools"
DESCRIPTION = "Provides translations for the 'kdoctools' package."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.116.0"

RPM_NAME = "kdoctools-lang-5.116.0-1.12.noarch.rpm"
RPM_HASH = "736d009fc90c7ee74eb25bbc96f25123ca926a75f9d0b4fc39e241fa749686268ce65a08454743597fe17003aa3d827a4c7d217f0227ed1c65b2941a1849ec7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdoctools-lang \
kdoctools-lang-all \
locale-kdoctools-af \
locale-kdoctools-ar \
locale-kdoctools-az \
locale-kdoctools-be \
locale-kdoctools-bg \
locale-kdoctools-bn \
locale-kdoctools-br \
locale-kdoctools-bs \
locale-kdoctools-ca \
locale-kdoctools-ca@valencia \
locale-kdoctools-cs \
locale-kdoctools-cy \
locale-kdoctools-da \
locale-kdoctools-de \
locale-kdoctools-el \
locale-kdoctools-en-GB \
locale-kdoctools-eo \
locale-kdoctools-es \
locale-kdoctools-et \
locale-kdoctools-eu \
locale-kdoctools-fa \
locale-kdoctools-fi \
locale-kdoctools-fr \
locale-kdoctools-ga \
locale-kdoctools-gd \
locale-kdoctools-gl \
locale-kdoctools-gu \
locale-kdoctools-he \
locale-kdoctools-hi \
locale-kdoctools-hr \
locale-kdoctools-hu \
locale-kdoctools-ia \
locale-kdoctools-id \
locale-kdoctools-is \
locale-kdoctools-it \
locale-kdoctools-ja \
locale-kdoctools-ka \
locale-kdoctools-kk \
locale-kdoctools-km \
locale-kdoctools-kn \
locale-kdoctools-ko \
locale-kdoctools-lt \
locale-kdoctools-lv \
locale-kdoctools-mai \
locale-kdoctools-mk \
locale-kdoctools-ml \
locale-kdoctools-mr \
locale-kdoctools-ms \
locale-kdoctools-nb \
locale-kdoctools-nds \
locale-kdoctools-ne \
locale-kdoctools-nl \
locale-kdoctools-nn \
locale-kdoctools-oc \
locale-kdoctools-pa \
locale-kdoctools-pl \
locale-kdoctools-pt \
locale-kdoctools-pt-BR \
locale-kdoctools-ro \
locale-kdoctools-ru \
locale-kdoctools-sk \
locale-kdoctools-sl \
locale-kdoctools-sq \
locale-kdoctools-sr \
locale-kdoctools-sr@ijekavian \
locale-kdoctools-sr@ijekavianlatin \
locale-kdoctools-sr@latin \
locale-kdoctools-sv \
locale-kdoctools-ta \
locale-kdoctools-th \
locale-kdoctools-tr \
locale-kdoctools-ug \
locale-kdoctools-uk \
locale-kdoctools-vi \
locale-kdoctools-zh-CN \
locale-kdoctools-zh-TW"

RDEPENDS:${PN} += "kdoctools"

inherit rpm
