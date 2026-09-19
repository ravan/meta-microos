SUMMARY = "Client library for interacting with Gerrit code review"
DESCRIPTION = "Client library for interacting with Gerrit code review rest api \
 \
Pygerrit2 provides a simple interface for clients to interact with \
Gerrit code review via its rest api. \
 \
See also: https://gerritcodereview.com/"
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python314-pygerrit2-2.0.15-2.5.noarch.rpm"
RPM_HASH = "11f52aa70e34a9c4e2041a188e8887f7063add29509617a02b65a34b98c92a21e2d493b6537701e3dd38f1d3545436360064a6be2dee894ff8ed898280bb3b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygerrit2 \
python314-pygerrit2 \
python3dist-pygerrit2"

RDEPENDS:${PN} += "python-abi \
python314-pbr \
python314-requests"

inherit rpm
