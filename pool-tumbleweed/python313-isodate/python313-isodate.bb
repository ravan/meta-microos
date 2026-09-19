SUMMARY = "An ISO 8601 Date/Time/Duration Parser and Formatter"
DESCRIPTION = "This module implements ISO 8601 date, time and duration parsing. \
The implementation follows ISO8601:2004 standard, and implements only \
date/time representations mentioned in the standard. If something is not \
mentioned there, then it is treated as non existent, and not as an allowed \
option."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python313-isodate-0.7.2-1.10.noarch.rpm"
RPM_HASH = "5a2e1169703b1cd5bfb03a34a5cde7794fb359d8f106e7f31d2ac378e39296f278f35586095d686d9357fa074a50b53e8e2830564f519dac481924d58ff8da4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isodate \
python3.13dist-isodate \
python313-isodate \
python3dist-isodate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
