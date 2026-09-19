SUMMARY = "Source code of gRPC"
DESCRIPTION = "This subpackage contains source code of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.76.0"

RPM_NAME = "grpc-source-1.76.0-3.12.noarch.rpm"
RPM_HASH = "66b74bffefdf9bda4ce5f654ee84052e5073b313264b987d2b4642a4e9750e6fa7fa56a555e1320b4ee06f7745240114eeeea5b489b494e36b4c5c8ebc2f739c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grpc-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/ruby \
/usr/bin/sh"

inherit rpm
