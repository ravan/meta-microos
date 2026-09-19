SUMMARY = "ASGI instrumentation for OpenTelemetry"
DESCRIPTION = "This library provides a ASGI middleware that can be used on any ASGI framework \
(such as Django, Starlette, FastAPI or Quart) to track requests timing through \
OpenTelemetry."
LICENSE = "Apache-2.0"

PV = "0.63b1"

RPM_NAME = "python314-opentelemetry-instrumentation-asgi-0.63b1-1.1.noarch.rpm"
RPM_HASH = "dc30e9b4dcc7c432daaad06fb125503f48b30921b3e899b204646a3c98b726b80962098dcea74d62d70e1810caa56fecd822c38c36f9cf200bcfd2dbadd0ef4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-instrumentation-asgi \
python314-opentelemetry-instrumentation-asgi \
python3dist-opentelemetry-instrumentation-asgi"

RDEPENDS:${PN} += "python-abi \
python314-asgiref \
python314-opentelemetry-api \
python314-opentelemetry-instrumentation \
python314-opentelemetry-semantic-conventions \
python314-opentelemetry-util-http"

inherit rpm
