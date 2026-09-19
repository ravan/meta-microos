SUMMARY = "Google Cloud Domains API client library"
DESCRIPTION = "Google Cloud Domains API client library"
LICENSE = "Apache-2.0"

PV = "1.14.0"

RPM_NAME = "python314-google-cloud-domains-1.14.0-1.1.noarch.rpm"
RPM_HASH = "fca1e62bef5930b9156c474215ffbb557f1b7d16329c870c1a03bee8097a1f83420c1bb79d46c3e151acf6dc11ca814b95ed937198c108ef51750dd7a0ee74ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-domains \
python314-google-cloud-domains \
python3dist-google-cloud-domains"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
