SUMMARY = "Fast and well tested serialization library"
DESCRIPTION = "Fast and well tested serialization library"
LICENSE = "Apache-2.0"

PV = "3.22"

RPM_NAME = "python314-mashumaro-3.22-2.1.noarch.rpm"
RPM_HASH = "92fac42a0b36cbe609a9b620386e9b68a82008498a34dabdc39bdcbcfe8ab6c7d3451dd1dee3c6a93c3105e0eabf17747f00a23a900a96e139cd0d52c3a6f199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mashumaro \
python314-mashumaro \
python3dist-mashumaro"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
