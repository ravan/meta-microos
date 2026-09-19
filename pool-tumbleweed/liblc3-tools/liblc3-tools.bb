SUMMARY = "Low Complexity Communication Codec (LC3) - Tools"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides tools for liblc3."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "liblc3-tools-1.1.3-1.7.aarch64.rpm"
RPM_HASH = "b4010e135bf13c385307af87812db230886bdf1d72df242851599b054a55b7abad09b758b82ae2a4e039309e994b6d0844e630f0ef356bb28d75ef55364406fc"

RPROVIDES:${PN} += "liblc3-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblc3.so.1"

inherit rpm
