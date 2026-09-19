SUMMARY = "Translations for package konquest"
DESCRIPTION = "Provides translations for the 'konquest' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konquest-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "6263a779465abab8946c7441c9082b18278441ba6efafec69fb5acfeaafebaabcc3703b44fabb673add44c8b65fd3686e5b5cdbf65ef94d9ab4a3e815ca8c425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konquest-lang \
konquest-lang-all \
locale-konquest-af \
locale-konquest-ar \
locale-konquest-ast \
locale-konquest-be \
locale-konquest-br \
locale-konquest-bs \
locale-konquest-ca \
locale-konquest-ca@valencia \
locale-konquest-cs \
locale-konquest-cy \
locale-konquest-da \
locale-konquest-de \
locale-konquest-el \
locale-konquest-en-GB \
locale-konquest-eo \
locale-konquest-es \
locale-konquest-et \
locale-konquest-eu \
locale-konquest-fa \
locale-konquest-fi \
locale-konquest-fr \
locale-konquest-ga \
locale-konquest-gl \
locale-konquest-he \
locale-konquest-hi \
locale-konquest-hr \
locale-konquest-hu \
locale-konquest-ia \
locale-konquest-is \
locale-konquest-it \
locale-konquest-ja \
locale-konquest-ka \
locale-konquest-kk \
locale-konquest-km \
locale-konquest-ko \
locale-konquest-lt \
locale-konquest-lv \
locale-konquest-mai \
locale-konquest-mk \
locale-konquest-ml \
locale-konquest-mr \
locale-konquest-nb \
locale-konquest-nds \
locale-konquest-ne \
locale-konquest-nl \
locale-konquest-nn \
locale-konquest-oc \
locale-konquest-pa \
locale-konquest-pl \
locale-konquest-pt \
locale-konquest-pt-BR \
locale-konquest-ro \
locale-konquest-ru \
locale-konquest-sk \
locale-konquest-sl \
locale-konquest-sq \
locale-konquest-sr \
locale-konquest-sr@ijekavian \
locale-konquest-sr@ijekavianlatin \
locale-konquest-sr@latin \
locale-konquest-sv \
locale-konquest-ta \
locale-konquest-tr \
locale-konquest-ug \
locale-konquest-uk \
locale-konquest-zh-CN \
locale-konquest-zh-TW"

RDEPENDS:${PN} += "konquest"

inherit rpm
