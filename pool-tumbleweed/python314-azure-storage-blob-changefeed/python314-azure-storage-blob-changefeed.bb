SUMMARY = "Microsoft Azure Storage Blob ChangeFeed Client Library for Python"
DESCRIPTION = "This preview package for Python enables users to get blob change feed events. \
These events can be lazily generated, iterated by page, retrieved for a specific \
time interval, or iterated from a specific continuation token."
LICENSE = "MIT"

PV = "12.0.0~b5"

RPM_NAME = "python314-azure-storage-blob-changefeed-12.0.0~b5-1.5.noarch.rpm"
RPM_HASH = "6d0eb074f2a4c811dcfaa154b3ce3ebd7453f4560d5e367b81444b73b5125e456084fbc7f0b06124094f9648ef5dbc6ddf648ee574e87d1e0c42ab99e6905ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-storage-blob-changefeed \
python314-azure-storage-blob-changefeed \
python3dist-azure-storage-blob-changefeed"

RDEPENDS:${PN} += "-python314-azure-storage-blob >= 12.19.1 with python314-azure-storage-blob < 13.0.0 \
python-abi \
python314-azure-nspkg \
python314-azure-storage-nspkg"

inherit rpm
