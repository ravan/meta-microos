SUMMARY = "Universal TLS Tunnel"
DESCRIPTION = "Stunnel is a proxy designed to add TLS encryption functionality to existing clients and servers without \
any changes in the programs' code. Its architecture is optimized for security, portability, and \
scalability (including load-balancing), making it suitable for large deployments."
LICENSE = "GPL-2.0-or-later"

PV = "5.80"

RPM_NAME = "stunnel-5.80-1.1.aarch64.rpm"
RPM_HASH = "c66b0fc01aa34498bb3e4709667d1ab7a5469a0917e33b2a68362693cf5587844bbc230c8eff94239d34e78450a180b9dbd0f29086d27a1be3b4c44612804e7c"

RPROVIDES:${PN} += "config-stunnel \
libstunnel.so \
stunnel \
user-stunnel"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/useradd \
fileutils \
fillup \
group-nogroup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libwrap.so.0 \
textutils"

inherit rpm
