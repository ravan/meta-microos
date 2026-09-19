SUMMARY = "An implementation of the WS-MAN specification"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
Web Services for Management (WS-MAN) is a specification for managing \
computer systems using web services standards. \
 \
This subpackage provides the client libraries of OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "libwsman_client5-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "22c2fae1eaee90025506370cadc11fa92f1948fb9f18160499a5e099b0d9b76159265f60badf84efb251308ac2ef16e93c5c2a4d1e2fc95017c5e32b961b29ec"

RPROVIDES:${PN} += "config-libwsman-client5 \
libwsman-client.so.5 \
libwsman-client5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-curl-client-transport.so.1"

inherit rpm
