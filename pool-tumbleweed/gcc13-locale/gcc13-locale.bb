SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-locale-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "76dfe9a545162027eb549b69b23311b3789d70c5181e0045b96f713962f062a2d6bcf059e12f3368ee2e8a94062a49287dbe43a17b7439073b478f19fbcd1495"

RPROVIDES:${PN} += "gcc13-locale \
locale-gcc13-be \
locale-gcc13-ca \
locale-gcc13-da \
locale-gcc13-de \
locale-gcc13-el \
locale-gcc13-eo \
locale-gcc13-es \
locale-gcc13-fi \
locale-gcc13-fr \
locale-gcc13-hr \
locale-gcc13-id \
locale-gcc13-ja \
locale-gcc13-ka \
locale-gcc13-nl \
locale-gcc13-pt-BR \
locale-gcc13-ro \
locale-gcc13-ru \
locale-gcc13-sr \
locale-gcc13-sv \
locale-gcc13-tr \
locale-gcc13-uk \
locale-gcc13-vi \
locale-gcc13-zh-CN \
locale-gcc13-zh-TW"

RDEPENDS:${PN} += "gcc13"

inherit rpm
