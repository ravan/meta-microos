SUMMARY = "Translations for package drkonqi6"
DESCRIPTION = "Provides translations for the 'drkonqi6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "drkonqi6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "1b08d6782b0b02c0b64611f7e57ac75a31b15b983c86e32d922d67ccda339ccbb943e1aafdf6316fec152162e197bd540790b26811a9771286f1196b961f2773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drkonqi6-lang \
drkonqi6-lang-all \
locale-drkonqi6-af \
locale-drkonqi6-ar \
locale-drkonqi6-ast \
locale-drkonqi6-az \
locale-drkonqi6-be \
locale-drkonqi6-bg \
locale-drkonqi6-bn \
locale-drkonqi6-bn-IN \
locale-drkonqi6-br \
locale-drkonqi6-bs \
locale-drkonqi6-ca \
locale-drkonqi6-ca@valencia \
locale-drkonqi6-cs \
locale-drkonqi6-cy \
locale-drkonqi6-da \
locale-drkonqi6-de \
locale-drkonqi6-el \
locale-drkonqi6-en-GB \
locale-drkonqi6-eo \
locale-drkonqi6-es \
locale-drkonqi6-et \
locale-drkonqi6-eu \
locale-drkonqi6-fa \
locale-drkonqi6-fi \
locale-drkonqi6-fr \
locale-drkonqi6-ga \
locale-drkonqi6-gl \
locale-drkonqi6-gu \
locale-drkonqi6-he \
locale-drkonqi6-hi \
locale-drkonqi6-hr \
locale-drkonqi6-hu \
locale-drkonqi6-ia \
locale-drkonqi6-id \
locale-drkonqi6-is \
locale-drkonqi6-it \
locale-drkonqi6-ja \
locale-drkonqi6-ka \
locale-drkonqi6-kk \
locale-drkonqi6-km \
locale-drkonqi6-kn \
locale-drkonqi6-ko \
locale-drkonqi6-lt \
locale-drkonqi6-lv \
locale-drkonqi6-mai \
locale-drkonqi6-mk \
locale-drkonqi6-ml \
locale-drkonqi6-mr \
locale-drkonqi6-ms \
locale-drkonqi6-nb \
locale-drkonqi6-nds \
locale-drkonqi6-ne \
locale-drkonqi6-nl \
locale-drkonqi6-nn \
locale-drkonqi6-oc \
locale-drkonqi6-or \
locale-drkonqi6-pa \
locale-drkonqi6-pl \
locale-drkonqi6-pt \
locale-drkonqi6-pt-BR \
locale-drkonqi6-ro \
locale-drkonqi6-ru \
locale-drkonqi6-si \
locale-drkonqi6-sk \
locale-drkonqi6-sl \
locale-drkonqi6-sq \
locale-drkonqi6-sr \
locale-drkonqi6-sr@ijekavian \
locale-drkonqi6-sr@ijekavianlatin \
locale-drkonqi6-sr@latin \
locale-drkonqi6-sv \
locale-drkonqi6-ta \
locale-drkonqi6-te \
locale-drkonqi6-th \
locale-drkonqi6-tr \
locale-drkonqi6-ug \
locale-drkonqi6-uk \
locale-drkonqi6-vi \
locale-drkonqi6-wa \
locale-drkonqi6-zh-CN \
locale-drkonqi6-zh-TW"

RDEPENDS:${PN} += "drkonqi6"

inherit rpm
