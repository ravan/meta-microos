SUMMARY = "An ISO 8601 Date/Time/Duration Parser and Formatter"
DESCRIPTION = "This module implements ISO 8601 date, time and duration parsing. \
The implementation follows ISO8601:2004 standard, and implements only \
date/time representations mentioned in the standard. If something is not \
mentioned there, then it is treated as non existent, and not as an allowed \
option."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python314-isodate-0.7.2-1.10.noarch.rpm"
RPM_HASH = "8078a44b5da1f2dc107fb2b60514c9d561ecf628d4d406b3d40f5c521828703f25117723a6ca7a17dabc9496e78437534a9725cf13a387934072dddb21a16498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-isodate \
python314-isodate \
python3dist-isodate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
