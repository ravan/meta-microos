SUMMARY = "Bogofilter libdb backend"
DESCRIPTION = "This package contains bogofilter build with the libdb backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "bogofilter-db-1.2.5-1.1.aarch64.rpm"
RPM_HASH = "a3809fe9906f60046753fe875b5bed0fb50d29517de2a0ba4842882911ba25b269afd6c3558c69762518a3cc11c5e496305abd6ec2dbefeafc7fec94321d47da"

RPROVIDES:${PN} += "bogofilter \
bogofilter-backend \
bogofilter-db"

RDEPENDS:${PN} += "/usr/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
update-alternatives"

inherit rpm
