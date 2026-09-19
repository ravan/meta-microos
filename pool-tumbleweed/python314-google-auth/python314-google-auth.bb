SUMMARY = "Google Authentication Library"
DESCRIPTION = "This library simplifies using Google’s various server-to-server authentication mechanisms to access Google APIs."
LICENSE = "Apache-2.0"

PV = "2.57.0"

RPM_NAME = "python314-google-auth-2.57.0-1.1.noarch.rpm"
RPM_HASH = "722213d3d2314f66df9145ad62f88be3fd3b7a2aa2042afbb8dc99b6d631dc80f59c1470f48c4ca9aa310a812afff5809ca8088dd8d1e71df91f3953a17abe60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-auth \
python314-google-auth \
python3dist-google-auth"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-grpcio \
python314-pyasn1-modules \
python314-urllib3"

inherit rpm
