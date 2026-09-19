SUMMARY = "Library for C generic data functions"
DESCRIPTION = "A library for C generic data functions. \
 \
This subpackage contains the actual shared object library"
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcdata1-20260703-1.2.aarch64.rpm"
RPM_HASH = "18c1e7040a302974d7153b6dd80f19fa43f98f4323ba8ca37b1315b285d9e6e46d0aad373866d7677074ac6bcd5b2e3c30b396da2bb8ad23737959492fb6ab9f"

RPROVIDES:${PN} += "libcdata.so.1 \
libcdata1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
