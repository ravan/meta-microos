SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.19.2"

RPM_NAME = "python313-s3transfer-0.19.2-1.1.noarch.rpm"
RPM_HASH = "8f41489be51613989de670419a68b3f78525585d5476fe8ffb592baadb560de3cf8a28aa08ac56cdf6035f41649cca3d49dc9c3be562313d4a1c8d4a00e8b344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-s3transfer \
python3.13dist-s3transfer \
python313-s3transfer \
python3dist-s3transfer"

RDEPENDS:${PN} += "-python313-botocore >= 1.37.4 with python313-botocore <= 2.0.0 \
python-abi \
python313-requests"

inherit rpm
