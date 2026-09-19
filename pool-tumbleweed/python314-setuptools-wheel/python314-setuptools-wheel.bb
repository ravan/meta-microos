SUMMARY = "The setuptools wheel for custom tests and install requirements"
DESCRIPTION = "This packages provides the setuptools wheel as separate file for cases where \
the wheel needs to be used directly in test or install setups"
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "80.9.0"

RPM_NAME = "python314-setuptools-wheel-80.9.0-3.3.noarch.rpm"
RPM_HASH = "a746a172db0e578770ef82a2cab764ff92718aef8c33a97978bdd06ccf63d5e37c2cf2d13bbd0c33dcb3680165e4631e1648c6149f60ad50e82b09eb31949114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-setuptools-wheel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
