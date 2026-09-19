SUMMARY = "Google Cloud Compute API client library"
DESCRIPTION = "Google Cloud Compute API client library"
LICENSE = "Apache-2.0"

PV = "1.51.0"

RPM_NAME = "python314-google-cloud-compute-1.51.0-1.1.noarch.rpm"
RPM_HASH = "b56c6fb3196ae1bcfdeb90c4c246c609ead8bdde00d04c78122859e7fe7a352b936a7c071fd2fcb5cd8752d2b1107475dbbad2a4c18612364711435cc81c87e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-compute \
python314-google-cloud-compute \
python3dist-google-cloud-compute"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
