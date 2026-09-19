SUMMARY = "Shared library for aria2"
DESCRIPTION = "aria2 is a utility for downloading files. It has a segmented \
downloading engine in its core. It can download one file from \
multiple URLs or multiple connections from one URL. This can be used \
to speed up downloads with certain networks. The engine in was \
implemented in a single-thread model. \
 \
This package contains the shared library."
LICENSE = "LicenseRef-SUSE-GPL-2.0-with-openssl-exception"

PV = "1.37.0"

RPM_NAME = "libaria2-0-1.37.0-2.2.aarch64.rpm"
RPM_HASH = "eb972cc1699194102a828752a055f4eb4a9290613c35a87a1f48bbb8519b43083c59cb799fe37179174020078947b1e0bfac2e08c2c7de5edaab250b818aac12"

RPROVIDES:${PN} += "libaria2-0 \
libaria2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libm.so.6 \
libnettle.so.8 \
libsqlite3.so.0 \
libssh2.so.1 \
libstdc++.so.6 \
libuv.so.1 \
libxml2.so.16 \
libz.so.1"

inherit rpm
