SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-objc-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "1adfdf920d446f565ed253ed546bd5a5242dd45fc9623fd611786256f623681b3c9da7657baeb9a04663f1c6f4270a387d5fccf4b90c6534e61d357a7f313b4f"

RPROVIDES:${PN} += "gcc13-objc"

RDEPENDS:${PN} += "gcc13 \
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
