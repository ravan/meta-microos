SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "26.3"

RPM_NAME = "python312-packaging-26.3-1.1.noarch.rpm"
RPM_HASH = "43846ff924bd27774eeb489abba6e6009cf04807dfc6204d4235863e4d54f45c746f5759188292627a513bce64fe98d31bdf85f38183cbaa703bdc7f5df66e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-packaging \
python312-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
