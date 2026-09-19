SUMMARY = "Translations for package ktorrent"
DESCRIPTION = "Provides translations for the 'ktorrent' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ktorrent-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "ca0afbbde3bc04623240112ea7c58ed6c66523ebb17a5f3dccd5fdc3d9516ba6fa702fac55c590f33419bd616957bb9369d1b298943831389344d7c4b08cb7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktorrent-lang \
ktorrent-lang-all \
locale-ktorrent-ar \
locale-ktorrent-ast \
locale-ktorrent-be \
locale-ktorrent-bg \
locale-ktorrent-bs \
locale-ktorrent-ca \
locale-ktorrent-ca@valencia \
locale-ktorrent-cs \
locale-ktorrent-da \
locale-ktorrent-de \
locale-ktorrent-el \
locale-ktorrent-en-GB \
locale-ktorrent-eo \
locale-ktorrent-es \
locale-ktorrent-et \
locale-ktorrent-eu \
locale-ktorrent-fi \
locale-ktorrent-fr \
locale-ktorrent-ga \
locale-ktorrent-gl \
locale-ktorrent-he \
locale-ktorrent-hi \
locale-ktorrent-hr \
locale-ktorrent-hu \
locale-ktorrent-ia \
locale-ktorrent-is \
locale-ktorrent-it \
locale-ktorrent-ja \
locale-ktorrent-ka \
locale-ktorrent-kk \
locale-ktorrent-km \
locale-ktorrent-ko \
locale-ktorrent-lt \
locale-ktorrent-lv \
locale-ktorrent-mr \
locale-ktorrent-ms \
locale-ktorrent-nb \
locale-ktorrent-nds \
locale-ktorrent-nl \
locale-ktorrent-nn \
locale-ktorrent-oc \
locale-ktorrent-pl \
locale-ktorrent-pt \
locale-ktorrent-pt-BR \
locale-ktorrent-ro \
locale-ktorrent-ru \
locale-ktorrent-si \
locale-ktorrent-sk \
locale-ktorrent-sl \
locale-ktorrent-sq \
locale-ktorrent-sr \
locale-ktorrent-sr@ijekavian \
locale-ktorrent-sr@ijekavianlatin \
locale-ktorrent-sr@latin \
locale-ktorrent-sv \
locale-ktorrent-tr \
locale-ktorrent-ug \
locale-ktorrent-uk \
locale-ktorrent-zh-CN \
locale-ktorrent-zh-TW"

RDEPENDS:${PN} += "ktorrent"

inherit rpm
