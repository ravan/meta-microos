SUMMARY = "Better dates and times for Python"
DESCRIPTION = "Arrow is a Python library that offers a sensible, human-friendly \
approach to creating, manipulating, formatting and converting dates, \
times, and timestamps.  It implements and updates the datetime type, \
plugging gaps in functionality, and provides an intelligent module \
API that supports many common creation scenarios.  Simply put, it \
helps you work with dates and times with fewer imports and a lot \
less code. \
 \
Arrow is heavily inspired by moment.js and requests."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python314-arrow-1.4.0-1.4.noarch.rpm"
RPM_HASH = "33d891e91f991f08943b3ea539e1f4f13082e9b0cb2beb1d39baeed67eb87fb0275dbf1f207a8f8b4437cee469222cb29de9ac708ad85b2c366950f63f7c04a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-arrow \
python314-arrow \
python3dist-arrow"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil"

inherit rpm
