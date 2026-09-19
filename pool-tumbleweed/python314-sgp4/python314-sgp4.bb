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

RPM_NAME = "python314-sgp4-2.25-1.5.aarch64.rpm"
RPM_HASH = "dc049cf059b1c5714ab06e9227c3adf6381eec14ffa91327ca4946f64f2c499ffc5d420adf0335b2736b2ff05c738e754ce20d074409edb7b65eb71b747ee10d"

RPROVIDES:${PN} += "python3.14dist-sgp4 \
python314-sgp4 \
python3dist-sgp4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
