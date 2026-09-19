SUMMARY = "Microsoft Azure Fabric Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Fabric Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-fabric-1.0.0-1.5.noarch.rpm"
RPM_HASH = "3fe7fb762066f169160381462a936bac2a238c58f117bb693c27ba78f9d4d97522ed3ac68231759cab4361edab7259d871062787ee3a9b4cc5c4c6136a7aaeb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-fabric \
python3.13dist-azure-mgmt-fabric \
python313-azure-mgmt-fabric \
python3dist-azure-mgmt-fabric"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
