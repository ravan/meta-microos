SUMMARY = "Coverage checking using https://coveralls.io/"
DESCRIPTION = "A helper to check https://coveralls.io for a given commit hash."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python313-coveralls-check-1.2.1-6.5.noarch.rpm"
RPM_HASH = "a036b98771ba0c92766b21ee473e1438d92e556bbbbd3c0c0b6b569d1c6d09b8d11fdd1e5f0ebbfc398d03a0554f1aaa35094c9b45ac0656fa0750839fb2d403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coveralls-check \
python3.13dist-coveralls-check \
python313-coveralls-check \
python3dist-coveralls-check"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-backoff \
python313-requests \
python313-setuptools"

inherit rpm
