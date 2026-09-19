SUMMARY = "Translations for package cdemu-client"
DESCRIPTION = "Provides translations for the 'cdemu-client' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.1"

RPM_NAME = "cdemu-client-lang-3.3.1-1.2.noarch.rpm"
RPM_HASH = "b8821db0a5ef46c9eab85028be0238ffb8970164225a6637191a0d7f7c37d3dfd39cc9a5ef323875af749ef6915f87a28852ede7aca18abae9bb5fb1bc1b2cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdemu-client-lang \
cdemu-client-lang-all \
locale-cdemu-client-de \
locale-cdemu-client-fr \
locale-cdemu-client-ka \
locale-cdemu-client-pl \
locale-cdemu-client-ro \
locale-cdemu-client-ru \
locale-cdemu-client-sl \
locale-cdemu-client-sv"

RDEPENDS:${PN} += "cdemu-client"

inherit rpm
