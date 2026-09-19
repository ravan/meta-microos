SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python39-smart-open-6.3.0-1.1.noarch.rpm"
RPM_HASH = "0cfa212c020710245b3bf733c2fff6e5d84af9998f457157e36cf9e87e9c92f42bad036c74f6eb4031040d27a48cce4964703c9021e403ad5e9e1021d1634b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-smart-open \
python39-smart-open \
python3dist-smart-open"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-core \
python39-azure-storage-blob \
python39-boto3 \
python39-google-cloud-storage \
python39-requests"

inherit rpm
