SUMMARY = "Windows Portable Runtime development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the winpr and winpr-tools libraries."
LICENSE = "Apache-2.0"

PV = "2.11.7"

RPM_NAME = "winpr2-devel-2.11.7-8.4.aarch64.rpm"
RPM_HASH = "3fee24dd4a15f466e78f63883dcba049a3f856142254cf2d30c5a8479586f4f33a3d388739ea9c07f737064226042d048de88c345fee105af6618f0ea489e632"

RPROVIDES:${PN} += "cmake-WinPR \
libwinpr2-devel \
pkgconfig-winpr-tools2 \
pkgconfig-winpr2 \
winpr2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libwinpr2-2 \
pkgconfig-libssl \
pkgconfig-winpr2"

inherit rpm
