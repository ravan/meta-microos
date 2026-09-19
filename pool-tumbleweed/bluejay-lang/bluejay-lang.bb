SUMMARY = "Translations for package bluejay"
DESCRIPTION = "Provides translations for the 'bluejay' package."
LICENSE = "MPL-2.0"

PV = "1.0.3+0"

RPM_NAME = "bluejay-lang-1.0.3+0-1.2.noarch.rpm"
RPM_HASH = "bb210b62346fc4ade6c726889702c49efa0cd70438fdf41958aa63efadb01719b631e2cec5247ccb0ca3b68c1c478f9d8ca0244cf27890dec00027dcb10867e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluejay-lang \
bluejay-lang-all \
locale-bluejay-cs \
locale-bluejay-de \
locale-bluejay-fr \
locale-bluejay-uk \
locale-bluejay-zh-CN"

RDEPENDS:${PN} += "bluejay"

inherit rpm
