SUMMARY = "Translations for package kbruch"
DESCRIPTION = "Provides translations for the 'kbruch' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kbruch-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "dd2f349c1cc3f97d4560f9bd98f0f69c14bb72af5145a9f47c59985ea773fcadab125f12038031870a6382ef56b7ad5382f8ad9d28ae037eccd0cc847bb23043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbruch-lang \
kbruch-lang-all \
locale-kbruch-ar \
locale-kbruch-ast \
locale-kbruch-be \
locale-kbruch-bn \
locale-kbruch-br \
locale-kbruch-bs \
locale-kbruch-ca \
locale-kbruch-ca@valencia \
locale-kbruch-cs \
locale-kbruch-cy \
locale-kbruch-da \
locale-kbruch-de \
locale-kbruch-el \
locale-kbruch-en-GB \
locale-kbruch-eo \
locale-kbruch-es \
locale-kbruch-et \
locale-kbruch-eu \
locale-kbruch-fa \
locale-kbruch-fi \
locale-kbruch-fr \
locale-kbruch-ga \
locale-kbruch-gl \
locale-kbruch-he \
locale-kbruch-hi \
locale-kbruch-hr \
locale-kbruch-hu \
locale-kbruch-ia \
locale-kbruch-is \
locale-kbruch-it \
locale-kbruch-ja \
locale-kbruch-ka \
locale-kbruch-kk \
locale-kbruch-km \
locale-kbruch-ko \
locale-kbruch-lt \
locale-kbruch-lv \
locale-kbruch-mk \
locale-kbruch-ml \
locale-kbruch-mr \
locale-kbruch-ms \
locale-kbruch-nb \
locale-kbruch-nds \
locale-kbruch-ne \
locale-kbruch-nl \
locale-kbruch-nn \
locale-kbruch-oc \
locale-kbruch-pa \
locale-kbruch-pl \
locale-kbruch-pt \
locale-kbruch-pt-BR \
locale-kbruch-ro \
locale-kbruch-ru \
locale-kbruch-si \
locale-kbruch-sk \
locale-kbruch-sl \
locale-kbruch-sq \
locale-kbruch-sv \
locale-kbruch-ta \
locale-kbruch-th \
locale-kbruch-tr \
locale-kbruch-ug \
locale-kbruch-uk \
locale-kbruch-zh-CN \
locale-kbruch-zh-TW"

RDEPENDS:${PN} += "kbruch"

inherit rpm
