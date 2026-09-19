SUMMARY = "CMake modules for common build and development tasks for ROCm"
DESCRIPTION = "rocm-cmake is a collection of CMake modules for common build and development \
tasks within the ROCm project. It is therefore a build dependency for many of \
the libraries that comprise the ROCm platform. \
 \
rocm-cmake is not required for building libraries or programs that use ROCm; it \
is required for building some of the libraries that are a part of ROCm."
LICENSE = "MIT"

PV = "6.4.0"

RPM_NAME = "rocm-cmake-6.4.0-3.4.noarch.rpm"
RPM_HASH = "468412bae5ee7ec1e19c35bf07c27cf0e56cb6ec98c2442b8d7f813f98eb788bf2cca71aee8c08f5ee8d368e27cba3cc5cfc8262be1f73af17934019b31078c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rocm-cmake"

RDEPENDS:${PN} += "cmake"

inherit rpm
