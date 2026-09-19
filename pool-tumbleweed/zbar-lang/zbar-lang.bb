SUMMARY = "Translations for package zbar"
DESCRIPTION = "Provides translations for the 'zbar' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.23.93"

RPM_NAME = "zbar-lang-0.23.93-4.3.noarch.rpm"
RPM_HASH = "bc0b13c73dac5869eebbac14bd35b9b9ba0ce7fcf3e340471a60788f727f5cc63193702ae29d33245d9a112a4508c2c5a370e4f057c55de278c08400228ac146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zbar-pt-BR \
zbar-lang \
zbar-lang-all"

RDEPENDS:${PN} += "zbar"

inherit rpm
