SUMMARY = "LDAP database plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords. This package contains the LDAP \
database plugin."
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-plugin-kdb-ldap-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "4d85f59d2223b530fb1cbd922f0da06de31d0672598232262006e366dc1aa21f37d1c17a22e166bf18890ce81bd8a171e1b7833919b841e15c5721569db488ab"

RPROVIDES:${PN} += "config-krb5-plugin-kdb-ldap \
krb5-plugin-kdb-ldap \
libkdb-ldap.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
krb5-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssrpc.so.4 \
libk5crypto.so.3 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrb5.so.3 \
libkrb5support.so.0 \
libldap.so.2"

inherit rpm
