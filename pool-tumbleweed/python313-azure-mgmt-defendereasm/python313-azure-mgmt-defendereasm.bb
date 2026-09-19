SUMMARY = "Microsoft Azure Defendereasm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Defendereasm Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-defendereasm-1.0.0~b1-2.9.noarch.rpm"
RPM_HASH = "9d3a126aaf9ca534fc08d0ebfacb038d9ff59e865a966bcb8785f1c1f38f2e83a1ddf5015fe9c9a2d441b351fe58a25b726efa9e8a880c5373ef716dbe5c4d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-defendereasm \
python3.13dist-azure-mgmt-defendereasm \
python313-azure-mgmt-defendereasm \
python3dist-azure-mgmt-defendereasm"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
