SUMMARY = "Development files for levmar library, and demo program"
DESCRIPTION = "Development files for the levmar library, and demo program."
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "levmar-devel-2.6-2.15.aarch64.rpm"
RPM_HASH = "5264564271bdd6784a8fe9b5a7686a1cb87dd13ecd81d8074fd46b51ea0ad7760d48f2b4233854378c3cffd1f763f00573959769a15d9ff27e8bd03049edafea"

RPROVIDES:${PN} += "levmar-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblevmar.so.2 \
liblevmar2 \
libm.so.6"

inherit rpm
