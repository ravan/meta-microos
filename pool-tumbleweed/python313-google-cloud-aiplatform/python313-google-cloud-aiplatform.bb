SUMMARY = "Vertex AI API client library"
DESCRIPTION = "Vertex AI API client library."
LICENSE = "Apache-2.0"

PV = "1.147.0"

RPM_NAME = "python313-google-cloud-aiplatform-1.147.0-1.2.noarch.rpm"
RPM_HASH = "45e6642a1af707f241530e413b221d4f0842aed6ede3bd975717ef72ccb9dc54a03bfcfda64d2d3a5a94610911a9491b694add5e48d1ceccbe014bbd20a0d86f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-aiplatform \
python3.13dist-google-cloud-aiplatform \
python313-google-cloud-aiplatform \
python3dist-google-cloud-aiplatform"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-docstring-parser \
python313-google-api-core \
python313-google-auth \
python313-google-cloud-bigquery \
python313-google-cloud-resource-manager \
python313-google-cloud-storage \
python313-google-genai \
python313-packaging \
python313-proto-plus \
python313-protobuf \
python313-pydantic \
python313-typing-extensions \
update-alternatives"

inherit rpm
