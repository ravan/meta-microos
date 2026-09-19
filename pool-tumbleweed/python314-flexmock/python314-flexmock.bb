SUMMARY = "Testing library for creating mocks, stubs and fakes"
DESCRIPTION = "Flexmock is a testing library for Python for creating mocks, \
stubs and fakes. The API is inspired by a Ruby library of the same name, but \
Python flexmock is not a clone of the Ruby version. It omits a number of \
redundancies in the Ruby flexmock API, alters some defaults, and introduces \
a number of Python-only features."
LICENSE = "BSD-2-Clause"

PV = "0.13.0"

RPM_NAME = "python314-flexmock-0.13.0-1.3.noarch.rpm"
RPM_HASH = "9d2bffec8d073289ddcf35ba97961d1aa6a4959b6ebfb343ab30f60f617b226d84cc1bfbb622f5536ed565bf5c3d072b2482fa5682cc7f82ea9b56f4b3e73026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flexmock \
python314-flexmock \
python3dist-flexmock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
