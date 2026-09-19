SUMMARY = "Swedish (Svenska) Dictionary for Aspell"
DESCRIPTION = "A Swedish (Svenska) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.51.0"

RPM_NAME = "aspell-sv-0.51.0-4.7.aarch64.rpm"
RPM_HASH = "41fab87c591fc0102d571fdd786cb929a80573247f01a2e81733321e7966d84866ae509c49006f46cdefb9734e529a99d5fc3600e6734a70e9e22252cb4deb7a"

RPROVIDES:${PN} += "aspell-se \
aspell-sv \
locale-aspell-sv"

RDEPENDS:${PN} += ""

inherit rpm
