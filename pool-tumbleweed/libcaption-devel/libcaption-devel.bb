SUMMARY = "CEA608 / CEA708 closed-caption encoder/decoder"
DESCRIPTION = "libcaption is a library written in C to aid in the creating and parsing of \
closed caption data, open sourced under the MIT license to use within community \
developed broadcast tools. \
 \
This package contains the files requires for building with libcaption."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "libcaption-devel-0.8-1.6.aarch64.rpm"
RPM_HASH = "d8c7e18f6754d4680c3fcfc7cf18f1ea255b1bf2863ce6b56c680f7b9f3474804b4888026f10e8b0ca06b1e02b10b5edce50f953b1d86492028fb8e911bcebbd"

RPROVIDES:${PN} += "libcaption-devel"

RDEPENDS:${PN} += "libcaption"

inherit rpm
