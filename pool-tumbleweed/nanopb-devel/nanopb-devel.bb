SUMMARY = "Development files for nanopb"
DESCRIPTION = "Development files for nanopb - a C implementation of Google's Protocol Buffers \
data format."
LICENSE = "Zlib"

PV = "0.4.9.2"

RPM_NAME = "nanopb-devel-0.4.9.2-1.1.aarch64.rpm"
RPM_HASH = "107ada0e26152acde786e5eaeba79f5ea92dec7a43989b6b448feca2ccff8626d5630634cc73a7686fe14eb3e0418d6b0bcb08103341c353a6ae4b443e8655ca"

RPROVIDES:${PN} += "cmake-nanopb \
nanopb-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
libprotobuf-nanopb0 \
python-abi"

inherit rpm
