SUMMARY = "Translations for package kalzium"
DESCRIPTION = "Provides translations for the 'kalzium' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kalzium-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "837cb3daf9f656f4880e945de68ede4ff76d451f4940061cc3c5f6fb5a65cc11f6fc27a3f339e15fc0713adee6cbccb5fc4d014d57a851b1e399c3e9cd744c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalzium-lang \
kalzium-lang-all \
locale-kalzium-af \
locale-kalzium-ar \
locale-kalzium-be \
locale-kalzium-bg \
locale-kalzium-bn \
locale-kalzium-br \
locale-kalzium-bs \
locale-kalzium-ca \
locale-kalzium-ca@valencia \
locale-kalzium-cs \
locale-kalzium-cy \
locale-kalzium-da \
locale-kalzium-de \
locale-kalzium-el \
locale-kalzium-en-GB \
locale-kalzium-eo \
locale-kalzium-es \
locale-kalzium-et \
locale-kalzium-eu \
locale-kalzium-fa \
locale-kalzium-fi \
locale-kalzium-fr \
locale-kalzium-ga \
locale-kalzium-gl \
locale-kalzium-gu \
locale-kalzium-he \
locale-kalzium-hi \
locale-kalzium-hr \
locale-kalzium-hu \
locale-kalzium-ia \
locale-kalzium-is \
locale-kalzium-it \
locale-kalzium-ja \
locale-kalzium-ka \
locale-kalzium-kk \
locale-kalzium-km \
locale-kalzium-ko \
locale-kalzium-lt \
locale-kalzium-lv \
locale-kalzium-mai \
locale-kalzium-mk \
locale-kalzium-ml \
locale-kalzium-mr \
locale-kalzium-ms \
locale-kalzium-nb \
locale-kalzium-nds \
locale-kalzium-ne \
locale-kalzium-nl \
locale-kalzium-nn \
locale-kalzium-oc \
locale-kalzium-pa \
locale-kalzium-pl \
locale-kalzium-pt \
locale-kalzium-pt-BR \
locale-kalzium-ro \
locale-kalzium-ru \
locale-kalzium-si \
locale-kalzium-sk \
locale-kalzium-sl \
locale-kalzium-sq \
locale-kalzium-sv \
locale-kalzium-ta \
locale-kalzium-th \
locale-kalzium-tr \
locale-kalzium-ug \
locale-kalzium-uk \
locale-kalzium-zh-CN \
locale-kalzium-zh-TW"

RDEPENDS:${PN} += "kalzium"

inherit rpm
