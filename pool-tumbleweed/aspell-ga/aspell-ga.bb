SUMMARY = "Irish (Gaeilge) Dictionary for Aspell"
DESCRIPTION = "An Irish (Gaeilge) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0"

RPM_NAME = "aspell-ga-4.5.0-4.7.aarch64.rpm"
RPM_HASH = "a47943f3061ba3d275f8727fa00ad0fe705375120f836f33dd961c267d76ae47c116a100b32376c75fad0e49d972038327dd67a62c4639af2104d356f7a96024"

RPROVIDES:${PN} += "aspell-ga \
locale-aspell-ga"

RDEPENDS:${PN} += ""

inherit rpm
