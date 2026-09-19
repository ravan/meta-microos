SUMMARY = "OpenTelemetry Python API"
DESCRIPTION = "OpenTelemetry Python API"
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python313-opentelemetry-api-1.43.0-1.1.noarch.rpm"
RPM_HASH = "69f9838887a155ad8fd983594c8ddca085bd03be0eea62a0a591cdb672d01a88b5e5c87edc1981b3ad842bab1656298fb8d63334202037e92526c8317794c35c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-api \
python3.13dist-opentelemetry-api \
python313-opentelemetry-api \
python3dist-opentelemetry-api"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
