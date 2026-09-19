SUMMARY = "Development libraries and headers for libgme"
DESCRIPTION = "The developmental files that must be installed in order to compile applications \
which use libgme."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.5"

RPM_NAME = "libgme-devel-0.6.5-1.3.aarch64.rpm"
RPM_HASH = "891a0187990f1d8af6adc00758224889150617e9a94c9d5197046eb5ddbabd0ef5e3e28efa6ba4396d20abb3bfc33fb7bdd540c80b603f29757bfe64d9b9da5a"

RPROVIDES:${PN} += "libgme-devel \
pkgconfig-libgme"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgme0"

inherit rpm
