SUMMARY = "An implementation of the WS-MAN specification"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
Web Services for Management (WS-MAN) is a specification for managing \
computer systems using web services standards. \
 \
This subpackage provides the common libraries of OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "libwsman1-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "50d7c10be78e1384f99c2ae009f4574ce0d32613f53e12af946a9db12a264b85f6aa5403b57af0742c6ad61f0c75ad29fe94d9a73c7f77af6777082790aa0704"

RPROVIDES:${PN} += "libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
libwsman1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3 \
libwsman-client.so.5 \
libxml2.so.16"

inherit rpm
