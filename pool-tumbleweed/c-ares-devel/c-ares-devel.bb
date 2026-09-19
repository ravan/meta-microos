SUMMARY = "Development files for c-ares"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides the development libraries and headers needed \
to build packages that depend on c-ares."
LICENSE = "MIT"

PV = "1.34.8"

RPM_NAME = "c-ares-devel-1.34.8-1.1.aarch64.rpm"
RPM_HASH = "5ad9adac3bfa95349c4af47fa02fc49c197502ca7206205a36c16a910cdd770265068b8cc3b251e950aee649d74658277ea693498e2f2a64dd061ccf968a91dd"

RPROVIDES:${PN} += "c-ares-devel \
cmake-c-ares \
libcares-devel \
pkgconfig-libcares"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcares2"

inherit rpm
