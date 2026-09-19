SUMMARY = "Google Cloud Trace API client library"
DESCRIPTION = "Google Cloud Trace API client library"
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python314-google-cloud-trace-1.19.0-1.2.noarch.rpm"
RPM_HASH = "a7d8dd1fa215c805584b600fb21c6d91242a09bdbb01e15141654a466e4f060536116e8ca67332a73fb642bce5888b06618e9b652038d969a62b848eff5c4d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-trace \
python314-google-cloud-trace \
python3dist-google-cloud-trace"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
