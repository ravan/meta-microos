SUMMARY = "Translations for package zanshin"
DESCRIPTION = "Provides translations for the 'zanshin' package."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "zanshin-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "6ebab5354d6ef2312ed3c933249c554ba5897d4175ac136608c65920d6af61f9e66c5b03c6ab425ac9f0a3178e0cb438458a7723d22403c757ddea65c5c259e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zanshin-ar \
locale-zanshin-ast \
locale-zanshin-bg \
locale-zanshin-bs \
locale-zanshin-ca \
locale-zanshin-ca@valencia \
locale-zanshin-cs \
locale-zanshin-da \
locale-zanshin-de \
locale-zanshin-en-GB \
locale-zanshin-eo \
locale-zanshin-es \
locale-zanshin-et \
locale-zanshin-eu \
locale-zanshin-fi \
locale-zanshin-fr \
locale-zanshin-ga \
locale-zanshin-gl \
locale-zanshin-he \
locale-zanshin-hi \
locale-zanshin-hu \
locale-zanshin-ia \
locale-zanshin-it \
locale-zanshin-ja \
locale-zanshin-ka \
locale-zanshin-ko \
locale-zanshin-lt \
locale-zanshin-mr \
locale-zanshin-nb \
locale-zanshin-nds \
locale-zanshin-nl \
locale-zanshin-nn \
locale-zanshin-pl \
locale-zanshin-pt \
locale-zanshin-pt-BR \
locale-zanshin-ru \
locale-zanshin-sk \
locale-zanshin-sl \
locale-zanshin-sv \
locale-zanshin-tr \
locale-zanshin-ug \
locale-zanshin-uk \
locale-zanshin-zh-CN \
locale-zanshin-zh-TW \
zanshin-lang \
zanshin-lang-all"

RDEPENDS:${PN} += "zanshin"

inherit rpm
