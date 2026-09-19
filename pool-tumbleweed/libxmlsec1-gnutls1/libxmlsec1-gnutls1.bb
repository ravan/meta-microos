SUMMARY = "GNUTls crypto plugin for XML Security Library"
DESCRIPTION = "GNUTls plugin for XML Security Library provides GNUTls based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "libxmlsec1-gnutls1-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "0d3828112c35bc6217b85281a2842268dfe1bcb986416f5491fc767a64967cc206176bb2f6cf7f03fae8d9efecdab87f4100da0cccfd43ff33b0d3d71b81b471"

RPROVIDES:${PN} += "libxmlsec1-gnutls.so.1 \
libxmlsec1-gnutls1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libxml2.so.16 \
libxmlsec1-1 \
libxmlsec1-gcrypt.so.1 \
libxmlsec1.so.1"

inherit rpm
