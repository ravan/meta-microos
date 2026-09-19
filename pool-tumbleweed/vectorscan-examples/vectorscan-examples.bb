SUMMARY = "Example binaries for the vectorscan library"
DESCRIPTION = "Example binaries for the vectorscan library: \
  hsbench, hscheck, patbench, pcapscan, simplegrep, unit-hyperscan"
LICENSE = "BSD-3-Clause"

PV = "5.4.12"

RPM_NAME = "vectorscan-examples-5.4.12-1.4.aarch64.rpm"
RPM_HASH = "ff4934cea9bf34704fbc8851a1749f33f4ececf190bc0bb0dfa364cf4b124a1ac70d05eed7ecf15d0714d77cc9e826f800bd63138c64c434b72395079335d4f0"

RPROVIDES:${PN} += "vectorscan-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhs.so.5 \
libpcap.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
