SUMMARY = "Translations for package libinfinity"
DESCRIPTION = "Provides translations for the 'libinfinity' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-lang-0.7.2-4.20.noarch.rpm"
RPM_HASH = "15b7d94d2727449cfb2f612a2428e5e17abdf86046b1f3f21752699e304bd226a58a08c028c20f40f9e57ce7e6a859a2e7adcdf6542ebc4b2b408d200a4f2ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libinfinity-lang \
libinfinity-lang-all \
locale-libinfinity-ca \
locale-libinfinity-de"

RDEPENDS:${PN} += "libinfinity"

inherit rpm
