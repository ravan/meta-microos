SUMMARY = "Certificate status monitor and PKI enrollment client"
DESCRIPTION = "Certmonger is a service which is primarily concerned with getting your \
system enrolled with a certificate authority (CA) and keeping it enrolled."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.20"

RPM_NAME = "certmonger-0.79.20-3.3.aarch64.rpm"
RPM_HASH = "c3e524bdbb8c29f96a59c4f18572babbb1f210491e3052fe3159c5c420d011fa308e30b04956d6f7faafd3b4be582a1cfc658ee8d088b5874461c3da0dbc9870"

RPROVIDES:${PN} += "certmonger \
config-certmonger"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libdbus-1.so.3 \
libidn2.so.0 \
libjansson.so.4 \
libkrb5.so.3 \
libldap.so.2 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libpopt.so.0 \
libresolv.so.2 \
libsmime3.so \
libtalloc.so.2 \
libtevent.so.0 \
libuuid.so.1 \
libxml2.so.16 \
systemd"

inherit rpm
