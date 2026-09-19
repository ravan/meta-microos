SUMMARY = "Google Cloud Appengine Logging API client library"
DESCRIPTION = "Google Cloud Appengine Logging API client library"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "python314-google-cloud-appengine-logging-1.10.0-1.1.noarch.rpm"
RPM_HASH = "12999093bfe824d208ef7f2636ebcc5cdace0208d14f05faa0bf44c101c0e141185984072fc7c51f6bf3116ef1bcde7e79dbf7edb7fba2dda6e094f53888919a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-appengine-logging \
python314-google-cloud-appengine-logging \
python3dist-google-cloud-appengine-logging"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-grpcio \
python314-proto-plus \
python314-protobuf"

inherit rpm
