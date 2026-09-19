SUMMARY = "A library for efficient similarity search and clustering of dense vectors"
DESCRIPTION = "Faiss is a library for efficient similarity search and clustering of dense \
vectors. It contains algorithms that search in sets of vectors of any size, \
 up to ones that possibly do not fit in RAM. It also contains supporting \
code for evaluation and parameter tuning. Faiss is written in C++ with \
complete wrappers for Python/numpy. Some of the most useful algorithms \
are implemented on the GPU. It is developed by Facebook AI Research."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python314-faiss-1.10.0-2.7.aarch64.rpm"
RPM_HASH = "a5f2082837492ef9019d9aa9fbfa603c4f4b297c2bf917f9a9726a17885855d4e06262089b50e99d5632f067855aa086c6b93965ef53b4f1c40b12abd2262dd1"

RPROVIDES:${PN} += "libfaiss-python-callbacks.so \
python3.14dist-faiss \
python314-faiss \
python3dist-faiss"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfaiss.so \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6 \
python-abi \
python314-numpy \
python314-packaging"

inherit rpm
