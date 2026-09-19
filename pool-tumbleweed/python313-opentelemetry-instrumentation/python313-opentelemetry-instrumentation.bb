SUMMARY = "Instrumentation Tools & Auto Instrumentation for OpenTelemetry Python"
DESCRIPTION = "Instrumentation Tools & Auto Instrumentation for OpenTelemetry Python"
LICENSE = "Apache-2.0"

PV = "0.64b0"

RPM_NAME = "python313-opentelemetry-instrumentation-0.64b0-1.1.noarch.rpm"
RPM_HASH = "a7bde2db4523938e85ac8ecb9f378937f85c0c695615c70ffd55757c7c7f9491f27b5d99d2f8fe5fa4c12262b1d34430d3a72b6e141e0496b3040309242d5f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-instrumentation \
python3.13dist-opentelemetry-instrumentation \
python313-opentelemetry-instrumentation \
python3dist-opentelemetry-instrumentation"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-opentelemetry-api \
python313-opentelemetry-semantic-conventions \
python313-packaging \
python313-wrapt \
update-alternatives"

inherit rpm
