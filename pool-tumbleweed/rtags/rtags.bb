SUMMARY = "Clang based source code indexer"
DESCRIPTION = "Rtags is Clang based source file indexer supporting C/C++/Objective-C(++) code."
LICENSE = "GPL-3.0-or-later"

PV = "2.46"

RPM_NAME = "rtags-2.46-1.2.aarch64.rpm"
RPM_HASH = "8dde902ea440a04abbdceac35aa7be54ec505a61772af3db094a6246fa53b70675876d66c7519f6ae298b82373c54c2f9a8e6b58b2aae3b5a83417cd9a1f2fbf"

RPROVIDES:${PN} += "rtags"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
