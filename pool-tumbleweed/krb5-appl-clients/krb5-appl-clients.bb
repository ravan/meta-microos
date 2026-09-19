SUMMARY = "MIT Kerberos5 client applications"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve your network's security by eliminating the insecure \
practice of cleartext passwords. This package includes some kerberos \
compatible client applications like ftp, rpc, rlogin, telnet, ..."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "krb5-appl-clients-1.0.3-6.3.aarch64.rpm"
RPM_HASH = "07dc6483b04d15bba2507075bde46d69857259f00bbd856181b0cca1cc1a96ded17fd97d8d73b7e0133d435d0a2e300a721d25ae5ef1475f006d7cd0801bcdac"

RPROVIDES:${PN} += "krb5-appl-clients \
krb5-apps-clients"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkrb5.so.3 \
libtinfo.so.6"

inherit rpm
