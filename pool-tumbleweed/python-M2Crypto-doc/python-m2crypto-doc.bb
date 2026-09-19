SUMMARY = "Documentation for the Crypto and SSL toolkit for Python"
DESCRIPTION = "M2Crypto is a crypto and SSL toolkit for Python featuring the following: \
 \
RSA, DSA, DH, HMACs, message digests, symmetric ciphers (including \
AES). SSL functionality to implement clients and servers. HTTPS \
extensions to Python's httplib, urllib, and xmlrpclib. Unforgeable \
HMAC'ing AuthCookies for web session management. FTP/TLS client and \
server. S/MIME. ZServerSSL: A HTTPS server for Zope. ZSmime: An S/MIME \
messenger for Zope. \
 \
Documentation for the Crypto and SSL toolkit for Python"
LICENSE = "BSD-2-Clause"

PV = "0.49.0"

RPM_NAME = "python-M2Crypto-doc-0.49.0-1.1.noarch.rpm"
RPM_HASH = "05ac6b107d339ecd3f6d6d1b9376baf1ca71c15d08add776dc2dbf8d13bc1744f4159467c5b0aac96a8f7706df90d13254763b7cc2e29fe307afc2549d060d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-M2Crypto-doc"

RDEPENDS:${PN} += ""

inherit rpm
