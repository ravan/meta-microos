SUMMARY = "Hebrew (עברית) Dictionary for Aspell"
DESCRIPTION = "A Hebrew (עברית) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "aspell-he-1.0.0-4.7.aarch64.rpm"
RPM_HASH = "5b5f9dccf623e4b7354138ba0cc7086caa735b7c3134c97b65150ccaffc5b230e366ffe6b366cd5bc3d4c75f91ee13b7677282fa041c1a221c913d46e3ae2c8b"

RPROVIDES:${PN} += "aspell-he \
locale-aspell-he"

RDEPENDS:${PN} += ""

inherit rpm
