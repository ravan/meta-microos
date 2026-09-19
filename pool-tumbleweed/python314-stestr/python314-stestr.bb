SUMMARY = "A parallel Python test runner built around subunit"
DESCRIPTION = "stestr is parallel Python test runner designed to execute unittest test suites \
using multiple processes to split up execution of a test suite. It also will \
store a history of all test runs to help in debugging failures and optimizing \
the scheduler to improve speed. To accomplish this goal it uses the subunit \
protocol to facilitate streaming and storing results from multiple workers. \
 \
stestr originally started as a fork of the testrepository project. But, instead \
of being an interface for any test runner that used subunit, like testrepository, \
stestr concentrated on being a dedicated test runner for python projects. While \
stestr was originally forked from testrepository it is not backwards compatible \
with testrepository. At a high level the basic concepts of operation are shared \
between the two projects but the actual usage is not exactly the same."
LICENSE = "Apache-2.0"

PV = "4.2.1"

RPM_NAME = "python314-stestr-4.2.1-1.3.noarch.rpm"
RPM_HASH = "71074038d71bfcd9913bbdb4f73841b22dcb0478795fa6199a6128131fa954386c40687517fa4381eee73d0367a2ec3d5b6f2cac02a725f7604fe1c53d34c652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-stestr \
python314-stestr \
python3dist-stestr"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-cliff \
python314-dbm \
python314-fixtures \
python314-pbr \
python314-python-subunit \
python314-testtools \
python314-tomlkit \
python314-voluptuous"

inherit rpm
