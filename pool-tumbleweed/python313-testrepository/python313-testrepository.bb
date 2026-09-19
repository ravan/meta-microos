SUMMARY = "A repository of test results"
DESCRIPTION = "This project provides a database of test results which can be used as part of \
developer workflow to ensure/check things like: \
 \
* No commits without having had a test failure, test fixed cycle. \
* No commits without new tests being added. \
* What tests have failed since the last commit (to run just a subset). \
* What tests are currently failing and need work. \
 \
Test results are inserted using subunit (and thus anything that can output \
subunit or be converted into a subunit stream can be accepted)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.0.22"

RPM_NAME = "python313-testrepository-0.0.22-2.3.noarch.rpm"
RPM_HASH = "6de4eebcb14df23ab55a0430f3ef472f4907bac7df79c0907dcc450ecc689fbc8fb7a6c673d5f91e76870a10ea9be2b49870c24da00be84dfab253fa312e3c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testrepository \
python3.13dist-testrepository \
python313-testrepository \
python3dist-testrepository"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-dbm \
python313-fixtures \
python313-iso8601 \
python313-python-subunit"

inherit rpm
