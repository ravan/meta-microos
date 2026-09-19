SUMMARY = "Rapid fuzzy string matching"
DESCRIPTION = "RapidFuzz is a fast string matching library for Python and C++, which is using \
the string similarity calculations from FuzzyWuzzy."
LICENSE = "MIT"

PV = "3.14.5"

RPM_NAME = "python314-rapidfuzz-3.14.5-1.4.aarch64.rpm"
RPM_HASH = "01105e347bf1122cbcb959c690cadcbf90a86f8eff07539e1e165aa00ab1f57c90bc8bff5808d809d8194040131238731f112ae880810f32891d0a8260207dc9"

RPROVIDES:${PN} += "python3.14dist-rapidfuzz \
python314-rapidfuzz \
python3dist-rapidfuzz"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
