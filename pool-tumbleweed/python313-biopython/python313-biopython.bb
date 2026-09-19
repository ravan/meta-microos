SUMMARY = "Python Tools for Computational Molecular Biology"
DESCRIPTION = "The Biopython Project is an international association of developers of freely \
available Python tools for computational molecular biology."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.88"

RPM_NAME = "python313-biopython-1.88-1.1.aarch64.rpm"
RPM_HASH = "d605696587b1ccc3bcd81a119ea10d815e0791775c3dbcbb65bcbab211d5426ab6b2a05d35ece6c42a2ce06f8979daadab49c2a25168ba24af9b7a2bcb0c222a"

RPROVIDES:${PN} += "python3-biopython \
python3.13dist-biopython \
python313-biopython \
python3dist-biopython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-numpy \
python313-xml"

inherit rpm
