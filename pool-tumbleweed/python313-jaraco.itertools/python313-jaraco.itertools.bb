SUMMARY = "Tools to work with iterables"
DESCRIPTION = "jaraco.itertools Tools for working with iterables. \
Complements itertools and more_itertools."
LICENSE = "MIT"

PV = "6.4.3"

RPM_NAME = "python313-jaraco.itertools-6.4.3-1.3.noarch.rpm"
RPM_HASH = "a66baec107ca1713eef723fa7a9789e66dc62ebaa176d72e86aa6609732840669bc7b3e6fe0c677b1e81d180839ea7f493bb554c3f5eff699de96947d822cc46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.itertools \
python3.13dist-jaraco.itertools \
python313-jaraco.itertools \
python3dist-jaraco.itertools"

RDEPENDS:${PN} += "python-abi \
python313-inflect \
python313-more-itertools"

inherit rpm
