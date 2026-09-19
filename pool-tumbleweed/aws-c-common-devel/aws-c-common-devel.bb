SUMMARY = "Development files for aws-c-common library"
DESCRIPTION = "Core C99 package for AWS SDK for C. It includes cross-platform primitives, \
configuration, data structures, and error handling. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.14.5"

RPM_NAME = "aws-c-common-devel-0.14.5-1.1.aarch64.rpm"
RPM_HASH = "eba8dbeb0e6afa91aec39c94d65f5b9f65730354919a9dcb3217fbe91c841a64e046a47b0840238e1626101a3d3dd1fd225e2023a1ede129f0f1cc58cdf4ad33"

RPROVIDES:${PN} += "aws-c-common-devel \
cmake-aws-c-common"

RDEPENDS:${PN} += "libaws-c-common1"

inherit rpm
