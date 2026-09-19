SUMMARY = "OpenTelemetry Protobuf encoding"
DESCRIPTION = "This library is provided as a convenience to encode to Protobuf. Currently used by: \
 \
* opentelemetry-exporter-otlp-proto-grpc \
* opentelemetry-exporter-otlp-proto-http"
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python313-opentelemetry-exporter-otlp-proto-common-1.43.0-1.1.noarch.rpm"
RPM_HASH = "ad7ceacc9aec189a37a8836cdab904d2ec72f3ac6269726fb0b81c64c2dc3b2c1933590e22f0403525670f1a78df5ff644be48ba208f0f74e13ad148dcbf6ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-exporter-otlp-proto-common \
python3.13dist-opentelemetry-exporter-otlp-proto-common \
python313-opentelemetry-exporter-otlp-proto-common \
python3dist-opentelemetry-exporter-otlp-proto-common"

RDEPENDS:${PN} += "python-abi \
python313-opentelemetry-proto"

inherit rpm
