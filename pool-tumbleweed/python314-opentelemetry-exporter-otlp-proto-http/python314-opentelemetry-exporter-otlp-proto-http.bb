SUMMARY = "OpenTelemetry Collector Protobuf over HTTP Exporter"
DESCRIPTION = "This library allows to export data to the OpenTelemetry Collector using the \
OpenTelemetry Protocol using Protobuf over HTTP."
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python314-opentelemetry-exporter-otlp-proto-http-1.43.0-1.1.noarch.rpm"
RPM_HASH = "5b19fb005aa41e4df78be52b66706f86775a58190a994e2055ede4ffa61870a32bc99b988487bdf33f327c4075e43332788402dfbef36c9c68649def19e71091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-exporter-otlp-proto-http \
python314-opentelemetry-exporter-otlp-proto-http \
python3dist-opentelemetry-exporter-otlp-proto-http"

RDEPENDS:${PN} += "python-abi \
python314-googleapis-common-protos \
python314-opentelemetry-api \
python314-opentelemetry-exporter-otlp-proto-common \
python314-opentelemetry-proto \
python314-opentelemetry-sdk \
python314-requests \
python314-typing-extensions"

inherit rpm
