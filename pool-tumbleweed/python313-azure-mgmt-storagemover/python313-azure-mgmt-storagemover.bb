SUMMARY = "Microsoft Azure Storagemover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagemover Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-azure-mgmt-storagemover-3.1.0-1.2.noarch.rpm"
RPM_HASH = "882d44b82b8af80477a79cb73873fda9f30bcc0694997ad58edee9ccf71e3c7adb0c41d43898315fad06ab18a50b4f143ec06b17f876cbbf2719e96aa0cfa246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagemover \
python3.13dist-azure-mgmt-storagemover \
python313-azure-mgmt-storagemover \
python3dist-azure-mgmt-storagemover"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
