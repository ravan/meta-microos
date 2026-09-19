SUMMARY = "Tools to work with classes"
DESCRIPTION = "jaraco.classes Tools for working with classes."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python314-jaraco.classes-3.4.0-2.5.noarch.rpm"
RPM_HASH = "97c4cc2d0d0a827908f18efa268d50f0ed6b70f900b80e5b5b82535bb346cb2e0f8f122db2583da0c2baef2c0184aab0243d310875760ed89c8d2d3e00fc46d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.classes \
python314-jaraco.classes \
python3dist-jaraco.classes"

RDEPENDS:${PN} += "python-abi \
python314-more-itertools"

inherit rpm
