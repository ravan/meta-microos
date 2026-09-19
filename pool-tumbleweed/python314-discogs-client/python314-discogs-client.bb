SUMMARY = "Python API client for Discogs"
DESCRIPTION = "This is the official Discogs API client for Python. It enables you to query the \
Discogs database for information on artists, releases, labels, users, \
Marketplace listings, and more. It also supports OAuth 1.0a authorization, \
which allows you to change user data such as profile information, collections \
and wantlists, inventory, and orders."
LICENSE = "BSD-2-Clause"

PV = "2.9"

RPM_NAME = "python314-discogs-client-2.9-1.1.noarch.rpm"
RPM_HASH = "82b90775dcf3d18f3638aa7553c962a052ee34ac6647285519db165569a9e3e60e94d064d4884566bad26b3b310ca44d80f08950115bf88869bbe9b5344637e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python3-discogs-client \
python314-discogs-client \
python3dist-python3-discogs-client"

RDEPENDS:${PN} += "python-abi \
python314-oauthlib \
python314-python-dateutil \
python314-requests"

inherit rpm
