SUMMARY = "Google Cloud Logging exporter for OpenTelemetry"
DESCRIPTION = "Google Cloud Logging exporter for OpenTelemetry."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "python314-opentelemetry-exporter-gcp-logging-1.12.0-1.2.noarch.rpm"
RPM_HASH = "30b8e3b25113fffd6a466d3c89d75e59b862007111852bb573269ac419ab4b678900cfdc815a85ca9e04cb1db237785ff2572810c0fc4762d827eef7c307f12b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-exporter-gcp-logging \
python314-opentelemetry-exporter-gcp-logging \
python3dist-opentelemetry-exporter-gcp-logging"

RDEPENDS:${PN} += "python-abi \
python314-google-cloud-logging \
python314-opentelemetry-api \
python314-opentelemetry-resourcedetector-gcp \
python314-opentelemetry-sdk"

inherit rpm
