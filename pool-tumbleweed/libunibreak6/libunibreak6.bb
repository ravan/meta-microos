SUMMARY = "Unicode line-breaking library"
DESCRIPTION = "Libunibreak is an implementation of the line breaking and word breaking \
algorithm as described in Unicode Standard Annex 14 and Unicode Standard \
Annex 29."
LICENSE = "Zlib"

PV = "6.1"

RPM_NAME = "libunibreak6-6.1-1.5.aarch64.rpm"
RPM_HASH = "e61d46a0acddf3cf69284812dd7fbb3b994e0e0f0cd3999e2144917cb8e372fa1a771ce968b1468c74bbd48e64c3ce110f0b6aca3917ca7d4975614b90d87924"

RPROVIDES:${PN} += "libunibreak.so.6 \
libunibreak6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
