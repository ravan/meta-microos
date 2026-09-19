SUMMARY = "Microsoft Azure Servicelinker Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicelinker Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0~b3"

RPM_NAME = "python313-azure-mgmt-servicelinker-1.2.0~b3-1.9.noarch.rpm"
RPM_HASH = "7cd96cf011d41eec46ab0fef003ee61ed8fc85884b16a34d140033f1729bffbb23f99f516dd220246e80bd9f79fa2508705188b6d52a9ee21216a24b4971d083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicelinker \
python3.13dist-azure-mgmt-servicelinker \
python313-azure-mgmt-servicelinker \
python3dist-azure-mgmt-servicelinker"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
