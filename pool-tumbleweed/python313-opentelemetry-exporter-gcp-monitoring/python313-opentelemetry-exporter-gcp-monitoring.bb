SUMMARY = "Google Cloud Monitoring exporter for OpenTelemetry"
DESCRIPTION = "This library provides support for exporting metrics to Google Cloud Monitoring."
LICENSE = "Apache-2.0"

PV = "1.11.0~a0"

RPM_NAME = "python313-opentelemetry-exporter-gcp-monitoring-1.11.0~a0-1.2.noarch.rpm"
RPM_HASH = "ac98d4c9792dcb92270fb42b79caa3676290288a2cbf50eedd073874c9d4788e3fe0f1626563bb6ef016e8405085c6062d193bdba3d2f637c2fe08b4963d5002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-exporter-gcp-monitoring \
python3.13dist-opentelemetry-exporter-gcp-monitoring \
python313-opentelemetry-exporter-gcp-monitoring \
python3dist-opentelemetry-exporter-gcp-monitoring"

RDEPENDS:${PN} += "python-abi \
python313-google-cloud-monitoring \
python313-opentelemetry-api \
python313-opentelemetry-resourcedetector-gcp \
python313-opentelemetry-sdk"

inherit rpm
