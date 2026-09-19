SUMMARY = "Translations for package libPlasma5Support6"
DESCRIPTION = "Provides translations for the 'libPlasma5Support6' package."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libPlasma5Support6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "b3edaa0e85b5432f51d2b9bfd0d3e59ed2201110f0b6f535e1ad3f1b83454a5319aa4e1c2fdf6a2144f3bf5b5ba89c88d4fac08d544d3bc021b9186e02c80bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libPlasma5Support6-lang \
libPlasma5Support6-lang-all \
locale-libPlasma5Support6-ar \
locale-libPlasma5Support6-ast \
locale-libPlasma5Support6-az \
locale-libPlasma5Support6-be \
locale-libPlasma5Support6-bg \
locale-libPlasma5Support6-bn \
locale-libPlasma5Support6-bn-IN \
locale-libPlasma5Support6-bs \
locale-libPlasma5Support6-ca \
locale-libPlasma5Support6-ca@valencia \
locale-libPlasma5Support6-cs \
locale-libPlasma5Support6-da \
locale-libPlasma5Support6-de \
locale-libPlasma5Support6-el \
locale-libPlasma5Support6-en-GB \
locale-libPlasma5Support6-eo \
locale-libPlasma5Support6-es \
locale-libPlasma5Support6-et \
locale-libPlasma5Support6-eu \
locale-libPlasma5Support6-fa \
locale-libPlasma5Support6-fi \
locale-libPlasma5Support6-fr \
locale-libPlasma5Support6-ga \
locale-libPlasma5Support6-gl \
locale-libPlasma5Support6-gu \
locale-libPlasma5Support6-he \
locale-libPlasma5Support6-hi \
locale-libPlasma5Support6-hr \
locale-libPlasma5Support6-hu \
locale-libPlasma5Support6-ia \
locale-libPlasma5Support6-id \
locale-libPlasma5Support6-is \
locale-libPlasma5Support6-it \
locale-libPlasma5Support6-ja \
locale-libPlasma5Support6-ka \
locale-libPlasma5Support6-kk \
locale-libPlasma5Support6-km \
locale-libPlasma5Support6-kn \
locale-libPlasma5Support6-ko \
locale-libPlasma5Support6-lt \
locale-libPlasma5Support6-lv \
locale-libPlasma5Support6-mai \
locale-libPlasma5Support6-ml \
locale-libPlasma5Support6-mr \
locale-libPlasma5Support6-ms \
locale-libPlasma5Support6-nb \
locale-libPlasma5Support6-nds \
locale-libPlasma5Support6-nl \
locale-libPlasma5Support6-nn \
locale-libPlasma5Support6-pa \
locale-libPlasma5Support6-pl \
locale-libPlasma5Support6-pt \
locale-libPlasma5Support6-pt-BR \
locale-libPlasma5Support6-ro \
locale-libPlasma5Support6-ru \
locale-libPlasma5Support6-si \
locale-libPlasma5Support6-sk \
locale-libPlasma5Support6-sl \
locale-libPlasma5Support6-sq \
locale-libPlasma5Support6-sr \
locale-libPlasma5Support6-sr@ijekavian \
locale-libPlasma5Support6-sr@ijekavianlatin \
locale-libPlasma5Support6-sr@latin \
locale-libPlasma5Support6-sv \
locale-libPlasma5Support6-ta \
locale-libPlasma5Support6-th \
locale-libPlasma5Support6-tr \
locale-libPlasma5Support6-ug \
locale-libPlasma5Support6-uk \
locale-libPlasma5Support6-vi \
locale-libPlasma5Support6-wa \
locale-libPlasma5Support6-zh-CN \
locale-libPlasma5Support6-zh-TW"

RDEPENDS:${PN} += "libPlasma5Support6"

inherit rpm
