SUMMARY = "Example HEP files for testing and demonstrating"
DESCRIPTION = "A common package to provide example files (*e.g*. ROOT) for testing and \
developing packages against.  The sample of files is representative of typical \
files found 'in the wild'. \
 \
In addition to including some root files directly, this package adds some \
simple helper methods to get larger files from common open-access data \
repositories."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "python314-scikit-hep-testdata-0.6.7-1.1.noarch.rpm"
RPM_HASH = "4e36bbb12819f5e1866ef33e1226eff3f21fbb977fd1695c2514500fc59d765fa3c06d7e28c5c8e62362a99bfcf31a40ef2ff72379f3c0f156c6bb556633fc86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scikit-hep-testdata \
python314-scikit-hep-testdata \
python3dist-scikit-hep-testdata"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-requests \
scikit-hep-testdata-files \
update-alternatives"

inherit rpm
