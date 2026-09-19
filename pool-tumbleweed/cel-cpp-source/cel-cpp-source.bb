SUMMARY = "Source code of cel-cpp"
DESCRIPTION = "This is a C++ implementation of a Common Expression Language runtime. \
 \
This package contains source code for cel-cpp."
LICENSE = "Apache-2.0"

PV = "20191127"

RPM_NAME = "cel-cpp-source-20191127-1.17.noarch.rpm"
RPM_HASH = "e20cc423155a2fe5405c46d01c44d4052877c0cb24f166ac56ce8d3dfb12be3375a8fde1bf5a813250b7cc5e4f02dc3c61b0d42a08c7e65008e50e348e784b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cel-cpp-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
