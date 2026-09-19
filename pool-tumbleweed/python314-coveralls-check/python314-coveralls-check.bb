SUMMARY = "Coverage checking using https://coveralls.io/"
DESCRIPTION = "A helper to check https://coveralls.io for a given commit hash."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python314-coveralls-check-1.2.1-6.5.noarch.rpm"
RPM_HASH = "e1a1131a1647db59f7e8d0f064d2f900e70c00ad8a147d5e1e3095c61846ae9b87ca1d4b08f87c248fab4feaeb87d5b832acfa56623e04127b406141ce345611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-coveralls-check \
python314-coveralls-check \
python3dist-coveralls-check"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-backoff \
python314-requests \
python314-setuptools"

inherit rpm
