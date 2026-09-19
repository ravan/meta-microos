SUMMARY = "Translations for package kubrick"
DESCRIPTION = "Provides translations for the 'kubrick' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kubrick-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "a1831d9b233ac7c5c1caec34c96720820eb74f40ee8d59a0ed363d32f7b09d9503c29345e288f7223eaccc7ffc0c86a85b3313fba23b2993c1cd3cc3f8a1dcc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubrick-lang \
kubrick-lang-all \
locale-kubrick-ar \
locale-kubrick-ast \
locale-kubrick-bs \
locale-kubrick-ca \
locale-kubrick-ca@valencia \
locale-kubrick-cs \
locale-kubrick-da \
locale-kubrick-de \
locale-kubrick-el \
locale-kubrick-en-GB \
locale-kubrick-eo \
locale-kubrick-es \
locale-kubrick-et \
locale-kubrick-eu \
locale-kubrick-fi \
locale-kubrick-fr \
locale-kubrick-ga \
locale-kubrick-gl \
locale-kubrick-he \
locale-kubrick-hi \
locale-kubrick-hr \
locale-kubrick-hu \
locale-kubrick-ia \
locale-kubrick-id \
locale-kubrick-is \
locale-kubrick-it \
locale-kubrick-ja \
locale-kubrick-ka \
locale-kubrick-kk \
locale-kubrick-km \
locale-kubrick-ko \
locale-kubrick-lt \
locale-kubrick-lv \
locale-kubrick-mai \
locale-kubrick-ml \
locale-kubrick-mr \
locale-kubrick-nb \
locale-kubrick-nds \
locale-kubrick-nl \
locale-kubrick-nn \
locale-kubrick-pl \
locale-kubrick-pt \
locale-kubrick-pt-BR \
locale-kubrick-ro \
locale-kubrick-ru \
locale-kubrick-sk \
locale-kubrick-sl \
locale-kubrick-sr \
locale-kubrick-sr@ijekavian \
locale-kubrick-sr@ijekavianlatin \
locale-kubrick-sr@latin \
locale-kubrick-sv \
locale-kubrick-tr \
locale-kubrick-ug \
locale-kubrick-uk \
locale-kubrick-zh-CN \
locale-kubrick-zh-TW"

RDEPENDS:${PN} += "kubrick"

inherit rpm
