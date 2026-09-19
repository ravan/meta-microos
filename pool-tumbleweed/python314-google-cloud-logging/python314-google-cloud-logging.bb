SUMMARY = "Stackdriver Logging API client library"
DESCRIPTION = "Stackdriver Logging API client library"
LICENSE = "Apache-2.0"

PV = "3.16.3"

RPM_NAME = "python314-google-cloud-logging-3.16.3-1.1.noarch.rpm"
RPM_HASH = "f4f2c92801596ff4344e3ca03bb9e3e1a3a5366ee0f5df2edde238e0e585786b14f4f8de152abceff9e978ba8ca5749dd0a660b97732e01a5eb0541245a1d45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-logging \
python314-google-cloud-logging \
python3dist-google-cloud-logging"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-google-cloud-appengine-logging \
python314-google-cloud-audit-log \
python314-google-cloud-core \
python314-grpc-google-iam-v1 \
python314-grpcio \
python314-opentelemetry-api \
python314-proto-plus \
python314-protobuf"

inherit rpm
