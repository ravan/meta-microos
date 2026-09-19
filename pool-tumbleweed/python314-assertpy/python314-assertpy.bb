SUMMARY = "Simple assertion library for unit testing in python with a fluent API"
DESCRIPTION = "Simple assertion library for unit testing in python with a fluent API"
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python314-assertpy-1.1-1.4.noarch.rpm"
RPM_HASH = "9c6cdf91faeed06e36c06ef0e0a3355c800ccbd4a99f6077cb79526a63b493436d43c05303dfc57f9da27939210cc5a21299bf8822aff7f11dc5132e89f23abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-assertpy \
python314-assertpy \
python3dist-assertpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
