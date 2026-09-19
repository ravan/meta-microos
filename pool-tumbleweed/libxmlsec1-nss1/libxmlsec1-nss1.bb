SUMMARY = "NSS crypto plugin for XML Security Library"
DESCRIPTION = "NSS plugin for XML Security Library provides NSS based crypto services \
for the xmlsec library."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "libxmlsec1-nss1-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "15591427a0904b68520b086563846a7c1ccb1f8c0624b53a4d6f4ae3cbd75fcd00fdf06db64dadf9d58e534cc3920b7c88686c371196fec7811c821776d02953"

RPROVIDES:${PN} += "libxmlsec1-nss.so.1 \
libxmlsec1-nss1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libxml2.so.16 \
libxmlsec1-1 \
libxmlsec1.so.1"

inherit rpm
