SUMMARY = "The pip wheel for custom tests and install requirements"
DESCRIPTION = "This packages provides the pip wheel as separate file for cases where \
the wheel needs to be used directly in test or install setups"
LICENSE = "MIT"

PV = "26.2.1"

RPM_NAME = "python311-pip-wheel-26.2.1-1.1.noarch.rpm"
RPM_HASH = "06a8aedf78fecfd61f24a6c4b424aa5e25dc4e2abd12f4709b32947b51978c1a0ef5ce5ed6fdeddf5bf1ffbfd09fdd4b7c4fd20c312fc7f5e06b29c93a411bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pip-wheel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
