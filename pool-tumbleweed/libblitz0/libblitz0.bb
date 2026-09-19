SUMMARY = "Blitz++ Multi-Dimensional Array Library for C++"
DESCRIPTION = "Blitz++ is a C++ template class library that provides high-performance \
multidimensional array containers for scientific computing. \
 \
This package provides shared libraries with blitz."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "libblitz0-1.0.2-2.25.aarch64.rpm"
RPM_HASH = "06b55667facf68b5f6f1733c05268eadbeb9111d617c00125e8cb2f8eab4ffd2cb4f78c51898bfc06fc92fcbb6490e27f91927ea40560f2cb069ce09c57d1be3"

RPROVIDES:${PN} += "libblitz.so.0 \
libblitz0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libstdc++.so.6"

inherit rpm
