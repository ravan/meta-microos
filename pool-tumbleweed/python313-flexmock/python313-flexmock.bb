SUMMARY = "Testing library for creating mocks, stubs and fakes"
DESCRIPTION = "Flexmock is a testing library for Python for creating mocks, \
stubs and fakes. The API is inspired by a Ruby library of the same name, but \
Python flexmock is not a clone of the Ruby version. It omits a number of \
redundancies in the Ruby flexmock API, alters some defaults, and introduces \
a number of Python-only features."
LICENSE = "BSD-2-Clause"

PV = "0.13.0"

RPM_NAME = "python313-flexmock-0.13.0-1.3.noarch.rpm"
RPM_HASH = "fcf51efa771f995a25581ec051b532af8209ba9992d942c70940728a3c7af31a948ca7f1a8f6b6e31c9f12701ab15644a0e4341b3781379855ca600f905e4fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flexmock \
python3.13dist-flexmock \
python313-flexmock \
python3dist-flexmock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
