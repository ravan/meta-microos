SUMMARY = "OpenTelemetry Python SDK"
DESCRIPTION = "OpenTelemetry Python SDK for the OpenTelemetry Project <https://opentelemetry.io/>"
LICENSE = "Apache-2.0"

PV = "1.43.0"

RPM_NAME = "python313-opentelemetry-sdk-1.43.0-1.1.noarch.rpm"
RPM_HASH = "4d866ee4bb0d2b13260af9446e19919c068786481ee6595cfc8e0b1ada711565c6a5a5bdaae3c74c8bf82fad71aececac15b834c63bf34210256d8b61b40175f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-sdk \
python3.13dist-opentelemetry-sdk \
python313-opentelemetry-sdk \
python3dist-opentelemetry-sdk"

RDEPENDS:${PN} += "python-abi \
python313-opentelemetry-api \
python313-opentelemetry-semantic-conventions \
python313-typing-extensions"

inherit rpm
