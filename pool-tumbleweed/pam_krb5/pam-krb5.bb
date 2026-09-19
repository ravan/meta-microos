SUMMARY = "A Pluggable Authentication Module for Kerberos 5"
DESCRIPTION = "This PAM module supports authentication against a Kerberos KDC. It also \
supports updating your Kerberos password."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "2.4.13"

RPM_NAME = "pam_krb5-2.4.13-3.9.aarch64.rpm"
RPM_HASH = "5e6dc1199cbc4632d2700ab9b06a9fdf6663b092f87a00607f842ae5a967980499d5fb9b25281cc9991f594cf62f71cb7af016e860ecb10d8b721d011bad5774"

RPROVIDES:${PN} += "pam-krb \
pam-krb5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libk5crypto.so.3 \
libkeyutils.so.1 \
libkrb5.so.3 \
libpam.so.0 \
libselinux.so.1"

inherit rpm
