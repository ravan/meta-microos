SUMMARY = "OpenTelemetry Python Proto"
DESCRIPTION = "This library contains the generated code for OpenTelemetry protobuf data model. \
The code in the current package was generated using the v1.9.0 release_ of \
opentelemetry-proto."
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python314-opentelemetry-proto-1.43.0-1.1.noarch.rpm"
RPM_HASH = "92c17e39c017100b33669ff4dcc3830070811a001d54d3ab2a35a03445828f761110071e88292d3b6e5f9e7b4477a99042d9f4b5effa2c4c3f2b7ab59902e7a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-proto \
python314-opentelemetry-proto \
python3dist-opentelemetry-proto"

RDEPENDS:${PN} += "python-abi \
python314-protobuf"

inherit rpm
