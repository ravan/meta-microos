SUMMARY = "Python API client for Discogs"
DESCRIPTION = "This is the official Discogs API client for Python. It enables you to query the \
Discogs database for information on artists, releases, labels, users, \
Marketplace listings, and more. It also supports OAuth 1.0a authorization, \
which allows you to change user data such as profile information, collections \
and wantlists, inventory, and orders."
LICENSE = "BSD-2-Clause"

PV = "2.9"

RPM_NAME = "python313-discogs-client-2.9-1.1.noarch.rpm"
RPM_HASH = "f835d0ced208df51080b7624d07d864c5242acd2fa78e2b4c610677907d434272045f9b89b2e9cf55a800c19f45d9ca7abca0e5a9e58cb3dff9fc47d95bb33a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-discogs-client \
python3.13dist-python3-discogs-client \
python313-discogs-client \
python3dist-python3-discogs-client"

RDEPENDS:${PN} += "python-abi \
python313-oauthlib \
python313-python-dateutil \
python313-requests"

inherit rpm
