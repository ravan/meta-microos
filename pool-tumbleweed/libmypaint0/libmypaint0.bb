SUMMARY = "A brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes \
which is used by MyPaint and other projects including GIMP 2.9+. \
This package provides the shared libraries for libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint0-1.6.1-2.14.aarch64.rpm"
RPM_HASH = "40acb6f78137fdbc6358a7edf6e8936ad448c781af970868513505c060e9db3abbe1691dba0729991dadfc6485d14d13e68578f10e6754c5e9b06555da9541e5"

RPROVIDES:${PN} += "libmypaint \
libmypaint.so.0 \
libmypaint0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libjson-c.so.5 \
libm.so.6"

inherit rpm
