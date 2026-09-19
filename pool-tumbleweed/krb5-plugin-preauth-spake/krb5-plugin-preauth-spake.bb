SUMMARY = "SPAKE preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a SPAKE plugin."
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-plugin-preauth-spake-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "feff5dcd328e9b199814942a2528cc89b2d443f98b4a96ea8dedfe168cd1a2e9ec7cc3c6f1e7a9ec884990fe5a77a2d84601dea89bf3a45789b4cfd4b8829536"

RPROVIDES:${PN} += "krb5-plugin-preauth-spake"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libk5crypto.so.3 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
