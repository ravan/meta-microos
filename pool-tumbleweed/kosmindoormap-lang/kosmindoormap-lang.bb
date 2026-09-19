SUMMARY = "Translations for package kosmindoormap"
DESCRIPTION = "Provides translations for the 'kosmindoormap' package."
LICENSE = "CC0-1.0 & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kosmindoormap-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "2ca7fb1629c430478f5c1bc99b076d342ce54fa58ec3826cf3f7f2cdf504b49861b247d49a2927014c148b07d365d5d192191d147a0c1f88f50bc37a840e228b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kosmindoormap-lang \
kosmindoormap-lang-all \
locale-kosmindoormap-ar \
locale-kosmindoormap-ast \
locale-kosmindoormap-ca \
locale-kosmindoormap-ca@valencia \
locale-kosmindoormap-cs \
locale-kosmindoormap-de \
locale-kosmindoormap-en-GB \
locale-kosmindoormap-eo \
locale-kosmindoormap-es \
locale-kosmindoormap-eu \
locale-kosmindoormap-fi \
locale-kosmindoormap-fr \
locale-kosmindoormap-ga \
locale-kosmindoormap-gl \
locale-kosmindoormap-he \
locale-kosmindoormap-hi \
locale-kosmindoormap-ia \
locale-kosmindoormap-it \
locale-kosmindoormap-ja \
locale-kosmindoormap-ka \
locale-kosmindoormap-ko \
locale-kosmindoormap-lt \
locale-kosmindoormap-nl \
locale-kosmindoormap-pl \
locale-kosmindoormap-pt \
locale-kosmindoormap-pt-BR \
locale-kosmindoormap-ru \
locale-kosmindoormap-sk \
locale-kosmindoormap-sl \
locale-kosmindoormap-sv \
locale-kosmindoormap-tr \
locale-kosmindoormap-ug \
locale-kosmindoormap-uk \
locale-kosmindoormap-zh-CN \
locale-kosmindoormap-zh-TW"

RDEPENDS:${PN} += "kosmindoormap"

inherit rpm
