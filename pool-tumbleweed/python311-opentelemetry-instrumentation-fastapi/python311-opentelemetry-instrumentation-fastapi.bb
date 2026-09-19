SUMMARY = "OpenTelemetry FastAPI Instrumentation"
DESCRIPTION = "This library provides automatic and manual instrumentation of FastAPI web frameworks, \
instrumenting http requests served by applications utilizing the framework. \
 \
Auto-instrumentation using the opentelemetry-instrumentation package is also supported."
LICENSE = "Apache-2.0"

PV = "0.62b1"

RPM_NAME = "python311-opentelemetry-instrumentation-fastapi-0.62b1-1.1.noarch.rpm"
RPM_HASH = "fa8b492c8c77d5db642a3f02514d2d03357cd40464d5b2fff801f437baad01099f6a74b84fba30346b1375b83fa974e41f02d6b158bce679134a625443d82b66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-opentelemetry-instrumentation-fastapi \
python311-opentelemetry-instrumentation-fastapi \
python3dist-opentelemetry-instrumentation-fastapi"

RDEPENDS:${PN} += "python-abi \
python311-opentelemetry-api \
python311-opentelemetry-instrumentation \
python311-opentelemetry-instrumentation-asgi \
python311-opentelemetry-semantic-conventions \
python311-opentelemetry-util-http"

inherit rpm
