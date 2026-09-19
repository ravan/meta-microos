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

RPM_NAME = "python314-testrepository-0.0.22-2.3.noarch.rpm"
RPM_HASH = "0f415790fc29e706a3f4797f3144a1c85ff3a6fc75b275936ab9fe36608fc11dc9e075c741c84314afd389fe3676f550759387c136614458d0a3d7511672bfb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-testrepository \
python314-testrepository \
python3dist-testrepository"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-dbm \
python314-fixtures \
python314-iso8601 \
python314-python-subunit"

inherit rpm
