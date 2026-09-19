SUMMARY = "Translations for package pidgin-plugin-guifications"
DESCRIPTION = "Provides translations for the 'pidgin-plugin-guifications' package."
LICENSE = "GPL-2.0+"

PV = "2.16"

RPM_NAME = "pidgin-plugin-guifications-lang-2.16-10.37.noarch.rpm"
RPM_HASH = "431ed3288fdba5ead15cf751a609200f5bb50ce23528cee132ef74a2dbea9eec5bf52bd63ceaa0e6c1dac153c452de7ea34af81bfd9e64932d523413cc5b4c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pidgin-plugin-guifications-bn \
locale-pidgin-plugin-guifications-cs \
locale-pidgin-plugin-guifications-de \
locale-pidgin-plugin-guifications-en-AU \
locale-pidgin-plugin-guifications-en-GB \
locale-pidgin-plugin-guifications-es \
locale-pidgin-plugin-guifications-fr \
locale-pidgin-plugin-guifications-gl \
locale-pidgin-plugin-guifications-he \
locale-pidgin-plugin-guifications-hu \
locale-pidgin-plugin-guifications-it \
locale-pidgin-plugin-guifications-ja \
locale-pidgin-plugin-guifications-mk \
locale-pidgin-plugin-guifications-nl \
locale-pidgin-plugin-guifications-pt \
locale-pidgin-plugin-guifications-pt-BR \
locale-pidgin-plugin-guifications-ru \
locale-pidgin-plugin-guifications-sk \
locale-pidgin-plugin-guifications-sr \
locale-pidgin-plugin-guifications-sv \
locale-pidgin-plugin-guifications-uk \
locale-pidgin-plugin-guifications-zh-CN \
locale-pidgin-plugin-guifications-zh-TW \
pidgin-plugin-guifications-lang \
pidgin-plugin-guifications-lang-all"

RDEPENDS:${PN} += "pidgin-plugin-guifications"

inherit rpm
