SUMMARY = "Microsoft Azure Storage Blob ChangeFeed Client Library for Python"
DESCRIPTION = "This preview package for Python enables users to get blob change feed events. \
These events can be lazily generated, iterated by page, retrieved for a specific \
time interval, or iterated from a specific continuation token."
LICENSE = "MIT"

PV = "12.0.0~b5"

RPM_NAME = "python313-azure-storage-blob-changefeed-12.0.0~b5-1.5.noarch.rpm"
RPM_HASH = "fdb5e06895fc8bf35bc9ebe0a1613d464da9e0bb102d05340527a49e09c492778e0c39c4c6842c2c0dbac8beb197e17e95774677a7a0660e8138ca71ca7f589a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-storage-blob-changefeed \
python3.13dist-azure-storage-blob-changefeed \
python313-azure-storage-blob-changefeed \
python3dist-azure-storage-blob-changefeed"

RDEPENDS:${PN} += "-python313-azure-storage-blob >= 12.19.1 with python313-azure-storage-blob < 13.0.0 \
python-abi \
python313-azure-nspkg \
python313-azure-storage-nspkg"

inherit rpm
