SUMMARY = "Google Ai Generativelanguage API client library"
DESCRIPTION = "Google Ai Generativelanguage API client library."
LICENSE = "Apache-2.0"

PV = "0.6.10"

RPM_NAME = "python314-google-ai-generativelanguage-0.6.10-2.8.noarch.rpm"
RPM_HASH = "171025f112a87076eb89d511f256f4b754d4ccd52682735a4227cb99869a4b789851ec2c3f7d3c32914ddeab73c6fc535046be36c1a7616ad099bfa7dab00600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-ai-generativelanguage \
python314-google-ai-generativelanguage \
python3dist-google-ai-generativelanguage"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-proto-plus \
python314-protobuf"

inherit rpm
