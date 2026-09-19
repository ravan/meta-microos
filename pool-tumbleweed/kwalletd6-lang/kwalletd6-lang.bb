SUMMARY = "Translations for package kwalletd6"
DESCRIPTION = "Provides translations for the 'kwalletd6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kwalletd6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "0fbc112154baf24c0e7d452a4b6ea1e07534fdb898a9b93da819894e74289fddb7b6ce4ef6b6cdbfad6bc94a7e3428f5c4f60d3e423d6fe518926dcb0c855d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwalletd6-lang \
kwalletd6-lang-all \
locale-kwalletd6-ar \
locale-kwalletd6-ast \
locale-kwalletd6-az \
locale-kwalletd6-be \
locale-kwalletd6-bg \
locale-kwalletd6-bn \
locale-kwalletd6-bn-IN \
locale-kwalletd6-bs \
locale-kwalletd6-ca \
locale-kwalletd6-ca@valencia \
locale-kwalletd6-cs \
locale-kwalletd6-da \
locale-kwalletd6-de \
locale-kwalletd6-el \
locale-kwalletd6-en-GB \
locale-kwalletd6-eo \
locale-kwalletd6-es \
locale-kwalletd6-et \
locale-kwalletd6-eu \
locale-kwalletd6-fa \
locale-kwalletd6-fi \
locale-kwalletd6-fr \
locale-kwalletd6-ga \
locale-kwalletd6-gd \
locale-kwalletd6-gl \
locale-kwalletd6-gu \
locale-kwalletd6-he \
locale-kwalletd6-hi \
locale-kwalletd6-hr \
locale-kwalletd6-hu \
locale-kwalletd6-ia \
locale-kwalletd6-id \
locale-kwalletd6-is \
locale-kwalletd6-it \
locale-kwalletd6-ja \
locale-kwalletd6-ka \
locale-kwalletd6-kk \
locale-kwalletd6-km \
locale-kwalletd6-kn \
locale-kwalletd6-ko \
locale-kwalletd6-lt \
locale-kwalletd6-lv \
locale-kwalletd6-mai \
locale-kwalletd6-mk \
locale-kwalletd6-ml \
locale-kwalletd6-mr \
locale-kwalletd6-ms \
locale-kwalletd6-nb \
locale-kwalletd6-nds \
locale-kwalletd6-nl \
locale-kwalletd6-nn \
locale-kwalletd6-or \
locale-kwalletd6-pa \
locale-kwalletd6-pl \
locale-kwalletd6-pt \
locale-kwalletd6-pt-BR \
locale-kwalletd6-ro \
locale-kwalletd6-ru \
locale-kwalletd6-si \
locale-kwalletd6-sk \
locale-kwalletd6-sl \
locale-kwalletd6-sq \
locale-kwalletd6-sr \
locale-kwalletd6-sr@ijekavian \
locale-kwalletd6-sr@ijekavianlatin \
locale-kwalletd6-sr@latin \
locale-kwalletd6-sv \
locale-kwalletd6-te \
locale-kwalletd6-th \
locale-kwalletd6-tr \
locale-kwalletd6-ug \
locale-kwalletd6-uk \
locale-kwalletd6-vi \
locale-kwalletd6-wa \
locale-kwalletd6-zh-CN \
locale-kwalletd6-zh-TW"

RDEPENDS:${PN} += "kwalletd6"

inherit rpm
