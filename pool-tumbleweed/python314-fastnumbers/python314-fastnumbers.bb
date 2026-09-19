SUMMARY = "Drop-in replacement for Python's int and float"
DESCRIPTION = "fastnumbers is a Python module with three objectives: \
 \
1. To provide drop-in replacements for the Python built-in `int` and \
   `float` that, on average, are around 2x faster. These functions \
   should behave identically to the Python built-ins except for a few \
   specific corner-cases as mentioned in the API documentation. \
2. To provide a set of convenience functions that wrap the above int \
   and float replacements and provide error handling. \
3. To provide a set of functions that can be used to identify whether \
   an input could be converted to int or float."
LICENSE = "MIT"

PV = "5.2.0"

RPM_NAME = "python314-fastnumbers-5.2.0-1.2.aarch64.rpm"
RPM_HASH = "d4ffe4831b003a205548fe169b1334bdfb2ae9f3def9b2f0654e87acf31f4f15678cae25974956a52ac9caabdf9010fcac1988d4aecb3dc7fdacab550c020c22"

RPROVIDES:${PN} += "python3.14dist-fastnumbers \
python314-fastnumbers \
python3dist-fastnumbers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
