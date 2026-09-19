SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-locale-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "d86dd65a6c7f3201556488431973080903b3bb7b363bfded814cac4741a14c77bfeba68d0f03357fd21f671cc299c6dac2a4a5e5fd939d54b6d8adcdce86847d"

RPROVIDES:${PN} += "gcc15-locale \
locale-gcc15-be \
locale-gcc15-ca \
locale-gcc15-da \
locale-gcc15-de \
locale-gcc15-el \
locale-gcc15-eo \
locale-gcc15-es \
locale-gcc15-fi \
locale-gcc15-fr \
locale-gcc15-hr \
locale-gcc15-id \
locale-gcc15-ja \
locale-gcc15-ka \
locale-gcc15-nl \
locale-gcc15-pt-BR \
locale-gcc15-ro \
locale-gcc15-ru \
locale-gcc15-sr \
locale-gcc15-sv \
locale-gcc15-tr \
locale-gcc15-uk \
locale-gcc15-vi \
locale-gcc15-zh-CN \
locale-gcc15-zh-TW"

RDEPENDS:${PN} += "gcc15"

inherit rpm
