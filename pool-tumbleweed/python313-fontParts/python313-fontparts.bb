SUMMARY = "API for interacting with the parts of fonts"
DESCRIPTION = "An API for interacting with the parts of fonts during the font development process."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "python313-fontParts-0.14.1-1.3.noarch.rpm"
RPM_HASH = "39dba46888886a9e67585cc9b969f8f42f61756a3072e9b567c49569c4468ec374fea9d733c17744e96aa335dfb6fd0f31485ea43f6970fbe8a35c8bfa302c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fontParts \
python3.13dist-fontparts \
python313-fontParts \
python3dist-fontparts"

RDEPENDS:${PN} += "python-abi \
python313-FontTools \
python313-booleanOperations \
python313-defcon \
python313-fontMath \
python313-fs \
python313-lxml"

inherit rpm
