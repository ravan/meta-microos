SUMMARY = "Microsoft Azure Storage namespace package"
DESCRIPTION = "This is the Microsoft Azure Storage namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.storage namespace."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-azure-storage-nspkg-3.1.0-4.9.noarch.rpm"
RPM_HASH = "2fc2ceddc34b24c60e7173891a106821057982174de4d003ccf4e705d3a736b31818a177819a0c2b37593842d00ccfede8524ceda9bc89c6d74b21e2dd243e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-nspkg \
python3.13dist-azure-storage-nspkg \
python313-azure-storage-nspkg \
python3dist-azure-storage-nspkg"

RDEPENDS:${PN} += "python-abi \
python313-azure-nspkg"

inherit rpm
