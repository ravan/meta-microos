SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-locale-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "0d7d1bd2a4004680fb0f8f315599752963a198b2c5d0be53f12441111321d785218d091117db6036498c50445b08607596b5bd4e68f763163d11e0d7dae72cdf"

RPROVIDES:${PN} += "gcc14-locale \
locale-gcc14-be \
locale-gcc14-ca \
locale-gcc14-da \
locale-gcc14-de \
locale-gcc14-el \
locale-gcc14-eo \
locale-gcc14-es \
locale-gcc14-fi \
locale-gcc14-fr \
locale-gcc14-hr \
locale-gcc14-id \
locale-gcc14-ja \
locale-gcc14-ka \
locale-gcc14-nl \
locale-gcc14-pt-BR \
locale-gcc14-ro \
locale-gcc14-ru \
locale-gcc14-sr \
locale-gcc14-sv \
locale-gcc14-tr \
locale-gcc14-uk \
locale-gcc14-vi \
locale-gcc14-zh-CN \
locale-gcc14-zh-TW"

RDEPENDS:${PN} += "gcc14"

inherit rpm
