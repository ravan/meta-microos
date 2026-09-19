SUMMARY = "Google Cloud Pub/Sub API client library"
DESCRIPTION = "Google Cloud Pub/Sub API client library"
LICENSE = "Apache-2.0"

PV = "2.40.0"

RPM_NAME = "python314-google-cloud-pubsub-2.40.0-1.1.noarch.rpm"
RPM_HASH = "6619f87757b3239bde47da2b177c837b2e1b0151ff4831ba376dcc46e02ba238e076f18a64413df18f5dea9e16e41d213ff58d2d82baf5dc501332b8d26403a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-pubsub \
python314-google-cloud-pubsub \
python3dist-google-cloud-pubsub"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-grpcio-status \
python314-opentelemetry-api \
python314-opentelemetry-sdk \
python314-proto-plus \
python314-protobuf"

inherit rpm
