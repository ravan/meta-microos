SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python313-loguru-0.7.3-4.2.noarch.rpm"
RPM_HASH = "7f7db18fa79828dd0a27e715e056f8e4ce6068be418a27515ed305e016059f5fea9e8210eb4eaf6a38033b8cf074012b4f31a9e592a353e668d9604dd537d706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-loguru \
python3.13dist-loguru \
python313-loguru \
python3dist-loguru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
