SUMMARY = "Development files for aws-c-sdkutils library"
DESCRIPTION = "AWS C SDK Utils \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.2.10"

RPM_NAME = "aws-c-sdkutils-devel-0.2.10-1.1.aarch64.rpm"
RPM_HASH = "4aa0fa475e41ab426cea4cd63f7390fd4536d9cad5c3f9479cf017a30e05fa611c7d95ec8e658546dcb98796f660d54a786c0f9acaf04d4e276afd34595a68c3"

RPROVIDES:${PN} += "aws-c-sdkutils-devel \
cmake-aws-c-sdkutils"

RDEPENDS:${PN} += "libaws-c-sdkutils1-0-0"

inherit rpm
