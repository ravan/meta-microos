SUMMARY = "Instrumentation Tools & Auto Instrumentation for OpenTelemetry Python"
DESCRIPTION = "Instrumentation Tools & Auto Instrumentation for OpenTelemetry Python"
LICENSE = "Apache-2.0"

PV = "0.64b0"

RPM_NAME = "python314-opentelemetry-util-http-0.64b0-1.1.noarch.rpm"
RPM_HASH = "7b5bc561a84c5b1fe2c4a07ba8881a5e7f80b194f3e132254208956425fd995b824ff2fa5ea86c85d1acb261bd6e3cbf17d6630300cc9875ee96400855f50bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-util-http \
python314-opentelemetry-util-http \
python3dist-opentelemetry-util-http"

RDEPENDS:${PN} += "python-abi"

inherit rpm
