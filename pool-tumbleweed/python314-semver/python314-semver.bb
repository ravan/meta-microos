SUMMARY = "Python helper for Semantic Versioning"
DESCRIPTION = "A Python module for semantic versioning. Simplifies comparing versions. \
See also http://semver.org/"
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python314-semver-3.0.4-3.2.noarch.rpm"
RPM_HASH = "d3a3138f86311408a0edbc635bf8242eed19d92d853d284c555145ef876ed32be92947827a580ae4a5a94e3e505624fcc8c0ec3c63f31324be800f29ab79bc57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-semver \
python314-semver \
python3dist-semver"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
