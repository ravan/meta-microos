SUMMARY = "Static libraries for libattr development"
DESCRIPTION = "This package contains the static library of libattr which is needed for \
staticallly linking to programs that make use of extended attributes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "libattr-devel-static-2.6.0-1.2.aarch64.rpm"
RPM_HASH = "879febd5e5d303f27e3adfb9a7f3ab12ab2ed7ff5e02793783b94c202753827961aaefc9fbc78ef759d3a52f94f676dfbc66b6ddb1ea2c4184b789dac5e71678"

RPROVIDES:${PN} += "libattr-devel-/usr/lib64/libattr.a \
libattr-devel-static"

RDEPENDS:${PN} += "libattr-devel"

inherit rpm
