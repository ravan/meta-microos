SUMMARY = "Client programs of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes some required \
client programs, like kinit, kadmin, ..."
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-client-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "c08d3a6cc4ca7e6113b84ea725e77acb344a9a9860333915b309c59b3bc1b49884e3a21031072b503d8119bd89a4ecd004ae2a1f82cd4b28b4999ba986106677"

RPROVIDES:${PN} += "krb5-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkadm5clnt-mit.so.12 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrb5.so.3 \
libkrb5support.so.0 \
libpam.so.0 \
libss.so.2"

inherit rpm
