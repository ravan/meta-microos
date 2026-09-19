SUMMARY = "Translations for package itinerary"
DESCRIPTION = "Provides translations for the 'itinerary' package."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "itinerary-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "ea8663aa46f2f6ba22385d363263148bc5460abfc99a7dc077e3ed904d9f82d90453bfdf96138c5f4219f73b0e498cde006e621912b95c9ce3bbb786b0476b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itinerary-lang \
itinerary-lang-all \
locale-itinerary-ar \
locale-itinerary-ast \
locale-itinerary-ca \
locale-itinerary-ca@valencia \
locale-itinerary-cs \
locale-itinerary-de \
locale-itinerary-en-GB \
locale-itinerary-eo \
locale-itinerary-es \
locale-itinerary-et \
locale-itinerary-eu \
locale-itinerary-fi \
locale-itinerary-fr \
locale-itinerary-ga \
locale-itinerary-gl \
locale-itinerary-he \
locale-itinerary-hi \
locale-itinerary-hu \
locale-itinerary-ia \
locale-itinerary-it \
locale-itinerary-ja \
locale-itinerary-ka \
locale-itinerary-ko \
locale-itinerary-lt \
locale-itinerary-nl \
locale-itinerary-pl \
locale-itinerary-pt \
locale-itinerary-pt-BR \
locale-itinerary-ru \
locale-itinerary-sk \
locale-itinerary-sl \
locale-itinerary-sv \
locale-itinerary-tr \
locale-itinerary-ug \
locale-itinerary-uk \
locale-itinerary-zh-CN \
locale-itinerary-zh-TW"

RDEPENDS:${PN} += "itinerary"

inherit rpm
