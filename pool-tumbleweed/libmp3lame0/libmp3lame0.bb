SUMMARY = "The LAME MP3 encoder library"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "libmp3lame0-3.100-5.15.aarch64.rpm"
RPM_HASH = "d0596f257393395b385137b9e55fac98dfee29312007ab7c4b2a651dbe398c1e13dd0a69a062865296fd6647e509182ed36249ddbf23964c75790ab96df8678e"

RPROVIDES:${PN} += "libmp3lame.so.0 \
libmp3lame0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
