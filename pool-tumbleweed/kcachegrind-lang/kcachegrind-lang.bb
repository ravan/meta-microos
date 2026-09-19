SUMMARY = "Translations for package kcachegrind"
DESCRIPTION = "Provides translations for the 'kcachegrind' package."
LICENSE = "BSD-4-Clause & GPL-2.0-only & GFDL-1.2-only"

PV = "26.08.1"

RPM_NAME = "kcachegrind-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4b8ba730aec9c94aafc794416a8ce35659237f931ef0132adc36d1ee59ce00b08dfba4d9142d0c943925b8bd833f41ef36c4e31f76c93d1e1f734ac03ff4100f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcachegrind-lang \
kcachegrind-lang-all \
locale-kcachegrind-ar \
locale-kcachegrind-ast \
locale-kcachegrind-be \
locale-kcachegrind-br \
locale-kcachegrind-bs \
locale-kcachegrind-ca \
locale-kcachegrind-ca@valencia \
locale-kcachegrind-cs \
locale-kcachegrind-cy \
locale-kcachegrind-da \
locale-kcachegrind-de \
locale-kcachegrind-el \
locale-kcachegrind-en \
locale-kcachegrind-en-GB \
locale-kcachegrind-eo \
locale-kcachegrind-es \
locale-kcachegrind-et \
locale-kcachegrind-eu \
locale-kcachegrind-fa \
locale-kcachegrind-fi \
locale-kcachegrind-fr \
locale-kcachegrind-ga \
locale-kcachegrind-gl \
locale-kcachegrind-he \
locale-kcachegrind-hi \
locale-kcachegrind-hr \
locale-kcachegrind-hu \
locale-kcachegrind-ia \
locale-kcachegrind-it \
locale-kcachegrind-ja \
locale-kcachegrind-ka \
locale-kcachegrind-kk \
locale-kcachegrind-km \
locale-kcachegrind-ko \
locale-kcachegrind-lt \
locale-kcachegrind-mai \
locale-kcachegrind-mr \
locale-kcachegrind-ms \
locale-kcachegrind-nb \
locale-kcachegrind-nds \
locale-kcachegrind-ne \
locale-kcachegrind-nl \
locale-kcachegrind-nn \
locale-kcachegrind-oc \
locale-kcachegrind-pa \
locale-kcachegrind-pl \
locale-kcachegrind-pt \
locale-kcachegrind-pt-BR \
locale-kcachegrind-ro \
locale-kcachegrind-ru \
locale-kcachegrind-sk \
locale-kcachegrind-sl \
locale-kcachegrind-sq \
locale-kcachegrind-sv \
locale-kcachegrind-ta \
locale-kcachegrind-tr \
locale-kcachegrind-ug \
locale-kcachegrind-uk \
locale-kcachegrind-zh-CN \
locale-kcachegrind-zh-TW"

RDEPENDS:${PN} += "kcachegrind"

inherit rpm
