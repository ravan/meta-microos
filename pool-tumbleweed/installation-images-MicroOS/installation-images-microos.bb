SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.178"

RPM_NAME = "installation-images-MicroOS-17.178-1.9.aarch64.rpm"
RPM_HASH = "df09ef4fc16eb7bc82cd0a3b5d10ebb7017b8620064ec169f9a8493e5f019209a16f1ab4c36c0fe69dee4c65bdc06ed9f22f4fc5730942a2d589125770182863"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
