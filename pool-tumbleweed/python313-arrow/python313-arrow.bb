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

RPM_NAME = "python313-arrow-1.4.0-1.4.noarch.rpm"
RPM_HASH = "941072032f63b0e72b2f83ce15893afea7b8ee6566875bb9d6bdfd670ee642172228819ea3852bda16abaf3574aeee00e5697431f651f4831f8aae381ad853bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arrow \
python3.13dist-arrow \
python313-arrow \
python3dist-arrow"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil"

inherit rpm
