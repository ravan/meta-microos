SUMMARY = "Kerberos 5 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Kerberos 5 authentication support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-krb5-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "11c2465c332abb3dded79ed25a6806edf2f00e6f45c4bf5090de1b5fd4383d893f226cb38c830ec1ee7b6db4d9256a699cca2af92c4a651ef7b09a13ee20198e"

RPROVIDES:${PN} += "config-freeradius-server-krb5 \
freeradius-server-krb5"

RDEPENDS:${PN} += "freeradius-server \
group-radiusd \
libc.so.6 \
libcom-err.so.2 \
libkrb5.so.3"

inherit rpm
