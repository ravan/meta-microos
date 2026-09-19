SUMMARY = "Extensible, parallel implementations of t-SNE"
DESCRIPTION = "Extensible, parallel implementations of t-SNE"
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python314-openTSNE-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "a2b1f1547041523f1352926a5d1bbf4163d7d39d7dae401dabc241482d9c31b77efc27da8a2f862265b18f0251788f893d126f97bf7fb28c97cecc895813c0b0"

RPROVIDES:${PN} += "python3.14dist-opentsne \
python314-fastTSNE \
python314-openTSNE \
python3dist-opentsne"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy \
python314-scikit-learn \
python314-scipy"

inherit rpm
