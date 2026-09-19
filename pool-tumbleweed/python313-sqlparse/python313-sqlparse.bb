SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python313-sqlparse-0.6.0-1.1.noarch.rpm"
RPM_HASH = "0d6d7037690ecc353b434b912884f113a0a6927737384bab8256543748ff27ad6386cfcb963b7007aea26353b31ebdb283313ee0ec59d5a0269a8a187abc9bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlparse \
python3.13dist-sqlparse \
python313-sqlparse \
python3dist-sqlparse"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
