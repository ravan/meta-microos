SUMMARY = "Translations for package baobab"
DESCRIPTION = "Provides translations for the 'baobab' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "baobab-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "ad5d865a35c612db5da1f0801debf21f108c6a28d92877a19181fb2e3f7baa0b69f5be83a3edf73408968285e4360b6cde63b38e719dff8c838f74be3d480a7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baobab-lang \
baobab-lang-all \
locale-baobab-af \
locale-baobab-ar \
locale-baobab-as \
locale-baobab-ast \
locale-baobab-az \
locale-baobab-be \
locale-baobab-be@latin \
locale-baobab-bg \
locale-baobab-bn \
locale-baobab-bn-IN \
locale-baobab-br \
locale-baobab-bs \
locale-baobab-ca \
locale-baobab-ca@valencia \
locale-baobab-cs \
locale-baobab-cy \
locale-baobab-da \
locale-baobab-de \
locale-baobab-dz \
locale-baobab-el \
locale-baobab-en-CA \
locale-baobab-en-GB \
locale-baobab-en@shaw \
locale-baobab-eo \
locale-baobab-es \
locale-baobab-et \
locale-baobab-eu \
locale-baobab-fa \
locale-baobab-fi \
locale-baobab-fr \
locale-baobab-fur \
locale-baobab-ga \
locale-baobab-gd \
locale-baobab-gl \
locale-baobab-gu \
locale-baobab-he \
locale-baobab-hi \
locale-baobab-hr \
locale-baobab-hu \
locale-baobab-ia \
locale-baobab-id \
locale-baobab-is \
locale-baobab-it \
locale-baobab-ja \
locale-baobab-ka \
locale-baobab-kk \
locale-baobab-km \
locale-baobab-kn \
locale-baobab-ko \
locale-baobab-lt \
locale-baobab-lv \
locale-baobab-mai \
locale-baobab-mk \
locale-baobab-ml \
locale-baobab-mr \
locale-baobab-ms \
locale-baobab-nb \
locale-baobab-nds \
locale-baobab-ne \
locale-baobab-nl \
locale-baobab-nn \
locale-baobab-oc \
locale-baobab-or \
locale-baobab-pa \
locale-baobab-pl \
locale-baobab-pt \
locale-baobab-pt-BR \
locale-baobab-ro \
locale-baobab-ru \
locale-baobab-si \
locale-baobab-sk \
locale-baobab-sl \
locale-baobab-sq \
locale-baobab-sr \
locale-baobab-sr@latin \
locale-baobab-sv \
locale-baobab-ta \
locale-baobab-te \
locale-baobab-th \
locale-baobab-tr \
locale-baobab-ug \
locale-baobab-uk \
locale-baobab-vi \
locale-baobab-wa \
locale-baobab-zh-CN \
locale-baobab-zh-HK \
locale-baobab-zh-TW"

RDEPENDS:${PN} += "baobab"

inherit rpm
