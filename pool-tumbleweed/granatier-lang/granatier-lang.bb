SUMMARY = "Translations for package granatier"
DESCRIPTION = "Provides translations for the 'granatier' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "granatier-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "d5b2e30b63725bfaf7738ad8386546674562e9e6b0207a25acc73d9ba8c1f47089baf692cb636d7e74b91c225e8c4403aa1da4ef5645966808b1880402a319ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "granatier-lang \
granatier-lang-all \
locale-granatier-ar \
locale-granatier-ast \
locale-granatier-bs \
locale-granatier-ca \
locale-granatier-ca@valencia \
locale-granatier-cs \
locale-granatier-da \
locale-granatier-de \
locale-granatier-el \
locale-granatier-en-GB \
locale-granatier-eo \
locale-granatier-es \
locale-granatier-et \
locale-granatier-eu \
locale-granatier-fi \
locale-granatier-fr \
locale-granatier-ga \
locale-granatier-gl \
locale-granatier-he \
locale-granatier-hi \
locale-granatier-hr \
locale-granatier-hu \
locale-granatier-ia \
locale-granatier-id \
locale-granatier-is \
locale-granatier-it \
locale-granatier-ja \
locale-granatier-ka \
locale-granatier-kk \
locale-granatier-km \
locale-granatier-ko \
locale-granatier-lt \
locale-granatier-lv \
locale-granatier-mai \
locale-granatier-ml \
locale-granatier-mr \
locale-granatier-ms \
locale-granatier-nb \
locale-granatier-nds \
locale-granatier-nl \
locale-granatier-nn \
locale-granatier-pl \
locale-granatier-pt \
locale-granatier-pt-BR \
locale-granatier-ro \
locale-granatier-ru \
locale-granatier-sk \
locale-granatier-sl \
locale-granatier-sr \
locale-granatier-sr@ijekavian \
locale-granatier-sr@ijekavianlatin \
locale-granatier-sr@latin \
locale-granatier-sv \
locale-granatier-th \
locale-granatier-tr \
locale-granatier-ug \
locale-granatier-uk \
locale-granatier-zh-CN \
locale-granatier-zh-TW"

RDEPENDS:${PN} += "granatier"

inherit rpm
