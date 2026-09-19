SUMMARY = "BSD function library"
DESCRIPTION = "A library that extends the GNU libc with some functions and macros from BSD, \
most notably the string functions strlcpy(3), strlcat(3) and the *BSD \
sys/queue.h and sys/tree.h APIs. \
 \
glibc is not offering the _SAFE macros from the BSD sys/queue.h API — \
recommended when traversing lists to delete/free nodes."
LICENSE = "MIT & X11"

PV = "2.6.2"

RPM_NAME = "libite5-2.6.2-1.4.aarch64.rpm"
RPM_HASH = "8ac67ee0b05e0d4969941b9eb2613db3ca71362dc1dc3c3089ef3cf53db74fde94607b0ee2f9d8aed472569ccd84627067972fd1ffa559fbcc9b127e18c60d95"

RPROVIDES:${PN} += "libite.so.5 \
libite5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
