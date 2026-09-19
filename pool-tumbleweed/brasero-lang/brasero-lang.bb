SUMMARY = "Translations for package brasero"
DESCRIPTION = "Provides translations for the 'brasero' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3+43"

RPM_NAME = "brasero-lang-3.12.3+43-3.3.noarch.rpm"
RPM_HASH = "9d334272220397018d33cebadab6f69a1bf917c549203722da286598f37c0dc51f29d2d536918a17c25197eb3c51be17a49b22eea9d55e484a2e7a602a6c5c3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brasero-lang \
brasero-lang-all \
locale-brasero-af \
locale-brasero-ar \
locale-brasero-as \
locale-brasero-ast \
locale-brasero-be \
locale-brasero-bg \
locale-brasero-bn \
locale-brasero-bn-IN \
locale-brasero-br \
locale-brasero-bs \
locale-brasero-ca \
locale-brasero-ca@valencia \
locale-brasero-cs \
locale-brasero-da \
locale-brasero-de \
locale-brasero-dz \
locale-brasero-el \
locale-brasero-en-CA \
locale-brasero-en-GB \
locale-brasero-en@shaw \
locale-brasero-eo \
locale-brasero-es \
locale-brasero-et \
locale-brasero-eu \
locale-brasero-fa \
locale-brasero-fi \
locale-brasero-fr \
locale-brasero-fur \
locale-brasero-ga \
locale-brasero-gd \
locale-brasero-gl \
locale-brasero-gu \
locale-brasero-he \
locale-brasero-hi \
locale-brasero-hr \
locale-brasero-hu \
locale-brasero-id \
locale-brasero-is \
locale-brasero-it \
locale-brasero-ja \
locale-brasero-ka \
locale-brasero-kk \
locale-brasero-km \
locale-brasero-kn \
locale-brasero-ko \
locale-brasero-lt \
locale-brasero-lv \
locale-brasero-mai \
locale-brasero-mk \
locale-brasero-ml \
locale-brasero-mr \
locale-brasero-ms \
locale-brasero-nb \
locale-brasero-nds \
locale-brasero-ne \
locale-brasero-nl \
locale-brasero-nn \
locale-brasero-oc \
locale-brasero-or \
locale-brasero-pa \
locale-brasero-pl \
locale-brasero-pt \
locale-brasero-pt-BR \
locale-brasero-ro \
locale-brasero-ru \
locale-brasero-sk \
locale-brasero-sl \
locale-brasero-sr \
locale-brasero-sr@latin \
locale-brasero-sv \
locale-brasero-ta \
locale-brasero-te \
locale-brasero-th \
locale-brasero-tr \
locale-brasero-ug \
locale-brasero-uk \
locale-brasero-vi \
locale-brasero-zh-CN \
locale-brasero-zh-HK \
locale-brasero-zh-TW"

RDEPENDS:${PN} += "brasero"

inherit rpm
