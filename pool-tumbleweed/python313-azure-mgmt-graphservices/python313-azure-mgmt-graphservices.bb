SUMMARY = "Microsoft Azure Graphservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Graphservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-graphservices-1.0.0-2.9.noarch.rpm"
RPM_HASH = "23bb8cae641ad675f92fbcb42f85c6936eddacccc427bf26a955c6d7b1485395f4c02994ba4761e8280af50e9dcdf841ccacda46a6f1631a785706b1c5caee7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-graphservices \
python3.13dist-azure-mgmt-graphservices \
python313-azure-mgmt-graphservices \
python3dist-azure-mgmt-graphservices"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
