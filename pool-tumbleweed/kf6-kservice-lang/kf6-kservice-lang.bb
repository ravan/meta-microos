SUMMARY = "Translations for package kf6-kservice"
DESCRIPTION = "Provides translations for the 'kf6-kservice' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kservice-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "a8945a2d0aa22c4c595a618e5772d6551e7504ed2b62ad969809d5430612c032cfaf003b2ae1db9e2e9d894d290b6dce76132e1a9995f13503536801c3382e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kservice-lang \
kf6-kservice-lang-all \
locale-kf6-kservice-af \
locale-kf6-kservice-ar \
locale-kf6-kservice-as \
locale-kf6-kservice-ast \
locale-kf6-kservice-az \
locale-kf6-kservice-be \
locale-kf6-kservice-be@latin \
locale-kf6-kservice-bg \
locale-kf6-kservice-bn \
locale-kf6-kservice-bn-IN \
locale-kf6-kservice-br \
locale-kf6-kservice-bs \
locale-kf6-kservice-ca \
locale-kf6-kservice-ca@valencia \
locale-kf6-kservice-cs \
locale-kf6-kservice-cy \
locale-kf6-kservice-da \
locale-kf6-kservice-de \
locale-kf6-kservice-el \
locale-kf6-kservice-en-GB \
locale-kf6-kservice-eo \
locale-kf6-kservice-es \
locale-kf6-kservice-et \
locale-kf6-kservice-eu \
locale-kf6-kservice-fa \
locale-kf6-kservice-fi \
locale-kf6-kservice-fr \
locale-kf6-kservice-ga \
locale-kf6-kservice-gd \
locale-kf6-kservice-gl \
locale-kf6-kservice-gu \
locale-kf6-kservice-he \
locale-kf6-kservice-hi \
locale-kf6-kservice-hr \
locale-kf6-kservice-hu \
locale-kf6-kservice-ia \
locale-kf6-kservice-id \
locale-kf6-kservice-is \
locale-kf6-kservice-it \
locale-kf6-kservice-ja \
locale-kf6-kservice-ka \
locale-kf6-kservice-kk \
locale-kf6-kservice-km \
locale-kf6-kservice-kn \
locale-kf6-kservice-ko \
locale-kf6-kservice-lt \
locale-kf6-kservice-lv \
locale-kf6-kservice-mai \
locale-kf6-kservice-mk \
locale-kf6-kservice-ml \
locale-kf6-kservice-mr \
locale-kf6-kservice-ms \
locale-kf6-kservice-nb \
locale-kf6-kservice-nds \
locale-kf6-kservice-ne \
locale-kf6-kservice-nl \
locale-kf6-kservice-nn \
locale-kf6-kservice-oc \
locale-kf6-kservice-or \
locale-kf6-kservice-pa \
locale-kf6-kservice-pl \
locale-kf6-kservice-pt \
locale-kf6-kservice-pt-BR \
locale-kf6-kservice-ro \
locale-kf6-kservice-ru \
locale-kf6-kservice-si \
locale-kf6-kservice-sk \
locale-kf6-kservice-sl \
locale-kf6-kservice-sq \
locale-kf6-kservice-sr \
locale-kf6-kservice-sr@ijekavian \
locale-kf6-kservice-sr@ijekavianlatin \
locale-kf6-kservice-sr@latin \
locale-kf6-kservice-sv \
locale-kf6-kservice-ta \
locale-kf6-kservice-te \
locale-kf6-kservice-th \
locale-kf6-kservice-tr \
locale-kf6-kservice-ug \
locale-kf6-kservice-uk \
locale-kf6-kservice-vi \
locale-kf6-kservice-wa \
locale-kf6-kservice-zh-CN \
locale-kf6-kservice-zh-HK \
locale-kf6-kservice-zh-TW"

RDEPENDS:${PN} += "kf6-kservice"

inherit rpm
