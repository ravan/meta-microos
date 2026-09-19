SUMMARY = "OpenCL C programming language library"
DESCRIPTION = "Library requirements of the OpenCL C programming language."
LICENSE = "Apache-2.0-with-LLVM-exception & (BSD-3-Clause | MIT)"

PV = "0.2.0+llvm22.1.0"

RPM_NAME = "libclc-0.2.0+llvm22.1.0-3.2.noarch.rpm"
RPM_HASH = "2d33d41068518581596121c721479433cbcaca7783596cfd4a8210355ed45aab6731fe0c4825d3a6c7f25b7e6c908a8c8b09b5d08d6aba0868f0e69cc03cbca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libclc \
libclc-llvm23 \
pkgconfig-libclc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
