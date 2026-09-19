SUMMARY = "AD integration detection"
DESCRIPTION = "This packages contains realmd. \
 \
Realmd is an on demand system DBus service, which allows \
callers to configure network authentication and domain \
membership in a standard way. realmd discovers information \
about the domain or realm automatically and does not require \
complicated configuration in order to join a domain or realm. \
 \
realmd configures sssd or winbind to do the actual network \
authentication and user account lookups."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.1"

RPM_NAME = "realmd-0.17.1-4.8.aarch64.rpm"
RPM_HASH = "689ba345fe9334bdf53113b8daf68716b4dd02c9262341d166bdbd41beb8be92e822ebcd4ded623b702e127e25c33f9f3bd99a493fb1e231a76d35499e416d06"

RPROVIDES:${PN} += "config-realmd \
realmd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libpolkit-gobject-1.so.0 \
systemd"

inherit rpm
