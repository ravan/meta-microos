SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.7.2"

RPM_NAME = "python313-boost-histogram-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "9a09711fa0dd05722e7adca8b13572e3f747e97cb4d013347d32e76353ffa2ebdd374fdc8361437fd82609d4d1fd32e124c7f7283e146628e01e26ffd6ce609b"

RPROVIDES:${PN} += "python3-boost-histogram \
python3.13dist-boost-histogram \
python313-boost-histogram \
python3dist-boost-histogram"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
