SUMMARY = "Google Cloud Monitoring exporter for OpenTelemetry"
DESCRIPTION = "This library provides support for exporting metrics to Google Cloud Monitoring."
LICENSE = "Apache-2.0"

PV = "1.11.0~a0"

RPM_NAME = "python314-opentelemetry-exporter-gcp-monitoring-1.11.0~a0-1.2.noarch.rpm"
RPM_HASH = "1cd988968afcf8f55575d84aef0f40f95fb05b7a9d7095da7e24c64d48830bf0122c04d18c055e61508aa057abc4f7a09046a7200d03dfa61b4eca556522d679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-exporter-gcp-monitoring \
python314-opentelemetry-exporter-gcp-monitoring \
python3dist-opentelemetry-exporter-gcp-monitoring"

RDEPENDS:${PN} += "python-abi \
python314-google-cloud-monitoring \
python314-opentelemetry-api \
python314-opentelemetry-resourcedetector-gcp \
python314-opentelemetry-sdk"

inherit rpm
