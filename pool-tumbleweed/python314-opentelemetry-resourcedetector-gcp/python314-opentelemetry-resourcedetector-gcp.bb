SUMMARY = "Google Cloud resource detector for OpenTelemetry"
DESCRIPTION = "This library provides support for detecting GCP resources like GCE, GKE, etc."
LICENSE = "Apache-2.0"

PV = "1.9.0a0"

RPM_NAME = "python314-opentelemetry-resourcedetector-gcp-1.9.0a0-1.5.noarch.rpm"
RPM_HASH = "7ff1f0d02b9e46e213e7fe3347c8f5f6549359ed857893fdc86fc40f974eff8bdb021668c88de15ec9c3ae96c17e969f0c710199dba07d084b92ecaf9558d657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-resourcedetector-gcp \
python314-opentelemetry-resourcedetector-gcp \
python3dist-opentelemetry-resourcedetector-gcp"

RDEPENDS:${PN} += "python-abi \
python314-opentelemetry-api \
python314-opentelemetry-sdk \
python314-requests \
python314-typing-extensions"

inherit rpm
