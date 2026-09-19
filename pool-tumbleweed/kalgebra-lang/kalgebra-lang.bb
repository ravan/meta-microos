SUMMARY = "Translations for package kalgebra"
DESCRIPTION = "Provides translations for the 'kalgebra' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalgebra-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "48f1a8d0e390f0df63f450eb0a36f9a240f7aee10f65c2fc93862c5e6eb145fcbbe3032b5a2f8baee32f2d8a1e2e92aa7e73e6fbb6bb4873bb289c3092e5d74b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalgebra-lang \
kalgebra-lang-all \
locale-kalgebra-ar \
locale-kalgebra-ast \
locale-kalgebra-be \
locale-kalgebra-bg \
locale-kalgebra-bs \
locale-kalgebra-ca \
locale-kalgebra-ca@valencia \
locale-kalgebra-cs \
locale-kalgebra-da \
locale-kalgebra-de \
locale-kalgebra-el \
locale-kalgebra-en-GB \
locale-kalgebra-eo \
locale-kalgebra-es \
locale-kalgebra-et \
locale-kalgebra-eu \
locale-kalgebra-fa \
locale-kalgebra-fi \
locale-kalgebra-fr \
locale-kalgebra-ga \
locale-kalgebra-gl \
locale-kalgebra-he \
locale-kalgebra-hi \
locale-kalgebra-hr \
locale-kalgebra-hu \
locale-kalgebra-ia \
locale-kalgebra-it \
locale-kalgebra-ja \
locale-kalgebra-ka \
locale-kalgebra-kk \
locale-kalgebra-km \
locale-kalgebra-ko \
locale-kalgebra-lt \
locale-kalgebra-lv \
locale-kalgebra-mai \
locale-kalgebra-ml \
locale-kalgebra-mr \
locale-kalgebra-nb \
locale-kalgebra-nds \
locale-kalgebra-nl \
locale-kalgebra-nn \
locale-kalgebra-oc \
locale-kalgebra-pa \
locale-kalgebra-pl \
locale-kalgebra-pt \
locale-kalgebra-pt-BR \
locale-kalgebra-ro \
locale-kalgebra-ru \
locale-kalgebra-si \
locale-kalgebra-sk \
locale-kalgebra-sl \
locale-kalgebra-sv \
locale-kalgebra-te \
locale-kalgebra-tr \
locale-kalgebra-ug \
locale-kalgebra-uk \
locale-kalgebra-zh-CN \
locale-kalgebra-zh-TW"

RDEPENDS:${PN} += "kalgebra"

inherit rpm
