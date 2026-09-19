SUMMARY = "Azure DataLake service client library for Python"
DESCRIPTION = "This preview package for Python includes ADLS Gen2 specific API support made \
available in Storage SDK. \
 \
This includes: \
 \
1. New directory level operations (Create, Rename, Delete) for hierarchical namespace \
   enabled (HNS) storage account. For HNS enabled accounts, the rename/move operations \
   are atomic. \
2. Permission related operations (Get/Set ACLs) for hierarchical namespace enabled \
   (HNS) accounts."
LICENSE = "MIT"

PV = "12.25.0"

RPM_NAME = "python314-azure-storage-file-datalake-12.25.0-1.2.noarch.rpm"
RPM_HASH = "2c571e6187668e76edbd1e5c5c5abffbd85eda1aa1a0a7cd827a3929fc73ca4e6c9adcb5a37acd58ad92ddf5d58b67cf0176b6fb99cd494e1c0082274334b634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-storage-file-datalake \
python314-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-azure-storage-blob >= 12.28.0 with python314-azure-storage-blob < 13.0.0 \
-python314-typing-extensions >= 4.6.0 \
python-abi \
python314-azure-nspkg \
python314-azure-storage-nspkg \
python314-isodate"

inherit rpm
