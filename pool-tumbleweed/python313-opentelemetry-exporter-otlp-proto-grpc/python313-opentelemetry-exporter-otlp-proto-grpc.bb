SUMMARY = "OpenTelemetry Collector Protobuf over gRPC Exporter"
DESCRIPTION = "OpenTelemetry Collector Protobuf over gRPC Exporter \
 \
This library allows to export data to the OpenTelemetry Collector using the \
OpenTelemetry Protocol using Protobuf over gRPC."
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python313-opentelemetry-exporter-otlp-proto-grpc-1.43.0-1.1.noarch.rpm"
RPM_HASH = "7723079c697297f31bbd7cc94875858fce944dd2d2e47d1ad34a05752a3b90c805d50df1d88d522b5b61241145719d7f5da8ab7737532f7613585c70b65c9a85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-exporter-otlp-proto-grpc \
python3.13dist-opentelemetry-exporter-otlp-proto-grpc \
python313-opentelemetry-exporter-otlp-proto-grpc \
python3dist-opentelemetry-exporter-otlp-proto-grpc"

RDEPENDS:${PN} += "python-abi \
python313-googleapis-common-protos \
python313-grpcio \
python313-opentelemetry-api \
python313-opentelemetry-exporter-otlp-proto-common \
python313-opentelemetry-proto \
python313-opentelemetry-sdk \
python313-typing-extensions"

inherit rpm
