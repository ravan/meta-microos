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

RPM_NAME = "python314-azure-multiapi-storage-1.6.0-1.4.noarch.rpm"
RPM_HASH = "2d46ffc7bc1cf506dc97d302e0a9d8b9d536afb49062383fcc5f8f1c05a0e4a0940bef3227f2228205a7a85f04b2497325b948e1591ddaec2766b994cd8fa9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-multiapi-storage \
python314-azure-multiapi-storage \
python3dist-azure-multiapi-storage"

RDEPENDS:${PN} += "-python314-azure-core >= 1.10.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-azure-common \
python314-azure-nspkg \
python314-cryptography \
python314-msrest \
python314-python-dateutil \
python314-requests"

inherit rpm
