SUMMARY = "The setuptools wheel for custom tests and install requirements"
DESCRIPTION = "This packages provides the setuptools wheel as separate file for cases where \
the wheel needs to be used directly in test or install setups"
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "80.9.0"

RPM_NAME = "python313-setuptools-wheel-80.9.0-3.2.noarch.rpm"
RPM_HASH = "3658bf0ae09fe05daddd34b5b4dfcc7d65d556a4c302ebb5e3de3b266676cf9bf2eb6f33a937c44da46355bc491d30969e9dfff9272b62c100943db28a39d6cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-wheel \
python313-setuptools-wheel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
