SUMMARY = "An HTTP and WebDAV Client Library"
DESCRIPTION = "neon is an HTTP and WebDAV client library with a C interface."
LICENSE = "LGPL-2.0-or-later"

PV = "0.37.1"

RPM_NAME = "libneon27-0.37.1-1.3.aarch64.rpm"
RPM_HASH = "82eec4a118550aebf52abdb04d719c908b33ba1aaad69806e494c9bbbd0670407657ff3aff02b7442d42a25b1629dc84bdd4212bd7d72ca5273effc1f663190b"

RPROVIDES:${PN} += "libneon.so.27 \
libneon27 \
neon"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libgssapi-krb5.so.2 \
libntlm.so.0 \
libproxy.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
