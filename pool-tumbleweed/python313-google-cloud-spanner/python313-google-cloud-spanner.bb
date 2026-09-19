SUMMARY = "Google Cloud Spanner API client library"
DESCRIPTION = "Google Cloud Spanner API client library"
LICENSE = "Apache-2.0"

PV = "3.69.1"

RPM_NAME = "python313-google-cloud-spanner-3.69.1-1.1.noarch.rpm"
RPM_HASH = "37ca44b62055d0fbf7cb10b1e1ba548735a0fc5f155c727f571976d77bb37248b56f53d0173744eb93e18e58367472dcf7304638a6bfea588894cb0a28f758e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-spanner \
python3.13dist-google-cloud-spanner \
python313-google-cloud-spanner \
python3dist-google-cloud-spanner"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-cloud-core \
python313-grpc-google-iam-v1 \
python313-grpc-interceptor \
python313-grpcio \
python313-proto-plus \
python313-protobuf \
python313-sqlparse"

inherit rpm
