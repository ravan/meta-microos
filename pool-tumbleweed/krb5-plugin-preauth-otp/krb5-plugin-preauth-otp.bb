SUMMARY = "OTP preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a OTP plugin."
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-plugin-preauth-otp-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "9153ee3d37ff2e1e95e5a504b712293a9deea0c14d9e3d0f5371e1936f1793b9f4cfa0254026df351cc0318bdea14ec435ea468eaf46386b76f988cc33cfce1e"

RPROVIDES:${PN} += "krb5-plugin-preauth-otp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libk5crypto.so.3 \
libkrad.so.0 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
