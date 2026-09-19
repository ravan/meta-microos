SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.12.0"

RPM_NAME = "python314-flit-3.12.0-3.5.noarch.rpm"
RPM_HASH = "d49d1c9c6fe32bd408230e1674ff8fe73590eab76c5b71b24e7bb590c0b2d96c6149e90b24180346d1ec5e9a183ac2e97fd9ac1e17a355ee3752cf7fc9c86aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flit \
python314-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-docutils \
python314-flit-core \
python314-pip \
python314-requests \
python314-tomli-w"

inherit rpm
