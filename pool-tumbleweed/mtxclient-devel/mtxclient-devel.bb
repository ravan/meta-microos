SUMMARY = "Development files for mtxclient"
DESCRIPTION = "Client API library for Matrix, built on top of Boost.Asio"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "mtxclient-devel-0.10.1-1.7.aarch64.rpm"
RPM_HASH = "a184f02a2a69d777aec227f01666a7c6301d13f3b72dc831edab2c16f474f7b3a030bad45180374ed6ab5b721e2b0fe28d8511448df29de6a17215f685ef52f1"

RPROVIDES:${PN} += "cmake-MatrixClient \
mtxclient-devel"

RDEPENDS:${PN} += "libmatrix-client0-10-1 \
mtxclient-doc"

inherit rpm
