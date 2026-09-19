SUMMARY = "Embeddable Common-Lisp"
DESCRIPTION = "ECL (Embeddable Common-Lisp) is an interpreter of the Common-Lisp language as \
described in the X3J13 Ansi specification, featuring CLOS (Common-Lisp Object \
System), conditions, loops, etc, plus a translator to C, which can produce \
standalone executables. \
 \
ECL supports the operating systems Linux, FreeBSD, NetBSD, OpenBSD, OS X, \
Solaris and Windows, running on top of the Intel, Sparc, Alpha, PowerPC and ARM \
processors."
LICENSE = "LGPL-2.1-or-later"

PV = "26.3.27"

RPM_NAME = "ecl-26.3.27-1.6.aarch64.rpm"
RPM_HASH = "2745dcad6c74e04066cc2f348871a07536169c8da4b045ae298d47ead2e21068cedd86d5b69adc1aa6840ac489e464d7f5333c499645c9e761743a791daea627"

RPROVIDES:${PN} += "ecl"

RDEPENDS:${PN} += "/usr/bin/sh \
ecl-devel \
gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecl.so.26.3 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
pkgconfig-atomic-ops \
pkgconfig-libffi"

inherit rpm
