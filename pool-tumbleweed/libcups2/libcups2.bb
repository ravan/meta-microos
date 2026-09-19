SUMMARY = "HTTP/IPP communication and printer queue and job library"
DESCRIPTION = "The CUPS library contains all of the core HTTP and IPP communications \
code as well as convenience functions for queuing print jobs, getting \
printer information, accessing resources via HTTP and IPP, and \
manipulating PPD files. The scheduler and all commands, filters, and \
backends use this library."
LICENSE = "Apache-2.0"

PV = "2.4.19"

RPM_NAME = "libcups2-2.4.19-3.1.aarch64.rpm"
RPM_HASH = "22188be4cd7a31dc1bd7946cce21200fb9bad07b7a90944e9bca354265b5d75d14579909a41416cc92c17fc030eedbc69fcb0c194502f442e5acced1539fe748"

RPROVIDES:${PN} += "cups-libs \
libcups.so.2 \
libcups2"

RDEPENDS:${PN} += "/sbin/ldconfig \
cups-config \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libm.so.6 \
libz.so.1"

inherit rpm
