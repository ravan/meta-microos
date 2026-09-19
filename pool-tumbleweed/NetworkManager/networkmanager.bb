SUMMARY = "Standard Linux network configuration tool suite"
DESCRIPTION = "NetworkManager attempts to keep an active network connection available \
at all times. The point of NetworkManager is to make networking \
configuration and setup as painless and automatic as possible. If \
using DHCP, NetworkManager is intended to replace default routes, \
obtain IP addresses from a DHCP server, and change name servers \
whenever it sees fit."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "9e1b6f8c1ad991431983659ae08c9c2e43c5842fbc716f1be96c3a20ada2bfbe7bac999e637839027d586bcc29c51c3511def94e4bb45f33dc11bb02661476ca"

RPROVIDES:${PN} += "NetworkManager \
NetworkManager-wifi \
dhcdbd \
libnm-device-plugin-wifi.so \
service-network \
sysvinit-network"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
NetworkManager-branding \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libndp.so.0 \
libnm.so.0 \
libnspr4.so \
libnss3.so \
libpsl.so.5 \
libreadline.so.8 \
libselinux.so.1 \
libsmime3.so \
libsystemd.so.0 \
libudev.so.1 \
mozilla-nss \
wpa-supplicant"

inherit rpm
