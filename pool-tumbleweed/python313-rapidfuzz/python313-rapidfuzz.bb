SUMMARY = "Rapid fuzzy string matching"
DESCRIPTION = "RapidFuzz is a fast string matching library for Python and C++, which is using \
the string similarity calculations from FuzzyWuzzy."
LICENSE = "MIT"

PV = "3.14.5"

RPM_NAME = "python313-rapidfuzz-3.14.5-1.4.aarch64.rpm"
RPM_HASH = "1bbe170248313a71d3e887387575cfe63ffe61527dbc2c64f54582a7846fff96bc2182fe394bce2645ea5a96f596af744d579856b9ae082da48ca1ec35a74674"

RPROVIDES:${PN} += "python3-rapidfuzz \
python3.13dist-rapidfuzz \
python313-rapidfuzz \
python3dist-rapidfuzz"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
