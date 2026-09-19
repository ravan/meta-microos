SUMMARY = "Translations for package kwalletmanager"
DESCRIPTION = "Provides translations for the 'kwalletmanager' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kwalletmanager-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "08aced0edf95563528be9f5ca296f83b2bcb48b15fef344437e0d8387b49afff9bc57357d004bfbf33066937756b6634d29f78bd844f82cc9b7626028371d4bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwalletmanager-lang \
kwalletmanager-lang-all \
locale-kwalletmanager-ar \
locale-kwalletmanager-ast \
locale-kwalletmanager-az \
locale-kwalletmanager-be \
locale-kwalletmanager-bg \
locale-kwalletmanager-br \
locale-kwalletmanager-bs \
locale-kwalletmanager-ca \
locale-kwalletmanager-ca@valencia \
locale-kwalletmanager-cs \
locale-kwalletmanager-cy \
locale-kwalletmanager-da \
locale-kwalletmanager-de \
locale-kwalletmanager-el \
locale-kwalletmanager-en-GB \
locale-kwalletmanager-eo \
locale-kwalletmanager-es \
locale-kwalletmanager-et \
locale-kwalletmanager-eu \
locale-kwalletmanager-fa \
locale-kwalletmanager-fi \
locale-kwalletmanager-fr \
locale-kwalletmanager-ga \
locale-kwalletmanager-gl \
locale-kwalletmanager-he \
locale-kwalletmanager-hi \
locale-kwalletmanager-hr \
locale-kwalletmanager-hu \
locale-kwalletmanager-ia \
locale-kwalletmanager-id \
locale-kwalletmanager-is \
locale-kwalletmanager-it \
locale-kwalletmanager-ja \
locale-kwalletmanager-ka \
locale-kwalletmanager-kk \
locale-kwalletmanager-km \
locale-kwalletmanager-ko \
locale-kwalletmanager-lt \
locale-kwalletmanager-lv \
locale-kwalletmanager-mk \
locale-kwalletmanager-mr \
locale-kwalletmanager-ms \
locale-kwalletmanager-nb \
locale-kwalletmanager-nds \
locale-kwalletmanager-ne \
locale-kwalletmanager-nl \
locale-kwalletmanager-nn \
locale-kwalletmanager-oc \
locale-kwalletmanager-pa \
locale-kwalletmanager-pl \
locale-kwalletmanager-pt \
locale-kwalletmanager-pt-BR \
locale-kwalletmanager-ro \
locale-kwalletmanager-ru \
locale-kwalletmanager-si \
locale-kwalletmanager-sk \
locale-kwalletmanager-sl \
locale-kwalletmanager-sq \
locale-kwalletmanager-sr \
locale-kwalletmanager-sr@ijekavian \
locale-kwalletmanager-sr@ijekavianlatin \
locale-kwalletmanager-sr@latin \
locale-kwalletmanager-sv \
locale-kwalletmanager-ta \
locale-kwalletmanager-th \
locale-kwalletmanager-tr \
locale-kwalletmanager-ug \
locale-kwalletmanager-uk \
locale-kwalletmanager-vi \
locale-kwalletmanager-zh-CN \
locale-kwalletmanager-zh-TW"

RDEPENDS:${PN} += "kwalletmanager"

inherit rpm
