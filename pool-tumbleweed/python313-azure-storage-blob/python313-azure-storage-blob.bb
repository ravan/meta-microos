SUMMARY = "Microsoft Azure Storage Blob Client Library for Python"
DESCRIPTION = "Azure Blob storage is Microsoft's object storage solution for the cloud. Blob storage is optimized \
for storing massive amounts of unstructured data, such as text or binary data. \
 \
Blob storage is ideal for: \
 \
* Serving images or documents directly to a browser \
* Storing files for distributed access \
* Streaming video and audio \
* Storing data for backup and restore, disaster recovery, and archiving \
* Storing data for analysis by an on-premises or Azure-hosted service"
LICENSE = "MIT"

PV = "12.30.1"

RPM_NAME = "python313-azure-storage-blob-12.30.1-1.1.noarch.rpm"
RPM_HASH = "affd68947d460da839b9b24685ccbf77b4611c7bd9241137724e037c049148446b6ac4c7dc3a83864c9dd46cadc3479b2eee4ef67c2326ad4e3c46a105ba0028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-blob \
python3.13dist-azure-storage-blob \
python313-azure-storage-blob \
python3dist-azure-storage-blob"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-azure-storage-common >= 2.1.0 with python313-azure-storage-common < 3.0.0 \
-python313-typing-extensions >= 4.6.0 \
python-abi \
python313-azure-common \
python313-azure-nspkg \
python313-azure-storage-nspkg \
python313-cryptography \
python313-isodate"

inherit rpm
