SUMMARY = "OpenTelemetry Collector Protobuf over gRPC Exporter"
DESCRIPTION = "OpenTelemetry Collector Protobuf over gRPC Exporter \
 \
This library allows to export data to the OpenTelemetry Collector using the \
OpenTelemetry Protocol using Protobuf over gRPC."
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python314-opentelemetry-exporter-otlp-proto-grpc-1.43.0-1.1.noarch.rpm"
RPM_HASH = "ea249bdb76e62c2e33c886d6d6a7d231a3d7acd36b37ba2a18988fbc990deade745806926ceeafd6a07ec94dcc513656978b807cfa1de985ad37612932334ea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-exporter-otlp-proto-grpc \
python314-opentelemetry-exporter-otlp-proto-grpc \
python3dist-opentelemetry-exporter-otlp-proto-grpc"

RDEPENDS:${PN} += "python-abi \
python314-googleapis-common-protos \
python314-grpcio \
python314-opentelemetry-api \
python314-opentelemetry-exporter-otlp-proto-common \
python314-opentelemetry-proto \
python314-opentelemetry-sdk \
python314-typing-extensions"

inherit rpm
