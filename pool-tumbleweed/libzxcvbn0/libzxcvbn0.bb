SUMMARY = "Password strength estimation library for C/C++"
DESCRIPTION = "This is a C/C++ implementation of the zxcvbn password strength \
estimation library."
LICENSE = "MIT"

PV = "2.5"

RPM_NAME = "libzxcvbn0-2.5-3.7.aarch64.rpm"
RPM_HASH = "19d4a1e58267358fb7a9858f74fabf73bbf2969dc07348da441cc9cdb980d910601cfafea3d7174623271884b1f538680b0357a9337c2c99d2288d207425ab27"

RPROVIDES:${PN} += "libzxcvbn.so.0 \
libzxcvbn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
