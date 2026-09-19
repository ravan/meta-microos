SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python310-smart-open-6.3.0-1.1.noarch.rpm"
RPM_HASH = "0a842e1c9bd183b5b0c2c7ee4cc66c76c3426b7fbc41f042aacea0637a861c8aa3229947870ec7da6372ed374bf32110d4a4a27804ab494547b639e1a3832e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smart-open \
python3.10dist-smart-open \
python310-smart-open \
python3dist-smart-open"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-core \
python310-azure-storage-blob \
python310-boto3 \
python310-google-cloud-storage \
python310-requests"

inherit rpm
