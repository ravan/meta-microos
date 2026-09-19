SUMMARY = "OpenTelemetry FastAPI Instrumentation"
DESCRIPTION = "This library provides automatic and manual instrumentation of FastAPI web frameworks, \
instrumenting http requests served by applications utilizing the framework. \
 \
Auto-instrumentation using the opentelemetry-instrumentation package is also supported."
LICENSE = "Apache-2.0"

PV = "0.63b1"

RPM_NAME = "python313-opentelemetry-instrumentation-fastapi-0.63b1-1.2.noarch.rpm"
RPM_HASH = "bbd922525fd98f4f6704adde3da2b70b23ab665ec35d4d68602a41e7bb4fee456b8524ffce10caddc89ed21cf54be0bf2a78c884bf58b75408cc235d08ff596e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-instrumentation-fastapi \
python3.13dist-opentelemetry-instrumentation-fastapi \
python313-opentelemetry-instrumentation-fastapi \
python3dist-opentelemetry-instrumentation-fastapi"

RDEPENDS:${PN} += "python-abi \
python313-opentelemetry-api \
python313-opentelemetry-instrumentation \
python313-opentelemetry-instrumentation-asgi \
python313-opentelemetry-semantic-conventions \
python313-opentelemetry-util-http"

inherit rpm
