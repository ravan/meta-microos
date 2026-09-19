SUMMARY = "Client libraries in C and Python3 for talking to a running gpsd or GPS"
DESCRIPTION = "This package provides python3 modules and tools for the gpsd shared libraries. \
You will need to have gpsd installed for it to work."
LICENSE = "BSD-3-Clause"

PV = "3.27.5"

RPM_NAME = "python3-gpsd-3.27.5-3.2.aarch64.rpm"
RPM_HASH = "82708f122498171c8f55a8dd98bdbf1985d88a872cb15c40766705e2e18e2b6ef950f2f457054256314e99a6d7cf2bccde380dc951ed5f64953c06bf1d3b86ce"

RPROVIDES:${PN} += "python3-gpsd \
python3.13dist-gps \
python3dist-gps"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gpsd \
python-abi"

inherit rpm
