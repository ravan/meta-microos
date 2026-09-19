SUMMARY = "Translations for package kig"
DESCRIPTION = "Provides translations for the 'kig' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kig-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "38d033f1ed395b0e7416feb461b56972b75e649424dd33f52a3028b9955e46968a65d2744293e1dbe32e3f5b1ffcb06e36d7d0fb9cc95f27e377c0cd2a0ff506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kig-lang \
kig-lang-all \
locale-kig-ar \
locale-kig-be \
locale-kig-bg \
locale-kig-bn \
locale-kig-br \
locale-kig-bs \
locale-kig-ca \
locale-kig-ca@valencia \
locale-kig-cs \
locale-kig-cy \
locale-kig-da \
locale-kig-de \
locale-kig-el \
locale-kig-en-GB \
locale-kig-eo \
locale-kig-es \
locale-kig-et \
locale-kig-eu \
locale-kig-fa \
locale-kig-fi \
locale-kig-fr \
locale-kig-ga \
locale-kig-gl \
locale-kig-hi \
locale-kig-hr \
locale-kig-hu \
locale-kig-is \
locale-kig-it \
locale-kig-ja \
locale-kig-ka \
locale-kig-kk \
locale-kig-km \
locale-kig-ko \
locale-kig-lt \
locale-kig-lv \
locale-kig-mai \
locale-kig-mk \
locale-kig-ml \
locale-kig-mr \
locale-kig-ms \
locale-kig-nb \
locale-kig-nds \
locale-kig-ne \
locale-kig-nl \
locale-kig-nn \
locale-kig-oc \
locale-kig-pa \
locale-kig-pl \
locale-kig-pt \
locale-kig-pt-BR \
locale-kig-ro \
locale-kig-ru \
locale-kig-si \
locale-kig-sk \
locale-kig-sl \
locale-kig-sq \
locale-kig-sv \
locale-kig-ta \
locale-kig-tr \
locale-kig-ug \
locale-kig-uk \
locale-kig-zh-CN \
locale-kig-zh-TW"

RDEPENDS:${PN} += "kig"

inherit rpm
