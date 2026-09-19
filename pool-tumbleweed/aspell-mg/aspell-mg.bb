SUMMARY = "Malagasy Dictionary for Aspell"
DESCRIPTION = "A Malagasy dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20040807"

RPM_NAME = "aspell-mg-20040807-4.7.aarch64.rpm"
RPM_HASH = "488a5424f489a185929c49ef3c6f761506289900ec9ca6c5341c07041d2f6e6480439a4d0bed64c05beb02dd026ce5d9e3a84b546490cf3f34941a1c6235095f"

RPROVIDES:${PN} += "aspell-mg \
locale-aspell-mg"

RDEPENDS:${PN} += ""

inherit rpm
