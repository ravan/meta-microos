SUMMARY = "Microsoft Azure Storage Common Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-storage-common-2.1.0-4.9.noarch.rpm"
RPM_HASH = "0e4c1e0d067681a06af7b620f719da1326e5b5fef26a5ecdffcb24bcdf2a03d835f35c5f35429a3e5e70334ed73778fbe888bf04896a5161dd4c518e1baf5eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-common \
python3.13dist-azure-storage-common \
python313-azure-storage-common \
python3dist-azure-storage-common"

RDEPENDS:${PN} += "python-abi \
python313-azure-common \
python313-azure-nspkg \
python313-azure-storage-nspkg \
python313-cryptography \
python313-python-dateutil \
python313-requests"

inherit rpm
