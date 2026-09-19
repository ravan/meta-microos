SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b12"

RPM_NAME = "python313-azure-core-tracing-opentelemetry-1.0.0b12-1.5.noarch.rpm"
RPM_HASH = "1ea45e6417d41b4e93b8808e8dca561be73e18788d324e73d58012bed0af5976519b6d8e230feafc487119e17cd08d5495d8b0cef48d604955bd027f8507de33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-core-tracing-opentelemetry \
python3.13dist-azure-core-tracing-opentelemetry \
python313-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "-python313-azure-core >= 1.24.0 with python313-azure-core < 2.0.0 \
-python313-opentelemetry-api >= 1.12.0 with python313-opentelemetry-api < 2.0.0 \
python-abi \
python313-azure-nspkg"

inherit rpm
