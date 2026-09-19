SUMMARY = "Translations for package kfourinline"
DESCRIPTION = "Provides translations for the 'kfourinline' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kfourinline-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "d8f74c36c0130e379c0ae4876a99a30ed23ad04317368f61a0002cb21a82b59b87a372797ea36c468268a9e6456714a3f09fdd58732fae509db25dfa39ff2195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kfourinline-lang \
kfourinline-lang-all \
locale-kfourinline-af \
locale-kfourinline-ar \
locale-kfourinline-ast \
locale-kfourinline-be \
locale-kfourinline-br \
locale-kfourinline-bs \
locale-kfourinline-ca \
locale-kfourinline-ca@valencia \
locale-kfourinline-cs \
locale-kfourinline-cy \
locale-kfourinline-da \
locale-kfourinline-de \
locale-kfourinline-el \
locale-kfourinline-en-GB \
locale-kfourinline-eo \
locale-kfourinline-es \
locale-kfourinline-et \
locale-kfourinline-eu \
locale-kfourinline-fa \
locale-kfourinline-fi \
locale-kfourinline-fr \
locale-kfourinline-ga \
locale-kfourinline-gl \
locale-kfourinline-he \
locale-kfourinline-hi \
locale-kfourinline-hr \
locale-kfourinline-hu \
locale-kfourinline-ia \
locale-kfourinline-id \
locale-kfourinline-is \
locale-kfourinline-it \
locale-kfourinline-ja \
locale-kfourinline-ka \
locale-kfourinline-kk \
locale-kfourinline-km \
locale-kfourinline-ko \
locale-kfourinline-lt \
locale-kfourinline-lv \
locale-kfourinline-mai \
locale-kfourinline-mk \
locale-kfourinline-ml \
locale-kfourinline-mr \
locale-kfourinline-nb \
locale-kfourinline-nds \
locale-kfourinline-ne \
locale-kfourinline-nl \
locale-kfourinline-nn \
locale-kfourinline-oc \
locale-kfourinline-pa \
locale-kfourinline-pl \
locale-kfourinline-pt \
locale-kfourinline-pt-BR \
locale-kfourinline-ro \
locale-kfourinline-ru \
locale-kfourinline-sk \
locale-kfourinline-sl \
locale-kfourinline-sr \
locale-kfourinline-sr@ijekavian \
locale-kfourinline-sr@ijekavianlatin \
locale-kfourinline-sr@latin \
locale-kfourinline-sv \
locale-kfourinline-ta \
locale-kfourinline-te \
locale-kfourinline-th \
locale-kfourinline-tr \
locale-kfourinline-ug \
locale-kfourinline-uk \
locale-kfourinline-zh-CN \
locale-kfourinline-zh-TW"

RDEPENDS:${PN} += "kfourinline"

inherit rpm
