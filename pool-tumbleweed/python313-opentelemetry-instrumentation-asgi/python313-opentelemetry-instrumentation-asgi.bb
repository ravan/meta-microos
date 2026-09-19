SUMMARY = "ASGI instrumentation for OpenTelemetry"
DESCRIPTION = "This library provides a ASGI middleware that can be used on any ASGI framework \
(such as Django, Starlette, FastAPI or Quart) to track requests timing through \
OpenTelemetry."
LICENSE = "Apache-2.0"

PV = "0.63b1"

RPM_NAME = "python313-opentelemetry-instrumentation-asgi-0.63b1-1.1.noarch.rpm"
RPM_HASH = "b5f2a1347a9d4d3918a92a855aef53f038e1c015f6d7a1517cbc76262bcff2ff716f1efe13c02be93cd70bbc48d254e09e4bf7e399107bf89d7c2108c4d3d644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-instrumentation-asgi \
python3.13dist-opentelemetry-instrumentation-asgi \
python313-opentelemetry-instrumentation-asgi \
python3dist-opentelemetry-instrumentation-asgi"

RDEPENDS:${PN} += "python-abi \
python313-asgiref \
python313-opentelemetry-api \
python313-opentelemetry-instrumentation \
python313-opentelemetry-semantic-conventions \
python313-opentelemetry-util-http"

inherit rpm
