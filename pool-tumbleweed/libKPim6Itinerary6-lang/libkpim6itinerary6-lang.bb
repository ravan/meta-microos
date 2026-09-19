SUMMARY = "Translations for package libKPim6Itinerary6"
DESCRIPTION = "Provides translations for the 'libKPim6Itinerary6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6Itinerary6-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "282773d950787c7689b11b76aa58b447e61b3f3f084b01e5fdfc232da62ef777b084cd5be55223d3dc542ac3a20fa3ecba519b7f8bb9d7e2bdfc64dea6c05837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim6Itinerary6-lang \
libKPim6Itinerary6-lang-all \
locale-libKPim6Itinerary6-ar \
locale-libKPim6Itinerary6-ast \
locale-libKPim6Itinerary6-ca \
locale-libKPim6Itinerary6-ca@valencia \
locale-libKPim6Itinerary6-cs \
locale-libKPim6Itinerary6-da \
locale-libKPim6Itinerary6-de \
locale-libKPim6Itinerary6-en-GB \
locale-libKPim6Itinerary6-eo \
locale-libKPim6Itinerary6-es \
locale-libKPim6Itinerary6-et \
locale-libKPim6Itinerary6-eu \
locale-libKPim6Itinerary6-fi \
locale-libKPim6Itinerary6-fr \
locale-libKPim6Itinerary6-ga \
locale-libKPim6Itinerary6-gl \
locale-libKPim6Itinerary6-he \
locale-libKPim6Itinerary6-hi \
locale-libKPim6Itinerary6-ia \
locale-libKPim6Itinerary6-it \
locale-libKPim6Itinerary6-ja \
locale-libKPim6Itinerary6-ka \
locale-libKPim6Itinerary6-ko \
locale-libKPim6Itinerary6-lt \
locale-libKPim6Itinerary6-lv \
locale-libKPim6Itinerary6-nl \
locale-libKPim6Itinerary6-nn \
locale-libKPim6Itinerary6-pl \
locale-libKPim6Itinerary6-pt \
locale-libKPim6Itinerary6-pt-BR \
locale-libKPim6Itinerary6-ru \
locale-libKPim6Itinerary6-sk \
locale-libKPim6Itinerary6-sl \
locale-libKPim6Itinerary6-sv \
locale-libKPim6Itinerary6-ta \
locale-libKPim6Itinerary6-tr \
locale-libKPim6Itinerary6-ug \
locale-libKPim6Itinerary6-uk \
locale-libKPim6Itinerary6-zh-CN \
locale-libKPim6Itinerary6-zh-TW"

RDEPENDS:${PN} += "libKPim6Itinerary6"

inherit rpm
