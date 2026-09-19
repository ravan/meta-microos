SUMMARY = "Translations for package ktuberling"
DESCRIPTION = "Provides translations for the 'ktuberling' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ktuberling-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "85b25c12852ce8a26ad6998a36c25317b8e7639e114ab1d86621a88532507e431b6beec256f394eb6a516033f15142e3570fc2bf20b7b9e54fd94afbd43152c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktuberling-lang \
ktuberling-lang-all \
locale-ktuberling-af \
locale-ktuberling-ar \
locale-ktuberling-ast \
locale-ktuberling-be \
locale-ktuberling-br \
locale-ktuberling-bs \
locale-ktuberling-ca \
locale-ktuberling-ca@valencia \
locale-ktuberling-cs \
locale-ktuberling-cy \
locale-ktuberling-da \
locale-ktuberling-de \
locale-ktuberling-el \
locale-ktuberling-en-GB \
locale-ktuberling-eo \
locale-ktuberling-es \
locale-ktuberling-et \
locale-ktuberling-eu \
locale-ktuberling-fa \
locale-ktuberling-fi \
locale-ktuberling-fr \
locale-ktuberling-ga \
locale-ktuberling-gl \
locale-ktuberling-he \
locale-ktuberling-hi \
locale-ktuberling-hr \
locale-ktuberling-hu \
locale-ktuberling-ia \
locale-ktuberling-id \
locale-ktuberling-is \
locale-ktuberling-it \
locale-ktuberling-ja \
locale-ktuberling-ka \
locale-ktuberling-kk \
locale-ktuberling-km \
locale-ktuberling-ko \
locale-ktuberling-lt \
locale-ktuberling-lv \
locale-ktuberling-mai \
locale-ktuberling-mk \
locale-ktuberling-ml \
locale-ktuberling-mr \
locale-ktuberling-nb \
locale-ktuberling-nds \
locale-ktuberling-ne \
locale-ktuberling-nl \
locale-ktuberling-nn \
locale-ktuberling-oc \
locale-ktuberling-pa \
locale-ktuberling-pl \
locale-ktuberling-pt \
locale-ktuberling-pt-BR \
locale-ktuberling-ro \
locale-ktuberling-ru \
locale-ktuberling-sk \
locale-ktuberling-sl \
locale-ktuberling-sq \
locale-ktuberling-sr \
locale-ktuberling-sr@ijekavian \
locale-ktuberling-sr@ijekavianlatin \
locale-ktuberling-sr@latin \
locale-ktuberling-sv \
locale-ktuberling-ta \
locale-ktuberling-tr \
locale-ktuberling-ug \
locale-ktuberling-uk \
locale-ktuberling-wa \
locale-ktuberling-zh-CN \
locale-ktuberling-zh-TW"

RDEPENDS:${PN} += "ktuberling"

inherit rpm
