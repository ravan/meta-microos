SUMMARY = "Translations for package kmix"
DESCRIPTION = "Provides translations for the 'kmix' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kmix-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4e2eeb7b9c14963cbcf3770d8171f441196c87a11e3ad93636efbf985eec307b36b0d20fc9f7e4fff9dc107fe36baf41eed5d407403a13ba82b5675e84242ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmix-lang \
kmix-lang-all \
locale-kmix-af \
locale-kmix-ar \
locale-kmix-be \
locale-kmix-bg \
locale-kmix-br \
locale-kmix-bs \
locale-kmix-ca \
locale-kmix-ca@valencia \
locale-kmix-cs \
locale-kmix-cy \
locale-kmix-da \
locale-kmix-de \
locale-kmix-el \
locale-kmix-en-GB \
locale-kmix-eo \
locale-kmix-es \
locale-kmix-et \
locale-kmix-eu \
locale-kmix-fa \
locale-kmix-fi \
locale-kmix-fr \
locale-kmix-ga \
locale-kmix-gl \
locale-kmix-he \
locale-kmix-hi \
locale-kmix-hr \
locale-kmix-hu \
locale-kmix-ia \
locale-kmix-id \
locale-kmix-is \
locale-kmix-it \
locale-kmix-ja \
locale-kmix-ka \
locale-kmix-kk \
locale-kmix-km \
locale-kmix-ko \
locale-kmix-lt \
locale-kmix-lv \
locale-kmix-mk \
locale-kmix-mr \
locale-kmix-ms \
locale-kmix-nb \
locale-kmix-nds \
locale-kmix-ne \
locale-kmix-nl \
locale-kmix-nn \
locale-kmix-oc \
locale-kmix-pa \
locale-kmix-pl \
locale-kmix-pt \
locale-kmix-pt-BR \
locale-kmix-ro \
locale-kmix-ru \
locale-kmix-sk \
locale-kmix-sl \
locale-kmix-sq \
locale-kmix-sr \
locale-kmix-sr@ijekavian \
locale-kmix-sr@ijekavianlatin \
locale-kmix-sr@latin \
locale-kmix-sv \
locale-kmix-ta \
locale-kmix-th \
locale-kmix-tr \
locale-kmix-ug \
locale-kmix-uk \
locale-kmix-zh-CN \
locale-kmix-zh-HK \
locale-kmix-zh-TW"

RDEPENDS:${PN} += "kmix"

inherit rpm
