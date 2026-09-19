SUMMARY = "Translations for package korganizer"
DESCRIPTION = "Provides translations for the 'korganizer' package."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "korganizer-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "be6d236e0da5daec304c29064a09b191fb5a33b7a8c9d41cf635ae6c8e0eb8439c3a3849cdbc701a5ac0652373f635c6d8cc188ac39d00da79e931fb2a14e901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "korganizer-lang \
korganizer-lang-all \
locale-korganizer-af \
locale-korganizer-ar \
locale-korganizer-ast \
locale-korganizer-az \
locale-korganizer-be \
locale-korganizer-bg \
locale-korganizer-br \
locale-korganizer-bs \
locale-korganizer-ca \
locale-korganizer-ca@valencia \
locale-korganizer-cs \
locale-korganizer-cy \
locale-korganizer-da \
locale-korganizer-de \
locale-korganizer-el \
locale-korganizer-en-GB \
locale-korganizer-eo \
locale-korganizer-es \
locale-korganizer-et \
locale-korganizer-eu \
locale-korganizer-fa \
locale-korganizer-fi \
locale-korganizer-fr \
locale-korganizer-ga \
locale-korganizer-gl \
locale-korganizer-he \
locale-korganizer-hi \
locale-korganizer-hr \
locale-korganizer-hu \
locale-korganizer-ia \
locale-korganizer-id \
locale-korganizer-is \
locale-korganizer-it \
locale-korganizer-ja \
locale-korganizer-ka \
locale-korganizer-kk \
locale-korganizer-km \
locale-korganizer-ko \
locale-korganizer-lt \
locale-korganizer-lv \
locale-korganizer-mai \
locale-korganizer-mk \
locale-korganizer-mr \
locale-korganizer-ms \
locale-korganizer-nb \
locale-korganizer-nds \
locale-korganizer-ne \
locale-korganizer-nl \
locale-korganizer-nn \
locale-korganizer-pa \
locale-korganizer-pl \
locale-korganizer-pt \
locale-korganizer-pt-BR \
locale-korganizer-ro \
locale-korganizer-ru \
locale-korganizer-sk \
locale-korganizer-sl \
locale-korganizer-sq \
locale-korganizer-sr \
locale-korganizer-sr@ijekavian \
locale-korganizer-sr@ijekavianlatin \
locale-korganizer-sr@latin \
locale-korganizer-sv \
locale-korganizer-ta \
locale-korganizer-th \
locale-korganizer-tr \
locale-korganizer-ug \
locale-korganizer-uk \
locale-korganizer-wa \
locale-korganizer-zh-CN \
locale-korganizer-zh-TW"

RDEPENDS:${PN} += "korganizer"

inherit rpm
