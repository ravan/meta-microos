SUMMARY = "List processing tools and functional utilities for python"
DESCRIPTION = "A set of python utility functions for iterators, functions, and dictionaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python314-toolz-1.1.0-2.1.noarch.rpm"
RPM_HASH = "40db91b60af55c11f0045fb3576756f580d9f4a119ef2cebb718ce87f456289fec523f604dc72ebcda5b11db1e8c6c1eb75843d7c2ea1268635a518ee48e7fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-toolz \
python314-toolz \
python3dist-toolz"

RDEPENDS:${PN} += "python-abi"

inherit rpm
