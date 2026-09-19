SUMMARY = "A python module that provides a simple interface to FUSE"
DESCRIPTION = "fusepy is a Python module that provides a simple interface to FUSE. It makes \
the implementation of userspace file systems based on FUSE and python \
possible."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "python314-fusepy-3.0.1-3.5.noarch.rpm"
RPM_HASH = "0d9deeceae365fcf6f113dfb452fb2a71257c87cabdf2eee70a61be84ac29bf97e0a95e5f61caa517c412fd6aa29d4b822cd432b08f8ce7359e41771d63e5f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fusepy \
python314-fusepy \
python3dist-fusepy"

RDEPENDS:${PN} += "libfuse2 \
python-abi"

inherit rpm
