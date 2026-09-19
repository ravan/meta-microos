SUMMARY = "MS Azure Storage Client Library for Python - with Multi API version Support"
DESCRIPTION = "Microsoft Azure Storage Client Library for Python - with Multi API version Support \
 \
Handles multi-API versions of Azure Storage Data Plane originally from https://github.com/Azure/azure-storage-python. \
 \
**NOTE:** \
 \
- This is not an official Azure Storage SDK. \
 \
- It is used by https://github.com/Azure/azure-cli to support multiple API versions. \
 \
- The official Azure Storage SDK is at https://github.com/Azure/azure-storage-python."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python313-azure-multiapi-storage-1.6.0-1.4.noarch.rpm"
RPM_HASH = "0838ba16259520ee317c36a106d563b655dd93a5a9eb4080e5ae1dca5f132db436345cd1607f0f413ff521eaacbc324e62ae69ebd717f4d7e07fd123a3858725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-multiapi-storage \
python3.13dist-azure-multiapi-storage \
python313-azure-multiapi-storage \
python3dist-azure-multiapi-storage"

RDEPENDS:${PN} += "-python313-azure-core >= 1.10.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-azure-common \
python313-azure-nspkg \
python313-cryptography \
python313-msrest \
python313-python-dateutil \
python313-requests"

inherit rpm
