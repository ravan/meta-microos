SUMMARY = "Server program of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes the kdc, kadmind \
and more."
LICENSE = "MIT"

PV = "1.22.2"

RPM_NAME = "krb5-server-1.22.2-4.2.aarch64.rpm"
RPM_HASH = "d8575118c67171ea82bca000d5eaa5ae8c872bb181f1aa5364d67c37becd847a9db5d023e3c26fcc60bdec12778b0472676b336529c9f09bb7077c12e7b87f44"

RPROVIDES:${PN} += "config-krb5-server \
krb5-server"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libgssrpc.so.4 \
libk5crypto.so.3 \
libkadm5clnt-mit.so.12 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrb5.so.3 \
libkrb5support.so.0 \
liblmdb-0.9.35.so \
libss.so.2 \
libverto-libev1 \
libverto.so.1 \
logrotate \
perl-Date-Calc \
systemd"

inherit rpm
