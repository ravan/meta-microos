SUMMARY = "Farbfeld image conversion tools"
DESCRIPTION = "Tools for converting images into and from the suckless.org farbfeld \
format, which is practically the same as the Netpbm P7 RGB_ALPHA \
format, only with a custom header."
LICENSE = "ISC"

PV = "4"

RPM_NAME = "farbfeld-4-2.16.aarch64.rpm"
RPM_HASH = "1da0d0d6c945c2585e4f29e690532b39d9ca912120594de016ab0866486c1667c57f6584ef5af3c3fcefffcd6cbcd6c4325b7f46d6c1fe76dab053c635846849"

RPROVIDES:${PN} += "farbfeld"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
