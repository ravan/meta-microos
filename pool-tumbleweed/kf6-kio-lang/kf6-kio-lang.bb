SUMMARY = "Translations for package kf6-kio"
DESCRIPTION = "Provides translations for the 'kf6-kio' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kio-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "1933bb51c8cbd5063f83c0e817522a723b982a8dd71b9168e1e31c8954b9f696b58c4cf737888655d6f388d5413a2e0ac4bc4cedcc4a49d850bd4b9481f18c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kio-lang \
kf6-kio-lang-all \
locale-kf6-kio-af \
locale-kf6-kio-ar \
locale-kf6-kio-ast \
locale-kf6-kio-az \
locale-kf6-kio-be \
locale-kf6-kio-be@latin \
locale-kf6-kio-bg \
locale-kf6-kio-bn \
locale-kf6-kio-br \
locale-kf6-kio-bs \
locale-kf6-kio-ca \
locale-kf6-kio-ca@valencia \
locale-kf6-kio-cs \
locale-kf6-kio-cy \
locale-kf6-kio-da \
locale-kf6-kio-de \
locale-kf6-kio-el \
locale-kf6-kio-en-GB \
locale-kf6-kio-eo \
locale-kf6-kio-es \
locale-kf6-kio-et \
locale-kf6-kio-eu \
locale-kf6-kio-fa \
locale-kf6-kio-fi \
locale-kf6-kio-fr \
locale-kf6-kio-ga \
locale-kf6-kio-gl \
locale-kf6-kio-gu \
locale-kf6-kio-he \
locale-kf6-kio-hi \
locale-kf6-kio-hr \
locale-kf6-kio-hu \
locale-kf6-kio-ia \
locale-kf6-kio-id \
locale-kf6-kio-is \
locale-kf6-kio-it \
locale-kf6-kio-ja \
locale-kf6-kio-ka \
locale-kf6-kio-kk \
locale-kf6-kio-km \
locale-kf6-kio-ko \
locale-kf6-kio-lt \
locale-kf6-kio-lv \
locale-kf6-kio-mai \
locale-kf6-kio-mk \
locale-kf6-kio-ml \
locale-kf6-kio-mr \
locale-kf6-kio-ms \
locale-kf6-kio-nb \
locale-kf6-kio-nds \
locale-kf6-kio-ne \
locale-kf6-kio-nl \
locale-kf6-kio-nn \
locale-kf6-kio-oc \
locale-kf6-kio-pa \
locale-kf6-kio-pl \
locale-kf6-kio-pt \
locale-kf6-kio-pt-BR \
locale-kf6-kio-ro \
locale-kf6-kio-ru \
locale-kf6-kio-sk \
locale-kf6-kio-sl \
locale-kf6-kio-sq \
locale-kf6-kio-sr \
locale-kf6-kio-sr@ijekavian \
locale-kf6-kio-sr@ijekavianlatin \
locale-kf6-kio-sr@latin \
locale-kf6-kio-sv \
locale-kf6-kio-ta \
locale-kf6-kio-th \
locale-kf6-kio-tr \
locale-kf6-kio-ug \
locale-kf6-kio-uk \
locale-kf6-kio-vi \
locale-kf6-kio-wa \
locale-kf6-kio-zh-CN \
locale-kf6-kio-zh-TW"

RDEPENDS:${PN} += "kf6-kio"

inherit rpm
