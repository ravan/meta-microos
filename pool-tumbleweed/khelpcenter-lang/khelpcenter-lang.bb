SUMMARY = "Translations for package khelpcenter"
DESCRIPTION = "Provides translations for the 'khelpcenter' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "khelpcenter-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "5275a64fd83373df1d14e92ae05d831b5283cc02162ebd75ab4d5201ab0ae4375e107a2252a33c0b750d75f99470b0aa2baf9fac463892542d8517de2642376a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "khelpcenter-lang \
khelpcenter-lang-all \
locale-khelpcenter-af \
locale-khelpcenter-ar \
locale-khelpcenter-ast \
locale-khelpcenter-be \
locale-khelpcenter-be@latin \
locale-khelpcenter-bg \
locale-khelpcenter-bn \
locale-khelpcenter-bn-IN \
locale-khelpcenter-br \
locale-khelpcenter-bs \
locale-khelpcenter-ca \
locale-khelpcenter-ca@valencia \
locale-khelpcenter-cs \
locale-khelpcenter-cy \
locale-khelpcenter-da \
locale-khelpcenter-de \
locale-khelpcenter-el \
locale-khelpcenter-en-GB \
locale-khelpcenter-eo \
locale-khelpcenter-es \
locale-khelpcenter-et \
locale-khelpcenter-eu \
locale-khelpcenter-fa \
locale-khelpcenter-fi \
locale-khelpcenter-fr \
locale-khelpcenter-ga \
locale-khelpcenter-gl \
locale-khelpcenter-gu \
locale-khelpcenter-he \
locale-khelpcenter-hi \
locale-khelpcenter-hr \
locale-khelpcenter-hu \
locale-khelpcenter-ia \
locale-khelpcenter-id \
locale-khelpcenter-is \
locale-khelpcenter-it \
locale-khelpcenter-ja \
locale-khelpcenter-ka \
locale-khelpcenter-kk \
locale-khelpcenter-km \
locale-khelpcenter-kn \
locale-khelpcenter-ko \
locale-khelpcenter-lt \
locale-khelpcenter-lv \
locale-khelpcenter-mai \
locale-khelpcenter-mk \
locale-khelpcenter-ml \
locale-khelpcenter-mr \
locale-khelpcenter-ms \
locale-khelpcenter-nb \
locale-khelpcenter-nds \
locale-khelpcenter-ne \
locale-khelpcenter-nl \
locale-khelpcenter-nn \
locale-khelpcenter-oc \
locale-khelpcenter-or \
locale-khelpcenter-pa \
locale-khelpcenter-pl \
locale-khelpcenter-pt \
locale-khelpcenter-pt-BR \
locale-khelpcenter-ro \
locale-khelpcenter-ru \
locale-khelpcenter-si \
locale-khelpcenter-sk \
locale-khelpcenter-sl \
locale-khelpcenter-sq \
locale-khelpcenter-sr \
locale-khelpcenter-sr@ijekavian \
locale-khelpcenter-sr@ijekavianlatin \
locale-khelpcenter-sr@latin \
locale-khelpcenter-sv \
locale-khelpcenter-ta \
locale-khelpcenter-te \
locale-khelpcenter-th \
locale-khelpcenter-tr \
locale-khelpcenter-ug \
locale-khelpcenter-uk \
locale-khelpcenter-vi \
locale-khelpcenter-wa \
locale-khelpcenter-zh-CN \
locale-khelpcenter-zh-TW"

RDEPENDS:${PN} += "khelpcenter"

inherit rpm
