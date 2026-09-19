SUMMARY = "The pip wheel for custom tests and install requirements"
DESCRIPTION = "This packages provides the pip wheel as separate file for cases where \
the wheel needs to be used directly in test or install setups"
LICENSE = "MIT"

PV = "26.2.1"

RPM_NAME = "python313-pip-wheel-26.2.1-1.1.noarch.rpm"
RPM_HASH = "bb494c25aebf12e050221ebca1c382c2a6ab2bc2dee5f0e80146a9471c422076c7cdd647504eb8f913a9b360d4a44a6325259e71b167dac0a5b1eacaa5742fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-wheel \
python313-pip-wheel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
