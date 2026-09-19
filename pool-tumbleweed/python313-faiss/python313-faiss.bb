SUMMARY = "A library for efficient similarity search and clustering of dense vectors"
DESCRIPTION = "Faiss is a library for efficient similarity search and clustering of dense \
vectors. It contains algorithms that search in sets of vectors of any size, \
 up to ones that possibly do not fit in RAM. It also contains supporting \
code for evaluation and parameter tuning. Faiss is written in C++ with \
complete wrappers for Python/numpy. Some of the most useful algorithms \
are implemented on the GPU. It is developed by Facebook AI Research."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python313-faiss-1.10.0-2.7.aarch64.rpm"
RPM_HASH = "4d8d7b7b11626cbe03eeb2e041ee8e97f52f77b24207edf632c4f195555955e0f5c86a44baae3cd29a5a3d7b05a4ba1640c55c59a681123b3140e7eaffb6e95c"

RPROVIDES:${PN} += "libfaiss-python-callbacks.so \
python3-faiss \
python3.13dist-faiss \
python313-faiss \
python3dist-faiss"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfaiss.so \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6 \
python-abi \
python313-numpy \
python313-packaging"

inherit rpm
