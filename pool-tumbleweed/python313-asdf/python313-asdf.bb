SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "5.3.1"

RPM_NAME = "python313-asdf-5.3.1-1.2.noarch.rpm"
RPM_HASH = "d04388c1ae13260a34eca6a81e57198d5b20dcf29ad31095113b49c2b94ecc54db1aacd0afc5158c0809ffd3cfd0302ee92c95589fb353ab41844723972c2544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf \
python3.13dist-asdf \
python313-asdf \
python3dist-asdf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-asdf-standard \
python313-attrs \
python313-jmespath \
python313-numpy \
python313-packaging \
python313-semantic-version \
update-alternatives"

inherit rpm
