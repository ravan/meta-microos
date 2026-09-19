SUMMARY = "Arrays of numbers for Python, optimized for small sizes"
DESCRIPTION = "Tinyarrays are similar to NumPy arrays, but optimized for small sizes. \
Tinyarrays support mathematical operations like element-wise addition \
and matrix multiplication. Tinyarrays can be used as dictionary keys \
because they are hashable and immutable. Tinyarrays are useful if you \
need many small arrays of numbers, and cannot combine them into a few \
large ones. Common operations on very small arrays are faster than \
with NumPy, and less memory is used to store them."
LICENSE = "BSD-2-Clause"

PV = "1.2.5"

RPM_NAME = "python314-tinyarray-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "42784d4cf438ca80ec3d17c34e89baa6e7dcba244ce83b5e0f7bf68acdfd32eb2c6efc6f49a8184acfb25bebf2701ce0576699c71940720b6cc4ba607fb38643"

RPROVIDES:${PN} += "python3.14dist-tinyarray \
python314-tinyarray \
python3dist-tinyarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
