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

RPM_NAME = "python314-azure-storage-blob-12.30.1-1.1.noarch.rpm"
RPM_HASH = "8d313083baef219aa47bde2147d4c7d038a3fa7c77c845b3c9ad5f648fe6938de9366bdb86405ce7e1442982a6e74ed8a02ed77457bcc4a605d60d894dc3c373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-storage-blob \
python314-azure-storage-blob \
python3dist-azure-storage-blob"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-azure-storage-common >= 2.1.0 with python314-azure-storage-common < 3.0.0 \
-python314-typing-extensions >= 4.6.0 \
python-abi \
python314-azure-common \
python314-azure-nspkg \
python314-azure-storage-nspkg \
python314-cryptography \
python314-isodate"

inherit rpm
