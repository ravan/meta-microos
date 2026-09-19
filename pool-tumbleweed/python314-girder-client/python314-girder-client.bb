SUMMARY = "Python Girder client"
DESCRIPTION = "Girder is a web-based data management platform. \
 \
This package provides the client for interacting \
with Girder servers"
LICENSE = "Apache-2.0"

PV = "5.0.16"

RPM_NAME = "python314-girder-client-5.0.16-1.1.noarch.rpm"
RPM_HASH = "31ffbf777090da9c9a69ab6f0712f8f0f2e56c5e3e91358847756cf0e78805651a67f31bafe6c9836db71f885c65163ff0840f453e278e0f12c2c5bdcd165e14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-girder-client \
python314-girder-client \
python3dist-girder-client"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-diskcache \
python314-requests \
python314-requests-toolbelt \
update-alternatives"

inherit rpm
