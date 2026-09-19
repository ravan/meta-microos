SUMMARY = "MIT Kerberos5 implementation and libraries with minimal dependencies"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords. \
The package delivers MIT Kerberos with reduced features and minimal \
dependencies"
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-mini-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "b40dbc2b2660cf72d4fb1da4044776759dffa838f42be579c043c141a199fe23bcc1a46e764b252d12173b88ff39a056463cdec202f04d3313251be0f097ebe6"

RPROVIDES:${PN} += "config-krb5-mini \
krb5-mini \
libgssapi-krb5.so.2 \
libgssrpc.so.4 \
libk5crypto.so.3 \
libkadm5clnt-mit.so.12 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrad.so.0 \
libkrb5.so.3 \
libkrb5support.so.0"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
crypto-policies \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libresolv.so.2 \
libselinux.so.1 \
libss.so.2 \
libverto.so.1 \
this-is-only-for-build-envs"

inherit rpm
