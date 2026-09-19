SUMMARY = "LibMicro is a portable set of microbenchmarks"
DESCRIPTION = "LibMicro is a portable set of microbenchmarks that many Solaris \
engineers used during Solaris 10 development to measure the \
performance of various system and library calls."
LICENSE = "CDDL-1.0"

PV = "0.4.2+hg.20120726"

RPM_NAME = "libmicro-0.4.2+hg.20120726-5.6.aarch64.rpm"
RPM_HASH = "628765e06366409b9e27747644dae6b589df465c670c76c8bf2c8084a79ff8936ad6ee7aa2a8b3e529685f09a4a4caef39a9e54064bc0dcc3babd9327d467d8c"

RPROVIDES:${PN} += "libmicro"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
