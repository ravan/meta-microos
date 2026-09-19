SUMMARY = "Google Cloud Pub/Sub API client library"
DESCRIPTION = "Google Cloud Pub/Sub API client library"
LICENSE = "Apache-2.0"

PV = "2.40.0"

RPM_NAME = "python313-google-cloud-pubsub-2.40.0-1.1.noarch.rpm"
RPM_HASH = "66d425f53c486dbaf15f6d29d498e3e931e9cf3341559fdf81dfb786e936e391b607a022fcf3510fd9faa1ee126425d7fca6e4fe412cd9fb329ed6fdbbc4e927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-pubsub \
python3.13dist-google-cloud-pubsub \
python313-google-cloud-pubsub \
python3dist-google-cloud-pubsub"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpc-google-iam-v1 \
python313-grpcio \
python313-grpcio-status \
python313-opentelemetry-api \
python313-opentelemetry-sdk \
python313-proto-plus \
python313-protobuf"

inherit rpm
