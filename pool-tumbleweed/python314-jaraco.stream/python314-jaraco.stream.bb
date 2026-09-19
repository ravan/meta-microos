SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python314-jaraco.stream-3.0.4-2.5.noarch.rpm"
RPM_HASH = "bf60949cc50e5e6ca362360e3428b4241d43b022fabbf338ddb816effc1737b0ee45816d233fc31f764d372b361a4785129bb6f741e89ece4a98e37d84210967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.stream \
python314-jaraco.stream \
python3dist-jaraco.stream"

RDEPENDS:${PN} += "python-abi \
python314-more-itertools"

inherit rpm
