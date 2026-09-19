SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "2.13.5"

RPM_NAME = "python314-pydantic-2.13.5-1.1.noarch.rpm"
RPM_HASH = "ddfbee2ce110d3d7ba33f81affbea51ea2d89775deda95624e36e45d6f5d454b9d5b75b1f733c41997b772580a258664da29faf241ce321458ef85f0299e46eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydantic \
python314-pydantic \
python3dist-pydantic"

RDEPENDS:${PN} += "python-abi \
python314-annotated-types \
python314-pydantic-core \
python314-typing-extensions \
python314-typing-inspection"

inherit rpm
