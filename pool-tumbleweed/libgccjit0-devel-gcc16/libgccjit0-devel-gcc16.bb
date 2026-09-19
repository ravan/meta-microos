SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "libgccjit0-devel-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "0ad9d066b36a4cb0e49f0d0982ea901612a5b1513857ba6ae42e6572095a6a59e5ae31b17629761af9da85c00d750dcb6cf4e06cf0176f8dbdd395737b82f719"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc16"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
