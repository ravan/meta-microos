SUMMARY = "The Boost::Histogram Python wrapper"
DESCRIPTION = "Python bindings for Boost::Histogram (source), a C++14 library. This is one of \
the fastest libraries for histogramming, while still providing the power of a \
full histogram object."
LICENSE = "BSD-3-Clause"

PV = "1.7.2"

RPM_NAME = "python314-boost-histogram-1.7.2-1.3.aarch64.rpm"
RPM_HASH = "20079b855b8da1e1c32c41d9df561725556749e2709651dfde39916e0c89ade0904e8261818fc993dce26ca1204703b0c788b04aa26d6467b291b35abc624004"

RPROVIDES:${PN} += "python3.14dist-boost-histogram \
python314-boost-histogram \
python3dist-boost-histogram"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
