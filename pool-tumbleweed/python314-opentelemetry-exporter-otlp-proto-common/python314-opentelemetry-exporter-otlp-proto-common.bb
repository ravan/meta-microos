SUMMARY = "OpenTelemetry Protobuf encoding"
DESCRIPTION = "This library is provided as a convenience to encode to Protobuf. Currently used by: \
 \
* opentelemetry-exporter-otlp-proto-grpc \
* opentelemetry-exporter-otlp-proto-http"
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python314-opentelemetry-exporter-otlp-proto-common-1.43.0-1.1.noarch.rpm"
RPM_HASH = "b9c508480c7c980119202bd9e23160d16cad9f91e3ff0478ce3f323a6d7ceea25d81041cc935f321daf2564da4be21e75178542ba64a55aec11285e52603a171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-exporter-otlp-proto-common \
python314-opentelemetry-exporter-otlp-proto-common \
python3dist-opentelemetry-exporter-otlp-proto-common"

RDEPENDS:${PN} += "python-abi \
python314-opentelemetry-proto"

inherit rpm
