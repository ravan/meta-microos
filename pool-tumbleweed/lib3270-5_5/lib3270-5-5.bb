SUMMARY = "TN3270 Access library"
DESCRIPTION = "TN3270 access library, originally designed as part of the pw3270 application. \
 \
For more details, see https://softwarepublico.gov.br/social/pw3270/ ."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20250123"

RPM_NAME = "lib3270-5_5-5.5.0+git20250123-1.9.aarch64.rpm"
RPM_HASH = "a3b4e43e0a082cbe4e561495f277f782281c586dcc55b75a756f55668ffccc000d40d6a57766723bcf8923d0fea951af776788d3245593e20d29e50cec744b52"

RPROVIDES:${PN} += "lib3270-5-5 \
lib3270.so.5.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3"

inherit rpm
