SUMMARY = "Translations for package kio-extras"
DESCRIPTION = "Provides translations for the 'kio-extras' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kio-extras-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "cbc1e02ede9a91f44558657228b8d257a42427cdbfc3fa2138c9aba66ed06ff3b83e3539607a2296aab5029b0536e7c3ff4494169a2e119fd83514614a49224c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-extras-lang \
kio-extras-lang-all \
locale-kio-extras-af \
locale-kio-extras-ar \
locale-kio-extras-ast \
locale-kio-extras-az \
locale-kio-extras-be \
locale-kio-extras-be@latin \
locale-kio-extras-bg \
locale-kio-extras-bn \
locale-kio-extras-bn-IN \
locale-kio-extras-br \
locale-kio-extras-bs \
locale-kio-extras-ca \
locale-kio-extras-ca@valencia \
locale-kio-extras-cs \
locale-kio-extras-cy \
locale-kio-extras-da \
locale-kio-extras-de \
locale-kio-extras-el \
locale-kio-extras-en-GB \
locale-kio-extras-eo \
locale-kio-extras-es \
locale-kio-extras-et \
locale-kio-extras-eu \
locale-kio-extras-fa \
locale-kio-extras-fi \
locale-kio-extras-fr \
locale-kio-extras-ga \
locale-kio-extras-gd \
locale-kio-extras-gl \
locale-kio-extras-gu \
locale-kio-extras-he \
locale-kio-extras-hi \
locale-kio-extras-hr \
locale-kio-extras-hu \
locale-kio-extras-ia \
locale-kio-extras-id \
locale-kio-extras-is \
locale-kio-extras-it \
locale-kio-extras-ja \
locale-kio-extras-ka \
locale-kio-extras-kk \
locale-kio-extras-km \
locale-kio-extras-kn \
locale-kio-extras-ko \
locale-kio-extras-lt \
locale-kio-extras-lv \
locale-kio-extras-mai \
locale-kio-extras-mk \
locale-kio-extras-ml \
locale-kio-extras-mr \
locale-kio-extras-ms \
locale-kio-extras-nb \
locale-kio-extras-nds \
locale-kio-extras-ne \
locale-kio-extras-nl \
locale-kio-extras-nn \
locale-kio-extras-oc \
locale-kio-extras-or \
locale-kio-extras-pa \
locale-kio-extras-pl \
locale-kio-extras-pt \
locale-kio-extras-pt-BR \
locale-kio-extras-ro \
locale-kio-extras-ru \
locale-kio-extras-si \
locale-kio-extras-sk \
locale-kio-extras-sl \
locale-kio-extras-sq \
locale-kio-extras-sr \
locale-kio-extras-sr@ijekavian \
locale-kio-extras-sr@ijekavianlatin \
locale-kio-extras-sr@latin \
locale-kio-extras-sv \
locale-kio-extras-ta \
locale-kio-extras-te \
locale-kio-extras-th \
locale-kio-extras-tr \
locale-kio-extras-ug \
locale-kio-extras-uk \
locale-kio-extras-vi \
locale-kio-extras-wa \
locale-kio-extras-zh-CN \
locale-kio-extras-zh-TW"

RDEPENDS:${PN} += "kio-extras"

inherit rpm
