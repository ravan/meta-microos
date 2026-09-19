SUMMARY = "Stackdriver Logging API client library"
DESCRIPTION = "Stackdriver Logging API client library"
LICENSE = "Apache-2.0"

PV = "3.16.3"

RPM_NAME = "python313-google-cloud-logging-3.16.3-1.1.noarch.rpm"
RPM_HASH = "3990aaa6d0a8de823d606ff3c1651452c01e7223dcf9337cbee59cf909d5cf55f6fe084f6e051545e40ff9cc6dfcf28a8a1c6d4f68495da7a8877a5bf6597f86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-logging \
python3.13dist-google-cloud-logging \
python313-google-cloud-logging \
python3dist-google-cloud-logging"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-google-cloud-appengine-logging \
python313-google-cloud-audit-log \
python313-google-cloud-core \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-opentelemetry-api \
python313-proto-plus \
python313-protobuf"

inherit rpm
