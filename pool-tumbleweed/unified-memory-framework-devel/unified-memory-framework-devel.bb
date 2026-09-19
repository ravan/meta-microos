SUMMARY = "Development files for unified-memory-framework"
DESCRIPTION = "The Unified Memory Framework (UMF) is a library for constructing allocators \
and memory pools. \
 \
This package contains the development files for UMF."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "unified-memory-framework-devel-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "4be582b9326e5b858bacd3efe6d2d517471565d79044b6a3772701ae99054a02dbff8df7c4ab702ae3192d68853697257da3c2de65d0c87c4dbd6e258e578eca"

RPROVIDES:${PN} += "cmake-umf \
unified-memory-framework-devel"

RDEPENDS:${PN} += "level-zero-devel \
libumf0"

inherit rpm
