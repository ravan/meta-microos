SUMMARY = "Translations for package blobwars"
DESCRIPTION = "Provides translations for the 'blobwars' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.00"

RPM_NAME = "blobwars-lang-2.00-4.10.noarch.rpm"
RPM_HASH = "d1c754739ab4d6c6c5f57b31a8263feb1e14037820bb4162360af36c8c46e0efd6b764d16088e76a3394b9a90334ce7d6ae60dd69e2665d39ac44ee0ca160e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blobwars-lang \
blobwars-lang-all \
locale-blobwars-ca \
locale-blobwars-da \
locale-blobwars-de \
locale-blobwars-es \
locale-blobwars-fr \
locale-blobwars-nl \
locale-blobwars-pl \
locale-blobwars-sv"

RDEPENDS:${PN} += "blobwars"

inherit rpm
