SUMMARY = "OpenTelemetry FastAPI Instrumentation"
DESCRIPTION = "This library provides automatic and manual instrumentation of FastAPI web frameworks, \
instrumenting http requests served by applications utilizing the framework. \
 \
Auto-instrumentation using the opentelemetry-instrumentation package is also supported."
LICENSE = "Apache-2.0"

PV = "0.63b1"

RPM_NAME = "python314-opentelemetry-instrumentation-fastapi-0.63b1-1.2.noarch.rpm"
RPM_HASH = "f78c9eecb86cdf0b5788516d8e5d58013a38f004a73a15b402421d3b86a5fb71da42e454599e376ecafa4afb5200aa5000cd7de740e2fb08f394052f6650bba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-instrumentation-fastapi \
python314-opentelemetry-instrumentation-fastapi \
python3dist-opentelemetry-instrumentation-fastapi"

RDEPENDS:${PN} += "python-abi \
python314-opentelemetry-api \
python314-opentelemetry-instrumentation \
python314-opentelemetry-instrumentation-asgi \
python314-opentelemetry-semantic-conventions \
python314-opentelemetry-util-http"

inherit rpm
