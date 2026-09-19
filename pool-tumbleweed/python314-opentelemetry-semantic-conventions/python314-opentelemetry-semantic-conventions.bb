SUMMARY = "OpenTelemetry Semantic Conventions"
DESCRIPTION = "This library contains generated code for the semantic conventions \
defined by the OpenTelemetry specification."
LICENSE = "Apache-2.0"

PV = "0.64b0"

RPM_NAME = "python314-opentelemetry-semantic-conventions-0.64b0-1.1.noarch.rpm"
RPM_HASH = "5d92e1b0c63a769660cba172b20e9b710705f115aaea2c90b3ae317c87ce174d9b69f8ae059c88a1866f3e5e03e38007f410758ba01aa7b19a87930430833209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-semantic-conventions \
python314-opentelemetry-semantic-conventions \
python3dist-opentelemetry-semantic-conventions"

RDEPENDS:${PN} += "python-abi \
python314-opentelemetry-api \
python314-typing-extensions"

inherit rpm
