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

RPM_NAME = "python313-opentelemetry-exporter-otlp-1.43.0-1.1.noarch.rpm"
RPM_HASH = "63cf52eaa85ce7fe5f612788152816025642eca9ce2457b5ba3b3dc09a4eb82ca435874d367239a7e80261faeac9e0fab84204ee9f184d5be8cf7929f015c5e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-exporter-otlp \
python3.13dist-opentelemetry-exporter-otlp \
python313-opentelemetry-exporter-otlp \
python3dist-opentelemetry-exporter-otlp"

RDEPENDS:${PN} += "python-abi \
python313-opentelemetry-exporter-otlp-proto-grpc \
python313-opentelemetry-exporter-otlp-proto-http"

inherit rpm
