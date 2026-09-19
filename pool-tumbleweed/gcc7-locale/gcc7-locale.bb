SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-locale-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "b5d91b8add1dd6f6e8fbc7bf8424589de76a4eff91ad1f4ddd2c4c8f6556fcf230bf73312feb0598f054a3a304f66a0e502091d3a69959fa1365e5644637d73e"

RPROVIDES:${PN} += "gcc7-locale \
locale-gcc7-be \
locale-gcc7-ca \
locale-gcc7-da \
locale-gcc7-de \
locale-gcc7-el \
locale-gcc7-eo \
locale-gcc7-es \
locale-gcc7-fi \
locale-gcc7-fr \
locale-gcc7-hr \
locale-gcc7-id \
locale-gcc7-ja \
locale-gcc7-nl \
locale-gcc7-pt-BR \
locale-gcc7-ru \
locale-gcc7-sr \
locale-gcc7-sv \
locale-gcc7-tr \
locale-gcc7-uk \
locale-gcc7-vi \
locale-gcc7-zh-CN \
locale-gcc7-zh-TW"

RDEPENDS:${PN} += "gcc7"

inherit rpm
