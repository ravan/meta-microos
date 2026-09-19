SUMMARY = "RADIUS Server"
DESCRIPTION = "Remote Authentication Dial-In User Service (RADIUS) is a networking \
protocol that provides centralized Authentication, Authorization, and \
Accounting (AAA or Triple A) management for users who connect and \
use a network service. \
 \
FreeRADIUS is a modular RADIUS implementation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "7ad739cfe44aaf3c26b600012035f59154fc3d35b736af3d28d7015c1c6be3c6f539e1095364018cc84c082dcd720ab731e819a70184e05ffa1b95b51abba907"

RPROVIDES:${PN} += "config-freeradius-server \
freeradius \
freeradius-server \
group-radiusd \
group-winbind \
radiusd \
user-radiusd"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
freeradius-server-libs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libct.so.4 \
libcurl.so.4 \
libfreeradius-dhcp.so \
libfreeradius-eap.so \
libfreeradius-radius.so \
libfreeradius-server.so \
libgdbm.so.6 \
libjson-c.so.5 \
libmemcached.so.11 \
libodbc.so.2 \
libpam.so.0 \
libssl.so.3 \
libtalloc.so.2 \
libunbound.so.8 \
libwbclient.so.0 \
openssl \
perl \
pwdutils \
systemd"

inherit rpm
