SUMMARY = "ASGI instrumentation for OpenTelemetry"
DESCRIPTION = "This library provides a ASGI middleware that can be used on any ASGI framework \
(such as Django, Starlette, FastAPI or Quart) to track requests timing through \
OpenTelemetry."
LICENSE = "Apache-2.0"

PV = "0.63b1"

RPM_NAME = "python311-opentelemetry-instrumentation-asgi-0.63b1-1.1.noarch.rpm"
RPM_HASH = "bde9ebedd401f897974616d2eedf3dfa4dfb2b3dbd655203091f09593b7d6979e64b4f60d1839fef2535f7dc3df3cde4a3cbefe3840242b1d9a38fc41c378cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-opentelemetry-instrumentation-asgi \
python311-opentelemetry-instrumentation-asgi \
python3dist-opentelemetry-instrumentation-asgi"

RDEPENDS:${PN} += "python-abi \
python311-asgiref \
python311-opentelemetry-api \
python311-opentelemetry-instrumentation \
python311-opentelemetry-semantic-conventions \
python311-opentelemetry-util-http"

inherit rpm
