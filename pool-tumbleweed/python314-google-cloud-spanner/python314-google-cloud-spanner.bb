SUMMARY = "Google Cloud Spanner API client library"
DESCRIPTION = "Google Cloud Spanner API client library"
LICENSE = "Apache-2.0"

PV = "3.69.1"

RPM_NAME = "python314-google-cloud-spanner-3.69.1-1.1.noarch.rpm"
RPM_HASH = "9dc9a3aea0c5305ff1f8a0f593fc4847bf8e0240aca8701b2c019a139aa08447db505ce5bccc37668438a35ef840e6cb6b7bd539a03e27f1d7507da585a96b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-spanner \
python314-google-cloud-spanner \
python3dist-google-cloud-spanner"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-cloud-core \
python314-grpc-google-iam-v1 \
python314-grpc-interceptor \
python314-grpcio \
python314-proto-plus \
python314-protobuf \
python314-sqlparse"

inherit rpm
