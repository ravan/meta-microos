SUMMARY = "Translations for package gcr3"
DESCRIPTION = "Provides translations for the 'gcr3' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "gcr3-lang-3.41.2-5.4.noarch.rpm"
RPM_HASH = "25ab0e71cc3ec7a97a6e96655c225cb18a602d5fd58204fc54936466e692304ec9304b6a554dfaeae143294ad78792f85855e26a76cb90091fb5f42b5d64e1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr3-lang \
gcr3-lang-all \
locale-gcr3-af \
locale-gcr3-ar \
locale-gcr3-as \
locale-gcr3-ast \
locale-gcr3-az \
locale-gcr3-be \
locale-gcr3-be@latin \
locale-gcr3-bg \
locale-gcr3-bn \
locale-gcr3-bn-IN \
locale-gcr3-bs \
locale-gcr3-ca \
locale-gcr3-ca@valencia \
locale-gcr3-cs \
locale-gcr3-cy \
locale-gcr3-da \
locale-gcr3-de \
locale-gcr3-dz \
locale-gcr3-el \
locale-gcr3-en-CA \
locale-gcr3-en-GB \
locale-gcr3-en@shaw \
locale-gcr3-eo \
locale-gcr3-es \
locale-gcr3-et \
locale-gcr3-eu \
locale-gcr3-fa \
locale-gcr3-fi \
locale-gcr3-fr \
locale-gcr3-fur \
locale-gcr3-ga \
locale-gcr3-gl \
locale-gcr3-gu \
locale-gcr3-he \
locale-gcr3-hi \
locale-gcr3-hr \
locale-gcr3-hu \
locale-gcr3-id \
locale-gcr3-it \
locale-gcr3-ja \
locale-gcr3-ka \
locale-gcr3-kk \
locale-gcr3-kn \
locale-gcr3-ko \
locale-gcr3-lt \
locale-gcr3-lv \
locale-gcr3-mai \
locale-gcr3-mk \
locale-gcr3-ml \
locale-gcr3-mr \
locale-gcr3-ms \
locale-gcr3-nb \
locale-gcr3-ne \
locale-gcr3-nl \
locale-gcr3-nn \
locale-gcr3-oc \
locale-gcr3-or \
locale-gcr3-pa \
locale-gcr3-pl \
locale-gcr3-pt \
locale-gcr3-pt-BR \
locale-gcr3-ro \
locale-gcr3-ru \
locale-gcr3-si \
locale-gcr3-sk \
locale-gcr3-sl \
locale-gcr3-sq \
locale-gcr3-sr \
locale-gcr3-sr@latin \
locale-gcr3-sv \
locale-gcr3-ta \
locale-gcr3-te \
locale-gcr3-th \
locale-gcr3-tr \
locale-gcr3-ug \
locale-gcr3-uk \
locale-gcr3-vi \
locale-gcr3-zh-CN \
locale-gcr3-zh-HK \
locale-gcr3-zh-TW"

RDEPENDS:${PN} += "gcr3"

inherit rpm
