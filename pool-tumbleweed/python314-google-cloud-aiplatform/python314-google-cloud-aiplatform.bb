SUMMARY = "Vertex AI API client library"
DESCRIPTION = "Vertex AI API client library."
LICENSE = "Apache-2.0"

PV = "1.147.0"

RPM_NAME = "python314-google-cloud-aiplatform-1.147.0-1.2.noarch.rpm"
RPM_HASH = "9481304b8ac5bc1f1e130cdda70c51ce1509f42566b734fd0ee2049927d56f1519886323a9b3dffcb0f9b808d634d979e7c3b39f581b937259585b83ffc696c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-aiplatform \
python314-google-cloud-aiplatform \
python3dist-google-cloud-aiplatform"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-docstring-parser \
python314-google-api-core \
python314-google-auth \
python314-google-cloud-bigquery \
python314-google-cloud-resource-manager \
python314-google-cloud-storage \
python314-google-genai \
python314-packaging \
python314-proto-plus \
python314-protobuf \
python314-pydantic \
python314-typing-extensions \
update-alternatives"

inherit rpm
