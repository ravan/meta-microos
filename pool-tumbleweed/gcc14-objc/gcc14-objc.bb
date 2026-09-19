SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-objc-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "de4816cd8688b8743fc3b13987934e0fb8e337d557cb6eb1645356bf5793f90322ff9b57366a3eef72eb059bcdbd4a05288da631c4d4d077f19e067d9089d546"

RPROVIDES:${PN} += "gcc14-objc"

RDEPENDS:${PN} += "gcc14 \
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
