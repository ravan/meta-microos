SUMMARY = "Python utils for streaming large files"
DESCRIPTION = "Python utils for streaming large files. \
Includes support for S3, HDFS, gzip, bz2, etc."
LICENSE = "MIT"

PV = "7.6.1"

RPM_NAME = "python313-smart-open-7.6.1-1.2.noarch.rpm"
RPM_HASH = "ba3738da49f5a89da65fb6acece8afdf3d1c23f07a85eebf3d807cb5f38e32d0eddefba4723cfb12d147f1fc82fb41fe65dfd6e0c8da5f50e615f4578a743fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smart-open \
python3.13dist-smart-open \
python313-smart-open \
python3dist-smart-open"

RDEPENDS:${PN} += "python-abi \
python313-azure-common \
python313-azure-core \
python313-azure-storage-blob \
python313-backports.zstd \
python313-boto3 \
python313-google-cloud-storage \
python313-requests \
python313-wrapt"

inherit rpm
