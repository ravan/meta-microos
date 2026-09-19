SUMMARY = "OpenTelemetry Collector Exporters"
DESCRIPTION = "OpenTelemetry Collector Exporters \
 \
This library is provided as a convenience to install all supported \
OpenTelemetry Collector Exporters. Currently it installs: \
 \
* opentelemetry-exporter-otlp-proto-grpc \
* opentelemetry-exporter-otlp-proto-http \
 \
In the future, additional packages will be available: \
* opentelemetry-exporter-otlp-json-http \
 \
To avoid unnecessary dependencies, users should install the specific package \
once they've determined their preferred serialization and protocol method."
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python314-opentelemetry-exporter-otlp-1.43.0-1.1.noarch.rpm"
RPM_HASH = "be8cf2b443377cd24c1508ec84fe6fc1e0a226d3a9f1f49c6dc3196c0f7d12688ef38bbafcec61058d34a09c1798b7e4a3f448c73a7c4efff460174ee9b544fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-exporter-otlp \
python314-opentelemetry-exporter-otlp \
python3dist-opentelemetry-exporter-otlp"

RDEPENDS:${PN} += "python-abi \
python314-opentelemetry-exporter-otlp-proto-grpc \
python314-opentelemetry-exporter-otlp-proto-http"

inherit rpm
