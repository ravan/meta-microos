SUMMARY = "Python libray for storing and using objects for testing"
DESCRIPTION = "Library for testing python code what allows store output of \
various objects and use stored data for testing."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python314-requre-0.9.1-2.6.noarch.rpm"
RPM_HASH = "ae6f25cd1c76a23580ec5f963f99b78b6c53f0414a074645c16729701fa458d8a773e99f45058beca8b6ec8ab0a092a72987ecb6f8778046f926815ec748d686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requre \
python314-requre \
python3dist-requre"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-GitPython \
python314-PyYAML \
python314-click \
python314-httpx \
python314-pytest \
python314-requests \
update-alternatives"

inherit rpm
