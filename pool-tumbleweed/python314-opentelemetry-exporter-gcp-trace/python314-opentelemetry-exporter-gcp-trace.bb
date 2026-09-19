SUMMARY = "Google Cloud Trace exporter for OpenTelemetry"
DESCRIPTION = "This library provides support for exporting traces to Google Cloud Trace."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "python314-opentelemetry-exporter-gcp-trace-1.12.0-1.1.noarch.rpm"
RPM_HASH = "44d55744a02395cffbfb964b4dbe77dab8c2d1f24756d57e879c804463fd6333e3a5ce7ac8dfb2198827429ef88a54132c481d0b905b1d5dc6006858115f1b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-exporter-gcp-trace \
python314-opentelemetry-exporter-gcp-trace \
python3dist-opentelemetry-exporter-gcp-trace"

RDEPENDS:${PN} += "python-abi \
python314-google-cloud-trace \
python314-opentelemetry-api \
python314-opentelemetry-resourcedetector-gcp \
python314-opentelemetry-sdk"

inherit rpm
