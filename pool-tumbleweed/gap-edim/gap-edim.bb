SUMMARY = "GAP: Elementary Divisors of Integer Matrices"
DESCRIPTION = "This package provides a collection of functions for computing the \
Smith normal form of integer matrices and some related utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.8"

RPM_NAME = "gap-edim-1.3.8-2.6.aarch64.rpm"
RPM_HASH = "263a734cc3913b0898558e216d564f3c377771ddd0d181cbe728cfc052883cafbfd39b2d86615593d1c330e3db6d4aca09223c1554305f45e7cc5c4a5259bdb9"

RPROVIDES:${PN} += "gap-edim"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
libc.so.6"

inherit rpm
