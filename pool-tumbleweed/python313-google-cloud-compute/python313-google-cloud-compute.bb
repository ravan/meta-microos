SUMMARY = "Google Cloud Compute API client library"
DESCRIPTION = "Google Cloud Compute API client library"
LICENSE = "Apache-2.0"

PV = "1.51.0"

RPM_NAME = "python313-google-cloud-compute-1.51.0-1.1.noarch.rpm"
RPM_HASH = "00eba832096b3bc5c9ece451b0c43b7a5c5c243c606d519e99fb902853d5a95f1243959b0990f74118359d64b0b000f9c59162ec2887fd8c0defdb4887dbf2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-compute \
python3.13dist-google-cloud-compute \
python313-google-cloud-compute \
python3dist-google-cloud-compute"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
