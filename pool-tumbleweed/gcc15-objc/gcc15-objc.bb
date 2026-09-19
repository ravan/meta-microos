SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-objc-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "69a7823c99c4fef2b0c150537a08681d1ccb38744c6de98b49d7ec1f353b0b1b6dc513617a5abfd037c475b9a63235a799061dd071d71c5ff152248ad529def7"

RPROVIDES:${PN} += "gcc15-objc"

RDEPENDS:${PN} += "gcc15 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libobjc4 \
libz.so.1 \
libzstd.so.1"

inherit rpm
