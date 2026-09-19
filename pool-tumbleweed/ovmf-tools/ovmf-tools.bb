SUMMARY = "The BaseTools from edk2"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base. \
 \
This package contains the tools from edk2."
LICENSE = "BSD-2-Clause-Patent"

PV = "202608"

RPM_NAME = "ovmf-tools-202608-2.1.aarch64.rpm"
RPM_HASH = "41e445102603f05609e5af726186fe5034f4d0a9aa2995c1238e271bd39fa02d46f5d92d3f89878ae5b8c1c801c60d69467ec1a1da7487b280e52b456ea1ce62"

RPROVIDES:${PN} += "ovmf-tools"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
