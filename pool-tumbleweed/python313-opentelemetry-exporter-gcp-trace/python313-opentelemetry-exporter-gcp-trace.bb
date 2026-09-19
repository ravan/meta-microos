SUMMARY = "Google Cloud Trace exporter for OpenTelemetry"
DESCRIPTION = "This library provides support for exporting traces to Google Cloud Trace."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "python313-opentelemetry-exporter-gcp-trace-1.12.0-1.1.noarch.rpm"
RPM_HASH = "3f83e601cdc9ad2288454329854ba72fd6c11a87097a13e47af3b587cc2141d7b18f3a8d4619732d30bcc405b4b1ac03a20dd53bb54b589057582b230d02ec79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-exporter-gcp-trace \
python3.13dist-opentelemetry-exporter-gcp-trace \
python313-opentelemetry-exporter-gcp-trace \
python3dist-opentelemetry-exporter-gcp-trace"

RDEPENDS:${PN} += "python-abi \
python313-google-cloud-trace \
python313-opentelemetry-api \
python313-opentelemetry-resourcedetector-gcp \
python313-opentelemetry-sdk"

inherit rpm
