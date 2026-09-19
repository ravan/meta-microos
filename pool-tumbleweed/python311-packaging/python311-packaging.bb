SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "26.3"

RPM_NAME = "python311-packaging-26.3-1.1.noarch.rpm"
RPM_HASH = "37e371e80558bc8812310fb61d485af1b17c95b1d34801a49f572d53e8cc5833c2f8d2a0cd0a234350b24496590f461644eaee9ea62a2b08d728e8da23a0bb20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-packaging \
python311-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
