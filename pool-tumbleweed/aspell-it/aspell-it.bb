SUMMARY = "Italian (italiano) Dictionary for Aspell"
DESCRIPTION = "An Italian (italiano) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "2.2_20050523"

RPM_NAME = "aspell-it-2.2_20050523-4.7.aarch64.rpm"
RPM_HASH = "56c159ea64745a6dbf0b7da07eb81a864450ab08f0f9644e40261f5e68e6c976de4dd05b1c0d5538e32893e0c5cb7ed9c87bacd832e66bb1ee9b8c4683361648"

RPROVIDES:${PN} += "aspell-it \
locale-aspell-it"

RDEPENDS:${PN} += ""

inherit rpm
