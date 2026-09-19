SUMMARY = "CFD General Notation System"
DESCRIPTION = "The CFD General Notation System (CGNS) provides a general, portable, \
and extensible standard for the storage and retrieval of computational \
fluid dynamics (CFD) analysis data."
LICENSE = "Zlib"

PV = "4.4.0"

RPM_NAME = "cgns-4.4.0-2.13.aarch64.rpm"
RPM_HASH = "08a4b89180136595a93a8bf3efbbec34b4961bc7b9138852b88a7d686be6e2cd5fc43c9d3425ec93704cdcdcea63e903cbc78c96f0328ee585c8eb8ff158ae34"

RPROVIDES:${PN} += "cgns"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgns.so.4.4"

inherit rpm
