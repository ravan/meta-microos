SUMMARY = "Development files for OpenSubdiv"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for OpenSubdiv. If you would like to develop programs using OpenSubdiv, \
you will need to install OpenSubdiv-devel."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "OpenSubdiv-devel-3.6.1-1.6.aarch64.rpm"
RPM_HASH = "174b2644ccce9336d76bedaab521c34d3a7479c17104518b882efdb0a38e4dc3e9aa4f07184e16e623221f76748160b354b21dc59f7c4566d4d6b8199ab40ed8"

RPROVIDES:${PN} += "OpenSubdiv-devel \
cmake-OpenSubdiv"

RDEPENDS:${PN} += "libosdCPU3-6-1"

inherit rpm
