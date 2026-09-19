SUMMARY = "Configurable GPL-licensed FTP server software"
DESCRIPTION = "ProFTPD is a configurable FTP daemon for Unix and Unix-like \
operating systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.9c"

RPM_NAME = "proftpd-1.3.9c-2.1.aarch64.rpm"
RPM_HASH = "6fb93cbc9234ddb8dcd6f189d70737f396ed151bf1f164de440c730ee62941ba17252cfd28fe82acfb165fc59996625cd7c81d78c565d0d804f08489b0cc7345"

RPROVIDES:${PN} += "config-proftpd \
proftpd"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
group-ftp \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libhiredis-ssl.so.1.3.0 \
libhiredis.so.1.3.0 \
libmemcached.so.11 \
libmemcachedutil.so.2 \
libncursesw.so.6 \
libpam.so.0 \
libpcre2-8.so.0 \
libpcre2-posix.so.3 \
libsodium.so.26 \
libssl.so.3 \
libtinfo.so.6 \
libz.so.1 \
logrotate \
user-ftp"

inherit rpm
