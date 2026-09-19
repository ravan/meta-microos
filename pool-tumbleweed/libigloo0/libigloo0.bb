SUMMARY = "Generic C framework used and developed by the Icecast project"
DESCRIPTION = "libigloo is a generic C framework. It is developed and used by the Icecast project."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.5"

RPM_NAME = "libigloo0-0.9.5-1.3.aarch64.rpm"
RPM_HASH = "e6b7067bb4ceb40f4d378563a71f5627b61252066bb21af1a4e25ecb1df8671dc530898283db963160cf49505cbfd25689fafb33fd6709fa09fdee752bf31cdd"

RPROVIDES:${PN} += "libigloo.so.0 \
libigloo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
librhash.so.1"

inherit rpm
