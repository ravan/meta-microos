SUMMARY = "File management over HTTP-based protocols"
DESCRIPTION = "Davix does file management over HTTP-based protocols. It focuses on \
remote I/O and data management of large collections of files. There \
is support for the WebDav, Amazon S3, Microsoft Azure, and HTTP \
protocols. \
 \
It provides a C++ library offering an HTTP API, a remote I/O API, and \
a POSIX compatibility layer. It also provides several utilities for \
file transfer, large collections of files management and large files \
management."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.10"

RPM_NAME = "davix-0.8.10-2.1.aarch64.rpm"
RPM_HASH = "a39f9f328bc0d22057b92e82ff7c0a1dc76f19b61f4a80a040618f62c1475a6dec32e32c1080c9e869fa12c01e933b05e09878c34de5ceee1f5fccfcb01d082b"

RPROVIDES:${PN} += "davix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdavix-copy.so.0 \
libdavix.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
