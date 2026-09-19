SUMMARY = "MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords."
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "7d9ba33123b1a136e25c01db80b17c811d64e608511b8525dbd22fad62a003bee20a0d3212ae214d2da767693a61290f722c469a269c78583d76b8b00c9de74b"

RPROVIDES:${PN} += "config-krb5 \
krb5 \
libgssapi-krb5.so.2 \
libgssrpc.so.4 \
libk5crypto.so.3 \
libkadm5clnt-mit.so.12 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrad.so.0 \
libkrb5.so.3 \
libkrb5support.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libkeyutils.so.1 \
libresolv.so.2 \
libselinux.so.1 \
libssl.so.3 \
libverto.so.1"

inherit rpm
