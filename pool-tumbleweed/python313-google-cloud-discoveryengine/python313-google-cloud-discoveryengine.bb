SUMMARY = "Google Cloud Discoveryengine API client library"
DESCRIPTION = "Google Cloud Discoveryengine API client library."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "python313-google-cloud-discoveryengine-0.18.0-1.2.noarch.rpm"
RPM_HASH = "5cf04703ee0e721659ed5b6c90a2f0539fd929eac20c1a3af91a70f964c02ff0c4dd969d3ca6a7c755de81a09fcaecba60b507ed91339c99d4e8b616e26001c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-discoveryengine \
python3.13dist-google-cloud-discoveryengine \
python313-google-cloud-discoveryengine \
python3dist-google-cloud-discoveryengine"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
