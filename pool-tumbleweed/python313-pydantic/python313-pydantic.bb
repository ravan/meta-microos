SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "2.13.5"

RPM_NAME = "python313-pydantic-2.13.5-1.1.noarch.rpm"
RPM_HASH = "da56801ff1a74de6c970070d613e9d6015e2f88dfb7d27209fc54ed03fa80c6153ce5717c6696068192b85ab649c73b0da111188240ece322d3fdf8d7c2b62ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydantic \
python3.13dist-pydantic \
python313-pydantic \
python3dist-pydantic"

RDEPENDS:${PN} += "python-abi \
python313-annotated-types \
python313-pydantic-core \
python313-typing-extensions \
python313-typing-inspection"

inherit rpm
