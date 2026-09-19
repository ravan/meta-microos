SUMMARY = "Multicore version of t-SNE algorithm"
DESCRIPTION = "This is a multicore modification of Barnes-Hut t-distributed \
Stochastic Neighbor Embedding (t-SNE). It is implemented using Python \
and Torch CFFI-based wrappers."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "python313-MulticoreTSNE-0.1-7.7.aarch64.rpm"
RPM_HASH = "d408408f296058fda30b56b6dbfa90199483211043851129214874c259aec372a4fcc0a1b4d40c8133d50eb813f2d3bf101c296024b8a08d9c642525fa4ee8af"

RPROVIDES:${PN} += "libtsne-multicore.so \
python3-MulticoreTSNE \
python3.13dist-multicoretsne \
python313-MulticoreTSNE \
python3dist-multicoretsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-cffi \
python313-numpy"

inherit rpm
