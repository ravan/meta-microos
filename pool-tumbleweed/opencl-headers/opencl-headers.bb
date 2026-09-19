SUMMARY = "OpenCL (Open Computing Language) headers"
DESCRIPTION = "OpenCL is a royalty-free standard for cross-platform, parallel programming \
of modern processors found in personal computers, servers and \
handheld/embedded devices. \
 \
This package provides the official Khronos Group OpenCL headers needed to \
compile programs that use OpenCL."
LICENSE = "MIT"

PV = "2026.05.29"

RPM_NAME = "opencl-headers-2026.05.29-1.3.noarch.rpm"
RPM_HASH = "40fc29284257a833fbcd06d52b6a00cb448e78422db7e6c81f9a8ffbc16a6157cdba396b9cb8db7f52abf1870bd9ec108fce45e9164be55522858c68c4db3849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-OpenCLHeaders \
opencl-headers \
pkgconfig-OpenCL-Headers"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
