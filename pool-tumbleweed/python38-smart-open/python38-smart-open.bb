SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python38-smart-open-6.3.0-1.1.noarch.rpm"
RPM_HASH = "f7e33bbb4af28da7a1300010138903a26a3e27cd40d5f9f6d750fe1237067319f6856b7fa4d9d333b6bf0514e4b4b5dc8186f1510aa852020d9946df88c8a3d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-smart-open \
python38-smart-open \
python3dist-smart-open"

RDEPENDS:${PN} += "python-abi \
python38-azure-common \
python38-azure-core \
python38-azure-storage-blob \
python38-boto3 \
python38-google-cloud-storage \
python38-requests"

inherit rpm
