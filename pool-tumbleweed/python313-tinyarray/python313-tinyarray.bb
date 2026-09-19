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

RPM_NAME = "python313-tinyarray-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "11129969d971ce9622b1859b2592ee4ffc74030e42e8923073287151a2bb3593c5f382baab0ddb644b90b24c0cdb14553c977d283be098ccbfa5752258bf0b06"

RPROVIDES:${PN} += "python3-tinyarray \
python3.13dist-tinyarray \
python313-tinyarray \
python3dist-tinyarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
