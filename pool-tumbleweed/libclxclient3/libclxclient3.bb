SUMMARY = "C++ wrapper library around the X Window System API"
DESCRIPTION = "C++ wrapper library around the X Window System API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.2"

RPM_NAME = "libclxclient3-3.9.2-3.9.aarch64.rpm"
RPM_HASH = "a7b19f1d2edf1c3219260c850738e367bec027ed8d620cb24e77b941a80a8a969877b7d720b4090df865c20fcdb1955b242b2d9e5b6a6cb98ebb11a2c59e80e4"

RPROVIDES:${PN} += "libclxclient.so.3 \
libclxclient3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
