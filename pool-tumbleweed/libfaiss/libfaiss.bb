SUMMARY = "faiss library"
DESCRIPTION = "Faiss is a library for efficient similarity search and clustering of dense \
vectors. It contains algorithms that search in sets of vectors of any size, \
 up to ones that possibly do not fit in RAM. It also contains supporting \
code for evaluation and parameter tuning. Faiss is written in C++ with \
complete wrappers for Python/numpy. Some of the most useful algorithms \
are implemented on the GPU. It is developed by Facebook AI Research."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "libfaiss-1.10.0-2.7.aarch64.rpm"
RPM_HASH = "8ff39327d180a260ab0c29c26831efe30520bfad52dcafdd45ce6caf830f16fede14c0c6253b3100429deaba59a6b53dbf461e9e7196b6dac74885f59e6c379c"

RPROVIDES:${PN} += "libfaiss \
libfaiss-c.so \
libfaiss.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6"

inherit rpm
