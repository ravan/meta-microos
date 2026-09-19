SUMMARY = "Library for querying the Duck Duck Go API"
DESCRIPTION = "A Python3 library for querying the Duck Duck Go API."
LICENSE = "BSD-3-Clause"

PV = "0.6.8"

RPM_NAME = "python314-ddg3-0.6.8-1.2.noarch.rpm"
RPM_HASH = "5dff6faeff8de23898c6aea86bec8fa11865dd36455c2d82422c4911cfe66cb2eff895e77b82e4c7547b326bdcaf76741f4cc7266954a334ca16a597c515c66b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ddg3 \
python314-ddg3 \
python3dist-ddg3"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-requests \
update-alternatives"

inherit rpm
