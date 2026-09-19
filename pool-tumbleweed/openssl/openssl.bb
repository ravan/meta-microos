SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "The OpenSSL Project is a collaborative effort to develop a robust, \
commercial-grade, full-featured, and open source toolkit implementing \
the Secure Sockets Layer (SSL v2/v3) and Transport Layer Security (TLS \
v1) protocols with full-strength cryptography. The project is managed \
by a worldwide community of volunteers that use the Internet to \
communicate, plan, and develop the OpenSSL toolkit and its related \
documentation."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "openssl-3.5.3-1.3.noarch.rpm"
RPM_HASH = "47d0612502e26783558c1257298162f4c5b3644d149ab6def7cd57d0a695aa38ddb4f3b79ff0f25cbfc0ae84a82847f21a56da82cd6f7ff3210b79cced2dfb7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl \
openssl-cli"

RDEPENDS:${PN} += "openssl-3"

inherit rpm
