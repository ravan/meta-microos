SUMMARY = "C++ Library for Reading and Writing Zip Files"
DESCRIPTION = "Zipios is a java.util.zip-like C++ library for reading and writing Zip files. \
Access to individual entries is provided through standard C++ iostreams. A \
simple read-only virtual file system that mounts regular directories and zip \
files is also provided."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "libzipios2-2.3.2-1.11.aarch64.rpm"
RPM_HASH = "786474c63ccc25f7711d3bf5c934140b8e9151d91a1f048403e1e863f0889d897702e63ed9fe2baeceb5b862bb8b51098d6ab822b634c8e3f6b598f5bcee28a2"

RPROVIDES:${PN} += "libzipios.so.2 \
libzipios2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
