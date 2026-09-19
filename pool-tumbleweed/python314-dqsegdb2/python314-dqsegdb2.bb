SUMMARY = "Simplified python interface to the DQSEGDB API"
DESCRIPTION = "DQSEGDB2 is a simplified Python implementation of the DQSEGDB API \
as defined in LIGO-T1300625, providing a query interface for GET \
requests to DQSEGDB."
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "python314-dqsegdb2-1.2.1-2.6.noarch.rpm"
RPM_HASH = "4b6a0644a8df0b370787ec0066ae725908cd49f01a7954ed095ab8d43a2f5b4f2044976514da98a9e7481ac316974d7feae308474e127160a2733e3a5d060b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dqsegdb2 \
python314-dqsegdb2 \
python3dist-dqsegdb2"

RDEPENDS:${PN} += "python-abi \
python314-igwn-auth-utils \
python314-ligo-segments"

inherit rpm
