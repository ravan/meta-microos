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

RPM_NAME = "python313-M2Crypto-0.49.0-1.1.aarch64.rpm"
RPM_HASH = "57d8ad32347d68989a13a133107fc9e25d02aea15786b061fb44d62a7c9a08017cdc889354f282d130536b48625f81b1375790017428a45d5c38c9d521eaea5c"

RPROVIDES:${PN} += "python3-M2Crypto \
python3.13dist-m2crypto \
python313-M2Crypto \
python3dist-m2crypto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python313-typing \
python313-xml"

inherit rpm
