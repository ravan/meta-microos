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

RPM_NAME = "python314-awkward-cpp-53-1.3.aarch64.rpm"
RPM_HASH = "2776b7dc780cb7ece87d6e5108e6ee0b504577d4832ec4802e7e1716b593bf52252844026c48c6aa91e3855101981019502c251ae4d8fa0f9a878de7724e9249"

RPROVIDES:${PN} += "libawkward-cpu-kernels.so \
libawkward.so \
python3.14dist-awkward-cpp \
python314-awkward-cpp \
python3dist-awkward-cpp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
