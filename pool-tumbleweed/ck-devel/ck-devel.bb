SUMMARY = "Development files for Concurrency Kit"
DESCRIPTION = "Concurrency primitives, safe memory reclamation mechanisms and non-blocking \
data structures for the research, design and implementation of high performance \
concurrent systems. \
 \
This package holds the development files."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "0.7.2"

RPM_NAME = "ck-devel-0.7.2-1.1.aarch64.rpm"
RPM_HASH = "9a8160b047be42e91c1a7153cb86701f0528219d42f6dc97409a0bce8b3b7b90c7d1d029edc4d968d3fff7695f9ce74897253d494c884b1881b61c684f6d5a65"

RPROVIDES:${PN} += "ck-devel \
pkgconfig-ck"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libck0"

inherit rpm
