SUMMARY = "Google Cloud resource detector for OpenTelemetry"
DESCRIPTION = "This library provides support for detecting GCP resources like GCE, GKE, etc."
LICENSE = "Apache-2.0"

PV = "1.9.0a0"

RPM_NAME = "python313-opentelemetry-resourcedetector-gcp-1.9.0a0-1.5.noarch.rpm"
RPM_HASH = "aea7ae5c1cb7e6723df6b8f3750e2d83495ca8287b6dd05a49ce50c70e9af0b8eeedec1b484f77690a1eec40ad0c9340c189e5d89ff6430a9d6e1557bcb9fbfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-resourcedetector-gcp \
python3.13dist-opentelemetry-resourcedetector-gcp \
python313-opentelemetry-resourcedetector-gcp \
python3dist-opentelemetry-resourcedetector-gcp"

RDEPENDS:${PN} += "python-abi \
python313-opentelemetry-api \
python313-opentelemetry-sdk \
python313-requests \
python313-typing-extensions"

inherit rpm
