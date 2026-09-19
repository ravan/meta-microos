SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python314-tox-wheel-1.0.0-2.5.noarch.rpm"
RPM_HASH = "06d6af63b5fbc2cfffcae40f4138440d4bc9add5b1c0978307e626f440a13b04b2bd11b7dab6d68abc27ad563fe56fc6f22bed46f0e2b1ac27f7e6edbb6fa7b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tox-wheel \
python314-tox-wheel \
python3dist-tox-wheel"

RDEPENDS:${PN} += "python-abi \
python314-tox \
python314-wheel"

inherit rpm
