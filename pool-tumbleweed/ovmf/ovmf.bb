SUMMARY = "Open Virtual Machine Firmware"
DESCRIPTION = "The Open Virtual Machine Firmware (OVMF) project aims to support \
firmware for Virtual Machines using the edk2 code base."
LICENSE = "BSD-2-Clause-Patent"

PV = "202608"

RPM_NAME = "ovmf-202608-2.1.aarch64.rpm"
RPM_HASH = "87613074e3e75c2cf26999d11a128d012a4141465349c9a79adcf6354bf1de01b36f5c3268e9bd8f32e58b71deb4aaae69d5563a5c94ac3a0f82b8e6651fe53e"

RPROVIDES:${PN} += "ovmf"

RDEPENDS:${PN} += ""

inherit rpm
