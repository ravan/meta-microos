SUMMARY = "A Tool for Mirroring FTP and HTTP Servers"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a server. \
This can be done in script files or via the command line."
LICENSE = "GPL-3.0-or-later"

PV = "1.25.0"

RPM_NAME = "wget-1.25.0-7.1.aarch64.rpm"
RPM_HASH = "4858556816551c0ffe90cb504f0831239f8e853f36c1176a337a7cd0d69e90905f7886835143e3c24bf79c8df1c146819f59cb46f377f6b9c0cd95b243c8203d"

RPROVIDES:${PN} += "config-wget \
wget"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libgpgme.so.45 \
libidn2.so.0 \
libmetalink.so.3 \
libpcre2-8.so.0 \
libproxy.so.1 \
libpsl.so.5 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
