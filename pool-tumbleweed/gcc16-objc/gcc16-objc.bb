SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "gcc16-objc-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "17e6d6b19fc6b9fb3f522fea71b8804659d2d34bb86e76174ed5922221b8152db4036064faa52048aa869417ba6c7ea4a7550822a7997919d232d7ca38e5bd53"

RPROVIDES:${PN} += "gcc16-objc"

RDEPENDS:${PN} += "gcc16 \
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
