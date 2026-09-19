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

RPM_NAME = "python313-stestr-4.2.1-1.3.noarch.rpm"
RPM_HASH = "6e7f8bccb068a12fbb52ce0741cf10c06510df465df42e9402a2d2bf59336b236b56f7107ac31338a503652d6b04c6b03abb35705d0d5003b62005576b64f7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stestr \
python3.13dist-stestr \
python313-stestr \
python3dist-stestr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-cliff \
python313-dbm \
python313-fixtures \
python313-pbr \
python313-python-subunit \
python313-testtools \
python313-tomlkit \
python313-voluptuous"

inherit rpm
