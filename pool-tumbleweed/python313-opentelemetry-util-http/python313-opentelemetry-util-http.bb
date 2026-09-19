SUMMARY = "Instrumentation Tools & Auto Instrumentation for OpenTelemetry Python"
DESCRIPTION = "Instrumentation Tools & Auto Instrumentation for OpenTelemetry Python"
LICENSE = "Apache-2.0"

PV = "0.64b0"

RPM_NAME = "python313-opentelemetry-util-http-0.64b0-1.1.noarch.rpm"
RPM_HASH = "3afe523fb6555522dcf7c1807e168d1ca7f169e288957b5474651ee3c98010b3703b287fbd44d545776cf4478aae6aba3d3548233d69b7414e4753445a8d351f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-util-http \
python3.13dist-opentelemetry-util-http \
python313-opentelemetry-util-http \
python3dist-opentelemetry-util-http"

RDEPENDS:${PN} += "python-abi"

inherit rpm
