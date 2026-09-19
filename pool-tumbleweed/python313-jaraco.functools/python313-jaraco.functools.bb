SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python313-jaraco.functools-4.6.0-1.1.noarch.rpm"
RPM_HASH = "924bd16985f851ccf2d8e7f20617b1cccae5a35b9d8c232753808ce6505e2ae90ba1814221e2236c0960e19d7df1e0d938c67728cb9caca41d1954ff21077926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.functools \
python3.13dist-jaraco.functools \
python313-jaraco.functools \
python3dist-jaraco.functools"

RDEPENDS:${PN} += "python-abi \
python313-more-itertools"

inherit rpm
