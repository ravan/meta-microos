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

RPM_NAME = "python313-azure-storage-file-datalake-12.25.0-1.2.noarch.rpm"
RPM_HASH = "bc8792ae7ad9de2b7347f1e2844a8af327c754b8e29517c0cb1896e904a5a2628456b6775249ac2b98099fd451b191d1883c9c6834d309202fb66a0d5cbedd93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-file-datalake \
python3.13dist-azure-storage-file-datalake \
python313-azure-storage-file-datalake \
python3dist-azure-storage-file-datalake"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-azure-storage-blob >= 12.28.0 with python313-azure-storage-blob < 13.0.0 \
-python313-typing-extensions >= 4.6.0 \
python-abi \
python313-azure-nspkg \
python313-azure-storage-nspkg \
python313-isodate"

inherit rpm
