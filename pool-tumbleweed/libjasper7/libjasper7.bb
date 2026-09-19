SUMMARY = "JPEG-2000 library"
DESCRIPTION = "This package contains libjasper, a library implementing the JPEG-2000 \
image compression standard Part 1."
LICENSE = "JasPer-2.0"

PV = "4.2.9"

RPM_NAME = "libjasper7-4.2.9-1.4.aarch64.rpm"
RPM_HASH = "48a41bdd5e2536c86d2c44125b04fcc6b969a2c48e24a2d80570768a1d584152332ed04fdb7af165960b8bdad08fb64083bad8ab06fdd1c5cf07813450990446"

RPROVIDES:${PN} += "libjasper.so.7 \
libjasper7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6"

inherit rpm
