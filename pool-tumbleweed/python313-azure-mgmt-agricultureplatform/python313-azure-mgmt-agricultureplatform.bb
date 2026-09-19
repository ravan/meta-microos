SUMMARY = "Microsoft Azure Agricultureplatform Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agricultureplatform Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-agricultureplatform-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "78a9ee3fbc6f7b9ac3f3af2b3f09e49a3ac4cb48327c684bc82c2b6ca1aac36b3e6b26d61d8d98802d954213240c518ad04ebfcd847e67d4de792c83a8430b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-agricultureplatform \
python3.13dist-azure-mgmt-agricultureplatform \
python313-azure-mgmt-agricultureplatform \
python3dist-azure-mgmt-agricultureplatform"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
