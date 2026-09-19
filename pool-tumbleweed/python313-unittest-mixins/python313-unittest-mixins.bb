SUMMARY = "Helpful mixins for unittest classes"
DESCRIPTION = "Helpful mixins for unittest classes."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python313-unittest-mixins-1.6-3.9.noarch.rpm"
RPM_HASH = "b2e225afca17b76ed62a82f4e3fc7597d8d49585bfc0da5a92bddf3fb72e90a9a66d3f2f0ff3246627e6ac0c4bd4e2eefaaf66733482141a6c9e6822839a2809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unittest-mixins \
python3.13dist-unittest-mixins \
python313-unittest-mixins \
python3dist-unittest-mixins"

RDEPENDS:${PN} += "python-abi"

inherit rpm
