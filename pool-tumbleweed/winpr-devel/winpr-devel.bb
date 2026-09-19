SUMMARY = "Windows Portable Runtime development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the winpr and winpr-tools libraries."
LICENSE = "Apache-2.0"

PV = "3.31.0"

RPM_NAME = "winpr-devel-3.31.0-1.1.aarch64.rpm"
RPM_HASH = "e2299b3831f2a653d05213fd3a5dc533ede4ebabc35fca2a6f6a08cd6cf50c11c481d2392e1493dff365d645ab2ae0ebdcd1f3f4ab18da4d5dd38fd2af899375"

RPROVIDES:${PN} += "cmake-WinPR \
libwinpr2-devel \
pkgconfig-winpr-tools3 \
pkgconfig-winpr3 \
winpr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
freerdp-server \
libwinpr3-3 \
pkgconfig-winpr3"

inherit rpm
