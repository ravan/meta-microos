SUMMARY = "PKINIT preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a PKINIT plugin."
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-plugin-preauth-pkinit-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "980d231751b7e867b8210d7900080e9cd809ecec2eb553160ad1d3240b2be0a32b7d786d8ca056fdaf1f4d0932c69c208f8eb95531f8d2baecdeae5c7f72d984"

RPROVIDES:${PN} += "krb5-plugin-preauth-pkinit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libk5crypto.so.3 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
