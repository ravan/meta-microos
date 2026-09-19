SUMMARY = "Development Files for freerdp"
DESCRIPTION = "This package contains development files necessary for developing applications \
based on libfreerdp."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "freerdp-devel-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "57f5fe5fee69405d07e7a599b8ce76ea16d8ea9834a0de5ebfc6e446bba97b693ace918a31402efda366e9e0508baff1ede36889f31bde65db3eed1ade19cfcf"

RPROVIDES:${PN} += "cmake-FreeRDP \
cmake-FreeRDP-Client \
cmake-FreeRDP-Proxy \
cmake-FreeRDP-Server \
cmake-FreeRDP-Shadow \
cmake-WinPR-tools \
freerdp-devel \
freerdp-server-proxy3-3-devel \
pkgconfig-freerdp-client3 \
pkgconfig-freerdp-server-proxy3 \
pkgconfig-freerdp-server3 \
pkgconfig-freerdp-shadow3 \
pkgconfig-freerdp3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreerdp-server-proxy3-3 \
libfreerdp3-3 \
pkgconfig-freerdp-server3 \
pkgconfig-freerdp3 \
pkgconfig-fuse3 \
pkgconfig-sso-mib \
pkgconfig-winpr3 \
winpr-devel"

inherit rpm
