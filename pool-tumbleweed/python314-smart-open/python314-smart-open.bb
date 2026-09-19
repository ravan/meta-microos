SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "7.6.1"

RPM_NAME = "python314-smart-open-7.6.1-1.2.noarch.rpm"
RPM_HASH = "b278e033e82baba0b3e337398734c4dafe1348f24b4453e8b8427670701bfbee863547cd110313d37e58ad5e7484b1f738377f786746fbf7acfa873d551d6d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-smart-open \
python314-smart-open \
python3dist-smart-open"

RDEPENDS:${PN} += "python-abi \
python314-azure-common \
python314-azure-core \
python314-azure-storage-blob \
python314-boto3 \
python314-google-cloud-storage \
python314-requests \
python314-wrapt"

inherit rpm
