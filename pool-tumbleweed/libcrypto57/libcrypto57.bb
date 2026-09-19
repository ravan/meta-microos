SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "The 'crypto' library implements a wide range of cryptographic \
algorithms used in various Internet standards. The services provided \
by this library are used by the LibreSSL implementations of SSL, TLS \
and S/MIME, and they have also been used to implement SSH, OpenPGP, \
and other cryptographic standards."
LICENSE = "OpenSSL"

PV = "4.3.2"

RPM_NAME = "libcrypto57-4.3.2-1.3.aarch64.rpm"
RPM_HASH = "f22f6123926cd8e31a808f6363b516342acb52838c6ce6e540022a9e7228144a1954d687e17f3301a4b790d3d124092778e2c9b8492c1c8ef0791451a55d3e08"

RPROVIDES:${PN} += "libcrypto.so.57 \
libcrypto57"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
