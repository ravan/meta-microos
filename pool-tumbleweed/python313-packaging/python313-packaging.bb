SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "26.3"

RPM_NAME = "python313-packaging-26.3-1.1.noarch.rpm"
RPM_HASH = "d07802af1d9015e6c4e47a9e2355548cbbf8f71f2c27806f3cdcc68dc126f992193c5d9aa72ac68cf431a5721893dce4944c5d3666950d790c4c4563af38e595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-packaging \
python3.13dist-packaging \
python313-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
