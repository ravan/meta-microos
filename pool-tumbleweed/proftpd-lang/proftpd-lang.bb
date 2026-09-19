SUMMARY = "Translations for package proftpd"
DESCRIPTION = "Provides translations for the 'proftpd' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-lang-1.3.9c-2.1.noarch.rpm"
RPM_HASH = "5e82a8c360454566299c5928d63e97fc6c4284f70e84b9f546861b0013e4a2518f1f581b5325b36e57854dfd654b6d6aeb950f865dbc512a7423ba91317ff52b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-proftpd-en-US \
locale-proftpd-es-ES \
locale-proftpd-fr-FR \
locale-proftpd-it-IT \
locale-proftpd-pl-PL \
locale-proftpd-ru-RU \
locale-proftpd-zh-CN \
locale-proftpd-zh-TW \
proftpd-lang \
proftpd-lang-all"

RDEPENDS:${PN} += "proftpd"

inherit rpm
