SUMMARY = "Tools to work with iterables"
DESCRIPTION = "jaraco.itertools Tools for working with iterables. \
Complements itertools and more_itertools."
LICENSE = "MIT"

PV = "6.4.3"

RPM_NAME = "python314-jaraco.itertools-6.4.3-1.3.noarch.rpm"
RPM_HASH = "4ddfc9cee48dfed9632cfce7db7ebe12cd8a76b293ea9502ed1bf738cd20328c744e25d5f7480dcc2d34e52657766c0835e54d5bb5c97746ce9ae2727d84cd8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.itertools \
python314-jaraco.itertools \
python3dist-jaraco.itertools"

RDEPENDS:${PN} += "python-abi \
python314-inflect \
python314-more-itertools"

inherit rpm
