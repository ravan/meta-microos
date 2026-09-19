SUMMARY = "None"
DESCRIPTION = "None"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-textual-speedups-0.2.1-3.4.aarch64.rpm"
RPM_HASH = "6921253ca5ea18d0ee947786a124d5c1fa8d6e609ff6436cba67c8ef5e7f8abff663bd694505ead785424735897a1e02b3faae64bd7e7ca490419d31b414df7b"

RPROVIDES:${PN} += "python3.14dist-textual-speedups \
python314-textual-speedups \
python3dist-textual-speedups"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
