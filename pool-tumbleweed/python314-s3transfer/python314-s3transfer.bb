SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.19.2"

RPM_NAME = "python314-s3transfer-0.19.2-1.1.noarch.rpm"
RPM_HASH = "f4e49ecb11ef909bc0c8d8994182fc305e72473cd31a32d96435a5414dfa55dbf72d2a12744254c2f1f09d99f5c70996cf6eff0df2d59027b52b82eab2bf2595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-s3transfer \
python314-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "-python314-botocore >= 1.37.4 with python314-botocore <= 2.0.0 \
python-abi \
python314-requests"

inherit rpm
