SUMMARY = "Enhanced Python builtin doctest module"
DESCRIPTION = "A rewrite of the builtin doctest module with a pytest plugin."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "python314-xdoctest-1.3.2-1.3.noarch.rpm"
RPM_HASH = "a84a703789e99dab0dd6e8e9d305806c7dba04b1533d884f3345905868c4e42eed278b563be52a1c7e05f771cb03f1ed3187400054dc5aa9e558904613b2e68b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xdoctest \
python314-xdoctest \
python3dist-xdoctest"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
