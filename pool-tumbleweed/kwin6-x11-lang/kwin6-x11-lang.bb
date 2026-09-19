SUMMARY = "Translations for package kwin6-x11"
DESCRIPTION = "Provides translations for the 'kwin6-x11' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "kwin6-x11-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "85d2dba971c35387af421cfd75a2a099111540685025fde12d39843ef3569e97443250ea04f344af2d729a1878ec96956698a1a8b86af11f3bbefec771756667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwin6-x11-lang \
kwin6-x11-lang-all \
locale-kwin6-x11-af \
locale-kwin6-x11-ar \
locale-kwin6-x11-as \
locale-kwin6-x11-ast \
locale-kwin6-x11-az \
locale-kwin6-x11-be \
locale-kwin6-x11-be@latin \
locale-kwin6-x11-bg \
locale-kwin6-x11-bn \
locale-kwin6-x11-bn-IN \
locale-kwin6-x11-br \
locale-kwin6-x11-bs \
locale-kwin6-x11-ca \
locale-kwin6-x11-ca@valencia \
locale-kwin6-x11-cs \
locale-kwin6-x11-cy \
locale-kwin6-x11-da \
locale-kwin6-x11-de \
locale-kwin6-x11-el \
locale-kwin6-x11-en-GB \
locale-kwin6-x11-eo \
locale-kwin6-x11-es \
locale-kwin6-x11-et \
locale-kwin6-x11-eu \
locale-kwin6-x11-fa \
locale-kwin6-x11-fi \
locale-kwin6-x11-fr \
locale-kwin6-x11-ga \
locale-kwin6-x11-gl \
locale-kwin6-x11-gu \
locale-kwin6-x11-he \
locale-kwin6-x11-hi \
locale-kwin6-x11-hr \
locale-kwin6-x11-hu \
locale-kwin6-x11-ia \
locale-kwin6-x11-id \
locale-kwin6-x11-is \
locale-kwin6-x11-it \
locale-kwin6-x11-ja \
locale-kwin6-x11-ka \
locale-kwin6-x11-kk \
locale-kwin6-x11-km \
locale-kwin6-x11-kn \
locale-kwin6-x11-ko \
locale-kwin6-x11-lt \
locale-kwin6-x11-lv \
locale-kwin6-x11-mai \
locale-kwin6-x11-mk \
locale-kwin6-x11-ml \
locale-kwin6-x11-mr \
locale-kwin6-x11-ms \
locale-kwin6-x11-nb \
locale-kwin6-x11-nds \
locale-kwin6-x11-ne \
locale-kwin6-x11-nl \
locale-kwin6-x11-nn \
locale-kwin6-x11-oc \
locale-kwin6-x11-or \
locale-kwin6-x11-pa \
locale-kwin6-x11-pl \
locale-kwin6-x11-pt \
locale-kwin6-x11-pt-BR \
locale-kwin6-x11-ro \
locale-kwin6-x11-ru \
locale-kwin6-x11-si \
locale-kwin6-x11-sk \
locale-kwin6-x11-sl \
locale-kwin6-x11-sq \
locale-kwin6-x11-sr \
locale-kwin6-x11-sr@ijekavian \
locale-kwin6-x11-sr@ijekavianlatin \
locale-kwin6-x11-sr@latin \
locale-kwin6-x11-sv \
locale-kwin6-x11-ta \
locale-kwin6-x11-te \
locale-kwin6-x11-th \
locale-kwin6-x11-tr \
locale-kwin6-x11-ug \
locale-kwin6-x11-uk \
locale-kwin6-x11-vi \
locale-kwin6-x11-wa \
locale-kwin6-x11-zh-CN \
locale-kwin6-x11-zh-TW"

RDEPENDS:${PN} += "kwin6-x11"

inherit rpm
