SUMMARY = "Libsocket Library for applications that use gdcm"
DESCRIPTION = "This package contains a shared library required by applications that \
are using gdcm for DICOM processing."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "libsocketxx1_2-3.2.5-2.3.aarch64.rpm"
RPM_HASH = "cf11b8ed026208e6bdb8e8624e25b9e7ef9df7e2a8c90bcbc05bfea26711916b858ce316302f25aebaefc4aee3278835ca483f9b8b4e3dddc69b72a2044c83cd"

RPROVIDES:${PN} += "libsocketxx.so.1.2 \
libsocketxx1-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
