SUMMARY = "The setuptools wheel for custom tests and install requirements"
DESCRIPTION = "This packages provides the setuptools wheel as separate file for cases where \
the wheel needs to be used directly in test or install setups"
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "80.9.0"

RPM_NAME = "python312-setuptools-wheel-80.9.0-3.3.noarch.rpm"
RPM_HASH = "084a06b6c7629c40bfff7398f3e42957c08276675215c2b65d3fe3474816030974d7e97135cae2845f607899637cf7cd0b2800a4022e8f3f7a56995f0276cb11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python312-setuptools-wheel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
