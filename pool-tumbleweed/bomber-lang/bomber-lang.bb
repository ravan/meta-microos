SUMMARY = "Translations for package bomber"
DESCRIPTION = "Provides translations for the 'bomber' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "bomber-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "d53cb856ea0fe613875f4a80e42ac26f3d30e13e38fd24879f54baaef2281893f6a99e062b868e6827892e69597fcb551a1343033bfcc6a27fd8561cff9a94a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bomber-lang \
bomber-lang-all \
locale-bomber-ar \
locale-bomber-ast \
locale-bomber-bg \
locale-bomber-bs \
locale-bomber-ca \
locale-bomber-ca@valencia \
locale-bomber-cs \
locale-bomber-da \
locale-bomber-de \
locale-bomber-el \
locale-bomber-en-GB \
locale-bomber-eo \
locale-bomber-es \
locale-bomber-et \
locale-bomber-eu \
locale-bomber-fi \
locale-bomber-fr \
locale-bomber-ga \
locale-bomber-gl \
locale-bomber-gu \
locale-bomber-he \
locale-bomber-hi \
locale-bomber-hr \
locale-bomber-hu \
locale-bomber-ia \
locale-bomber-id \
locale-bomber-is \
locale-bomber-it \
locale-bomber-ja \
locale-bomber-ka \
locale-bomber-kk \
locale-bomber-km \
locale-bomber-ko \
locale-bomber-lt \
locale-bomber-lv \
locale-bomber-mai \
locale-bomber-ml \
locale-bomber-mr \
locale-bomber-ms \
locale-bomber-nb \
locale-bomber-nds \
locale-bomber-nl \
locale-bomber-nn \
locale-bomber-pa \
locale-bomber-pl \
locale-bomber-pt \
locale-bomber-pt-BR \
locale-bomber-ro \
locale-bomber-ru \
locale-bomber-sk \
locale-bomber-sl \
locale-bomber-sq \
locale-bomber-sr \
locale-bomber-sr@ijekavian \
locale-bomber-sr@ijekavianlatin \
locale-bomber-sr@latin \
locale-bomber-sv \
locale-bomber-th \
locale-bomber-tr \
locale-bomber-ug \
locale-bomber-uk \
locale-bomber-zh-CN \
locale-bomber-zh-TW"

RDEPENDS:${PN} += "bomber"

inherit rpm
