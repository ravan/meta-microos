SUMMARY = "Multicore version of t-SNE algorithm"
DESCRIPTION = "This is a multicore modification of Barnes-Hut t-distributed \
Stochastic Neighbor Embedding (t-SNE). It is implemented using Python \
and Torch CFFI-based wrappers."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "python314-MulticoreTSNE-0.1-7.7.aarch64.rpm"
RPM_HASH = "fc9d38677190db9a60c9c7f9dea8486ca5ac6f063095cad2825a4d9dfc7bdf41bcb2dead9482a13c3c2dcfc370c7a11b7f659e0358a0f7b2cfa7327551ab31b0"

RPROVIDES:${PN} += "libtsne-multicore.so \
python3.14dist-multicoretsne \
python314-MulticoreTSNE \
python3dist-multicoretsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-cffi \
python314-numpy"

inherit rpm
