SUMMARY = "An RSA key and certificate management tool"
DESCRIPTION = "Graphical certification authority is an interface for managing RSA \
keys and certificates, and the creation and signing of PKCS#10 \
requests. It uses the OpenSSL library and a Berkeley DB for key and \
certificate storage. It supports importing and exporting keys and \
PEM/DER/PKCS8 certificates, signing and revoking of PEM/DER/PKCS12, \
and the selection of X509v3 extensions. A tree view of certificates \
is presented."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "xca-2.9.0-4.1.aarch64.rpm"
RPM_HASH = "2b182947531c6437bf3e2170990f3a10fb7382c4779e98d3e14e0928bd4f9c54486e105b48450fc9241394a315b65bb92e9a3c95147986f75c63987212b15735"

RPROVIDES:${PN} += "xca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
