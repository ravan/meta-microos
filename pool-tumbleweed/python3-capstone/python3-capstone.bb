SUMMARY = "Python bindings for the Capstone disassembly framework"
DESCRIPTION = "Capstone is a multi-architecture disassembly framework. \
 \
This package contains the Capstone bindings for Python."
LICENSE = "BSD-3-Clause"

PV = "5.0.6"

RPM_NAME = "python3-capstone-5.0.6-2.3.noarch.rpm"
RPM_HASH = "9b6675821631de4224e14d7df0370358094057cbb6b084ef5c7afbf10dbd94f5ba96e99c37114bb40b278452e6d3a64a04d11bad66272864ac9459e1a08e9cdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-capstone \
python3.13dist-capstone \
python3dist-capstone"

RDEPENDS:${PN} += "python-abi"

inherit rpm
