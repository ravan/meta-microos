SUMMARY = "Sardinian (Sardu) Dictionary for Aspell"
DESCRIPTION = "A Sardinian (Sardu) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "aspell-sc-1.0-4.7.aarch64.rpm"
RPM_HASH = "c77e63b7cee4ecc71b75b2a3f75f408305634297c4d15fbdb523c390b66827b408bd709e296e50e1e4c5a8433bfff3d82d36a09094d873331c920e22f8ae4e46"

RPROVIDES:${PN} += "aspell-sc \
locale-aspell-sc"

RDEPENDS:${PN} += ""

inherit rpm
