SUMMARY = "Microsoft Azure Monitor Opentelemetry Exporter Client Library for Python"
DESCRIPTION = "The exporter for Azure Monitor allows you to export tracing data utilizing the \
OpenTelemetry SDK and send telemetry data to Azure Monitor for applications \
written in Python."
LICENSE = "MIT"

PV = "1.0.0b22"

RPM_NAME = "python314-azure-monitor-opentelemetry-exporter-1.0.0b22-2.9.noarch.rpm"
RPM_HASH = "bf72115ec6fc5585c96d2e3075bae4fe76e364f2be66d86bb1921887719092dc77426b9bf744dcd61fc1ef03b2b19294d718a509a5c362f76acb34889788640b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-monitor-opentelemetry-exporter \
python314-azure-monitor-opentelemetry-exporter \
python3dist-azure-monitor-opentelemetry-exporter"

RDEPENDS:${PN} += "-python314-azure-core >= 1.23.0 with python314-azure-core < 2.0.0 \
-python314-opentelemetry-api >= 1.21 with python314-opentelemetry-api < 2.0.0 \
-python314-opentelemetry-sdk >= 1.21 with python314-opentelemetry-sdk < 2.0.0 \
python-abi \
python314-azure-monitor-nspkg \
python314-azure-nspkg \
python314-fixedint \
python314-msrest"

inherit rpm
