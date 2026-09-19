SUMMARY = "Crypto and SSL toolkit for Python"
DESCRIPTION = "M2Crypto is a crypto and SSL toolkit for Python featuring the following: \
 \
RSA, DSA, DH, HMACs, message digests, symmetric ciphers (including \
AES). SSL functionality to implement clients and servers. HTTPS \
extensions to Python's httplib, urllib, and xmlrpclib. Unforgeable \
HMAC'ing AuthCookies for web session management. FTP/TLS client and \
server. S/MIME. ZServerSSL: A HTTPS server for Zope. ZSmime: An S/MIME \
messenger for Zope."
LICENSE = "BSD-2-Clause"

PV = "0.49.0"

RPM_NAME = "python314-M2Crypto-0.49.0-1.1.aarch64.rpm"
RPM_HASH = "0a72f13e51d0240871e80c02152fdde2428bb806b9e3bf1950ef314a3cf5eacdfdd03c14dedd7c7a005a1b7fde356147bf390bfdf8460ca87adf97ab81e56f0f"

RPROVIDES:${PN} += "python3.14dist-m2crypto \
python314-M2Crypto \
python3dist-m2crypto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python314-typing \
python314-xml"

inherit rpm
