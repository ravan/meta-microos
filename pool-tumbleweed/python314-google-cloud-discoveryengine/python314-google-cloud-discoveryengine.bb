SUMMARY = "Google Cloud Discoveryengine API client library"
DESCRIPTION = "Google Cloud Discoveryengine API client library."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "python314-google-cloud-discoveryengine-0.18.0-1.2.noarch.rpm"
RPM_HASH = "cca32e1bf65d0feea620d4914588fe58fc482f1526b82755e1023b2f63156f997166b1636d9eb57e1f63f3bbf0e7263fa9b9baf79040545893f63f9a86f20ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-discoveryengine \
python314-google-cloud-discoveryengine \
python3dist-google-cloud-discoveryengine"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
