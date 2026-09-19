SUMMARY = "Library offering davix APIs for HTTP, remote I/O, and POSIX compatibility layer"
DESCRIPTION = "This package provides the shared libraries for davix with APIs for \
HTTP, remote I/O, and a POSIX compatibility layer."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.10"

RPM_NAME = "libdavix0-0.8.10-2.1.aarch64.rpm"
RPM_HASH = "16cffd343ad0133fa82e1ba2a7acde831ca100c1fecf2e2800bc6f2f2f57e263d6f84280f67c36e2f7edebac4097464557d574591de756a30220909dbf4f871a"

RPROVIDES:${PN} += "libdavix-copy.so.0 \
libdavix.so.0 \
libdavix0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libgsoapssl++-2.8.144.so \
libssl.so.3 \
libstdc++.so.6 \
libuuid.so.1 \
libxml2.so.16"

inherit rpm
