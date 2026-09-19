SUMMARY = "CPU kernels and compiled extensions for Awkward Array"
DESCRIPTION = "Awkward Array is a library for nested, variable-sized data, including \
arbitrary-length lists, records, mixed types, and missing data, using \
NumPy-like idioms. \
 \
Arrays are dynamically typed, but operations on them are compiled and fast. \
Their behavior coincides with NumPy when array dimensions are regular and \
generalizes when they're not. \
 \
awkward-cpp provides precompiled routines for the awkward package. \
It is not useful on its own, only as a dependency for awkward."
LICENSE = "BSD-3-Clause"

PV = "53"

RPM_NAME = "python313-awkward-cpp-53-1.3.aarch64.rpm"
RPM_HASH = "1540576c64111b643462b7ec3175fa327de9839997969b6ae8c0c2b30cc086228659576c87ca6ef34f2f00d02b933d76df063b04b59e753b831aba9ebbd86cb4"

RPROVIDES:${PN} += "libawkward-cpu-kernels.so \
libawkward.so \
python3-awkward-cpp \
python3.13dist-awkward-cpp \
python313-awkward-cpp \
python3dist-awkward-cpp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
