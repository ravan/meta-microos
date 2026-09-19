SUMMARY = "Track earth satellite TLE orbits using up-to-date 2010 version of SGP4"
DESCRIPTION = "This Python package computes the position and velocity of an earth-orbiting \
satellite, given the satellite’s TLE orbital elements from a source like \
Celestrak. It implements the most recent version of SGP4, and is regularly run \
against the SGP4 test suite to make sure that its satellite position predictions \
agree to within 0.1 mm with the predictions of the standard distribution of the \
algorithm. This error is far less than the 1–3 km/day by which satellites \
themselves deviate from the ideal orbits described in TLE files. \
 \
This package compiles the verbatim source code from the official C++ version \
of SGP4. You can call the routine directly, or through an array API that loops \
over arrays of satellites and arrays of times with machine code instead of Python."
LICENSE = "MIT"

PV = "2.25"

RPM_NAME = "python313-sgp4-2.25-1.5.aarch64.rpm"
RPM_HASH = "f915f90cdf6ffe0af11460fd581eadc2f95cc28ce60719afdaf449e41aa0b70b4a33e55817c47572285bc178939c6d49dfd204f0ed6d692e0fea64ad89eb90e4"

RPROVIDES:${PN} += "python3-sgp4 \
python3.13dist-sgp4 \
python313-sgp4 \
python3dist-sgp4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
