SUMMARY = "OpenCL C++ headers"
DESCRIPTION = "OpenCL is a royalty-free standard for cross-platform, parallel programming \
of modern processors found in personal computers, servers and \
handheld/embedded devices. \
 \
This package provides the official C++ headers for OpenCL, which are wrappers \
around the C headers."
LICENSE = "Apache-2.0"

PV = "2026.05.29"

RPM_NAME = "opencl-cpp-headers-2026.05.29-1.1.noarch.rpm"
RPM_HASH = "a1b528aeb67e604d8ab34df8893ecd0fb7811c30751a9c1eb3d065a31f8cb132c9dc04166c7846b46e137728adbabe4afcc2dfea9699b66872cf78ccd69a38f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-OpenCLHeadersCpp \
opencl-cpp-headers \
pkgconfig-OpenCL-CLHPP"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
opencl-headers \
pkgconfig-OpenCL-Headers"

inherit rpm
