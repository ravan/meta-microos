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

RPM_NAME = "python313-fastnumbers-5.2.0-1.2.aarch64.rpm"
RPM_HASH = "222eaa70fbe684a22e849cf241116b257c24ba9be00e542540b1d4200fd7e7954699877f5b1b2d666aab30e9ba2aa7853fbb02fd7b9529e26700dea51350eff3"

RPROVIDES:${PN} += "python3-fastnumbers \
python3.13dist-fastnumbers \
python313-fastnumbers \
python3dist-fastnumbers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
