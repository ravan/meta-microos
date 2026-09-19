SUMMARY = "Google Ai Generativelanguage API client library"
DESCRIPTION = "Google Ai Generativelanguage API client library."
LICENSE = "Apache-2.0"

PV = "0.6.10"

RPM_NAME = "python313-google-ai-generativelanguage-0.6.10-2.8.noarch.rpm"
RPM_HASH = "8bd191e41606f59e761380571757ccdff7af88443291a91d41e50ad8c1d23d0d4e0ea175e1f1e9148193b1168b07331c1a862a3f611d9e835e34e3c7bcb0ff6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-ai-generativelanguage \
python3.13dist-google-ai-generativelanguage \
python313-google-ai-generativelanguage \
python3dist-google-ai-generativelanguage"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-proto-plus \
python313-protobuf"

inherit rpm
