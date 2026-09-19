SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-objc-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "35412051202b61b50db014ffe0e8dc350b0fbc3cfdc378f7d7000fb886f16a4d18c4fcdcd75f8f4ae073d9a603f95581967fafedcfa1fae22b5e0cc30608a123"

RPROVIDES:${PN} += "gcc7-objc"

RDEPENDS:${PN} += "gcc7 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libobjc4 \
libz.so.1"

inherit rpm
