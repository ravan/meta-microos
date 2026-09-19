SUMMARY = "Translations for package showtime"
DESCRIPTION = "Provides translations for the 'showtime' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+19"

RPM_NAME = "showtime-lang-50.0+19-1.2.noarch.rpm"
RPM_HASH = "9c04863f06639fee64c55f7de68580785a27cede07621f22ee7f1688ed33ad023e21bc23a6c2e0bd213b72b0669098f205829c55588112a9358e721f2046a698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-showtime-ar \
locale-showtime-be \
locale-showtime-bg \
locale-showtime-ca \
locale-showtime-cs \
locale-showtime-da \
locale-showtime-de \
locale-showtime-el \
locale-showtime-en-GB \
locale-showtime-eo \
locale-showtime-es \
locale-showtime-eu \
locale-showtime-fa \
locale-showtime-fi \
locale-showtime-fr \
locale-showtime-fur \
locale-showtime-gl \
locale-showtime-he \
locale-showtime-hi \
locale-showtime-hu \
locale-showtime-ia \
locale-showtime-id \
locale-showtime-it \
locale-showtime-ja \
locale-showtime-ka \
locale-showtime-kk \
locale-showtime-ko \
locale-showtime-lt \
locale-showtime-nb \
locale-showtime-ne \
locale-showtime-nl \
locale-showtime-nn \
locale-showtime-oc \
locale-showtime-pa \
locale-showtime-pl \
locale-showtime-pt \
locale-showtime-pt-BR \
locale-showtime-ro \
locale-showtime-ru \
locale-showtime-sk \
locale-showtime-sl \
locale-showtime-sr \
locale-showtime-sr@latin \
locale-showtime-sv \
locale-showtime-th \
locale-showtime-tr \
locale-showtime-ug \
locale-showtime-uk \
locale-showtime-zh-CN \
locale-showtime-zh-TW \
showtime-lang \
showtime-lang-all"

RDEPENDS:${PN} += "showtime"

inherit rpm
