SUMMARY = "OpenTelemetry Collector Protobuf over HTTP Exporter"
DESCRIPTION = "This library allows to export data to the OpenTelemetry Collector using the \
OpenTelemetry Protocol using Protobuf over HTTP."
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python313-opentelemetry-exporter-otlp-proto-http-1.43.0-1.1.noarch.rpm"
RPM_HASH = "a4bead3a66c4f7d8d6fdce44cd7a5ad82a8c84cac739cd5bb3de87bc9ce43f8802a0048483406c6d5145703b5e3aead741928d402320092c10da315c9753570d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-exporter-otlp-proto-http \
python3.13dist-opentelemetry-exporter-otlp-proto-http \
python313-opentelemetry-exporter-otlp-proto-http \
python3dist-opentelemetry-exporter-otlp-proto-http"

RDEPENDS:${PN} += "python-abi \
python313-googleapis-common-protos \
python313-opentelemetry-api \
python313-opentelemetry-exporter-otlp-proto-common \
python313-opentelemetry-proto \
python313-opentelemetry-sdk \
python313-requests \
python313-typing-extensions"

inherit rpm
