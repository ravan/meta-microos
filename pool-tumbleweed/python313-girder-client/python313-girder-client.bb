SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "5.0.16"

RPM_NAME = "python313-girder-client-5.0.16-1.1.noarch.rpm"
RPM_HASH = "bdd7fbbaa39599eae18a5da706643194f7d5903557c0cd2543e697349397dc34342808c447bed7d172b5743785425e53a447ff47f0dc3fdcb8a51e78236c8bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-girder-client \
python3.13dist-girder-client \
python313-girder-client \
python3dist-girder-client"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-diskcache \
python313-requests \
python313-requests-toolbelt \
update-alternatives"

inherit rpm
