SUMMARY = "Azure Core Tracing OpenTelemetry client library for Python"
DESCRIPTION = "Azure Core Tracing OpenTelemetry client library for Python"
LICENSE = "MIT"

PV = "1.0.0b12"

RPM_NAME = "python314-azure-core-tracing-opentelemetry-1.0.0b12-1.5.noarch.rpm"
RPM_HASH = "17624b7d37defa83893b455d3ec810c385e82a05061289be42eaca52d01566a273df3ee3ff17cf4095bd7e8a16b40d9b0b2a5e9160f04458c03c5b857d2670ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-core-tracing-opentelemetry \
python314-azure-core-tracing-opentelemetry \
python3dist-azure-core-tracing-opentelemetry"

RDEPENDS:${PN} += "-python314-azure-core >= 1.24.0 with python314-azure-core < 2.0.0 \
-python314-opentelemetry-api >= 1.12.0 with python314-opentelemetry-api < 2.0.0 \
python-abi \
python314-azure-nspkg"

inherit rpm
