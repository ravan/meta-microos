SUMMARY = "Google Cloud Trace API client library"
DESCRIPTION = "Google Cloud Trace API client library"
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python313-google-cloud-trace-1.19.0-1.2.noarch.rpm"
RPM_HASH = "d9e9de7444a49e5aeeff59bcbbc8ef4f6522e1a021ef782cbe0e14b617bf84bc8d53f315c9c079b102d0c9c10bb7274193dec147a523e19385ad9f0f4d4252f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-trace \
python3.13dist-google-cloud-trace \
python313-google-cloud-trace \
python3dist-google-cloud-trace"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-grpcio \
python313-proto-plus \
python313-protobuf"

inherit rpm
