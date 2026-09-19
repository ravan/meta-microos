SUMMARY = "Translations for package gnu-recutils"
DESCRIPTION = "Provides translations for the 'gnu-recutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "gnu-recutils-lang-1.9-3.4.noarch.rpm"
RPM_HASH = "e08bed45b38dc4f9904b31d892e1b8d6737dc9f936339fd4ff0553fff10728bb02b74f726714944573062ff6bc38f4ad55c8542c31a40a5871f39492f6bb71b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-recutils-lang \
gnu-recutils-lang-all \
locale-gnu-recutils-de \
locale-gnu-recutils-es \
locale-gnu-recutils-fi \
locale-gnu-recutils-fr \
locale-gnu-recutils-nl \
locale-gnu-recutils-pt-BR \
locale-gnu-recutils-sr \
locale-gnu-recutils-sv \
locale-gnu-recutils-uk \
locale-gnu-recutils-vi"

RDEPENDS:${PN} += "gnu-recutils"

inherit rpm
