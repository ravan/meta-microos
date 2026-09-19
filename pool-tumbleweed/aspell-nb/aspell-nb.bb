SUMMARY = "Norwegian Bokmaal (Norsk bokmål) Dictionary for Aspell"
DESCRIPTION = "A Norwegian Bokmaal (Norsk bokmål) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.10"

RPM_NAME = "aspell-nb-0.50.10-4.7.aarch64.rpm"
RPM_HASH = "66942cfdc8e637b74cf9ee5fe9a61395e20ce4899988590b95579afb0a50391eb58bfe684c4efde9fc7b56189b2efbd301e3372e84f9a176a8c41e8a5b489653"

RPROVIDES:${PN} += "aspell-nb \
aspell-no \
locale-aspell-nb"

RDEPENDS:${PN} += ""

inherit rpm
