SUMMARY = "MIT Kerberos5 server applications"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve your network's security by eliminating the insecure \
practice of cleartext passwords. This package includes some kerberos \
compatible server applications like ftpd, klogind, telnetd, ..."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "krb5-appl-servers-1.0.3-6.3.aarch64.rpm"
RPM_HASH = "1b83cf005e0d506faf681343a47021f322c3c6f4ce57b2484963821642f650688ec9684a413041c89ec8cbb51cb71afb126b2a6fededbefad910d39a2eb49dc6"

RPROVIDES:${PN} += "config-krb5-appl-servers \
krb5-appl-servers \
krb5-apps-servers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkrb5.so.3 \
libtinfo.so.6"

inherit rpm
