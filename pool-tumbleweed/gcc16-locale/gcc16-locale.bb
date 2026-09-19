SUMMARY = "Locale Data for the GNU Compiler Collection"
DESCRIPTION = "Locale data for the GNU Compiler Collection (GCC) to give error message \
in the current locale."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-locale-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "1474a0d485aa0cdb7eec57ddc90e63f9d6980144bfdfd84331e70b52bf94548ca98b95a953df7f328b3e269bd009d8ab793963e72bf393c3a3312a50fdba6074"

RPROVIDES:${PN} += "gcc16-locale \
locale-gcc16-be \
locale-gcc16-ca \
locale-gcc16-da \
locale-gcc16-de \
locale-gcc16-el \
locale-gcc16-eo \
locale-gcc16-es \
locale-gcc16-fi \
locale-gcc16-fr \
locale-gcc16-hr \
locale-gcc16-id \
locale-gcc16-ja \
locale-gcc16-ka \
locale-gcc16-nl \
locale-gcc16-pt-BR \
locale-gcc16-ro \
locale-gcc16-ru \
locale-gcc16-sr \
locale-gcc16-sv \
locale-gcc16-tr \
locale-gcc16-uk \
locale-gcc16-vi \
locale-gcc16-zh-CN \
locale-gcc16-zh-TW"

RDEPENDS:${PN} += "gcc16"

inherit rpm
