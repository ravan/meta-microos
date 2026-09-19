SUMMARY = "Microsoft Azure Relationships Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Relationships Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-relationships-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "e572f06c7ad02a0cf8c4093ed0ac5816540540ff4a0dd907a5b32b2537e4f0d2107f6e1a74798600be8884d1d523175af143420eba6d773c1562eee00a5182f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-relationships \
python3.13dist-azure-mgmt-relationships \
python313-azure-mgmt-relationships \
python3dist-azure-mgmt-relationships"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
