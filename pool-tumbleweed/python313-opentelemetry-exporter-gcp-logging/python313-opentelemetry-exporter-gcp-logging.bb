SUMMARY = "Google Cloud Logging exporter for OpenTelemetry"
DESCRIPTION = "Google Cloud Logging exporter for OpenTelemetry."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "python313-opentelemetry-exporter-gcp-logging-1.12.0-1.2.noarch.rpm"
RPM_HASH = "f47b7a3ef5a36174474e94b1ec89f9eb1fa804472e496ecda2e7fd1b139eb1642ff4b0d07dc8d38851bc4ecdca21e74347d4efff91e32fae20077d6ca18a9ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-exporter-gcp-logging \
python3.13dist-opentelemetry-exporter-gcp-logging \
python313-opentelemetry-exporter-gcp-logging \
python3dist-opentelemetry-exporter-gcp-logging"

RDEPENDS:${PN} += "python-abi \
python313-google-cloud-logging \
python313-opentelemetry-api \
python313-opentelemetry-resourcedetector-gcp \
python313-opentelemetry-sdk"

inherit rpm
