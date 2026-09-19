SUMMARY = "Upstream kernel binary for AWS Nitro Enclaves"
DESCRIPTION = "This package contains a kernel binary and a helper binary, which is \
used by the nitro-cli build-enclave command to generate a Enclave \
Image File."
LICENSE = "Apache-2.0"

PV = "1.5.0~git0.2950b36"

RPM_NAME = "aws-nitro-enclaves-binaryblobs-upstream-1.5.0~git0.2950b36-1.1.aarch64.rpm"
RPM_HASH = "b4725ffd20c55589adac4a719628b3506f0db6c6c4e21e4fa3656c9424921e448664ba165f230009d76fcdf534f61d0ebcc2d68de08d9779676d5940ab997913"

RPROVIDES:${PN} += "aws-nitro-enclaves-binaryblobs \
aws-nitro-enclaves-binaryblobs-upstream"

RDEPENDS:${PN} += ""

inherit rpm
