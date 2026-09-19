SUMMARY = "Google Cloud Service Directory API client library"
DESCRIPTION = "Google Cloud Service Directory API client library"
LICENSE = "Apache-2.0"

PV = "1.18.0"

RPM_NAME = "python313-google-cloud-service-directory-1.18.0-1.1.noarch.rpm"
RPM_HASH = "f043ca87352594c4aaa537ecf1122709082380b611fb5dd0bd01b5320541f3130bba68bc060b239310ef3890a41bfa17a7bf8ce46b2a87cce6162f497c518414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-service-directory \
python3.13dist-google-cloud-service-directory \
python313-google-cloud-service-directory \
python3dist-google-cloud-service-directory"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
