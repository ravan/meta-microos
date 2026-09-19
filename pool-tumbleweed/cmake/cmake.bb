SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "4.4.3"

RPM_NAME = "cmake-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "593e0ad6bf13c1bdebd912f0a5c72a11113347aa48bf5992c7c7330c65bd6ad76b012b4c9d986005f6dc6bbb00a78c07357230fa6abbf81c461fb5e8d597d119"

RPROVIDES:${PN} += "cmake"

RDEPENDS:${PN} += "cmake-implementation \
libuv1"

inherit rpm
