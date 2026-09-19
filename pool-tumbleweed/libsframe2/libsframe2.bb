SUMMARY = "SFrame stack trace format library (runtime)"
DESCRIPTION = "This package includes the libsframe shared library. \
The SFrame format is a compact way to represent information \
necessary to generate stack traces."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "libsframe2-2.45-4.3.aarch64.rpm"
RPM_HASH = "2167bdc0da64cb9b45f4a4a48ecc6d436e8568bb343dda5d521712f3f8e0548e76ff461c568b832e93730bdf651e17f02567cbbfc0eb0a75b8037ebd6ea1c67b"

RPROVIDES:${PN} += "libsframe.so.2 \
libsframe2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
