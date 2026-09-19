SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "5.3.1"

RPM_NAME = "python314-asdf-5.3.1-1.2.noarch.rpm"
RPM_HASH = "c00133f1cbd5197f259c41b09d9edea163abeb767425c50a591519971f9aa765da6f841c9f2ae6805c44ff50fe0eb43d953383e6a37664914aca2ff0fb298f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asdf \
python314-asdf \
python3dist-asdf"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-asdf-standard \
python314-attrs \
python314-jmespath \
python314-numpy \
python314-packaging \
python314-semantic-version \
update-alternatives"

inherit rpm
