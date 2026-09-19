SUMMARY = "Microsoft Azure Monitor Opentelemetry Exporter Client Library for Python"
DESCRIPTION = "The exporter for Azure Monitor allows you to export tracing data utilizing the \
OpenTelemetry SDK and send telemetry data to Azure Monitor for applications \
written in Python."
LICENSE = "MIT"

PV = "1.0.0b22"

RPM_NAME = "python313-azure-monitor-opentelemetry-exporter-1.0.0b22-2.9.noarch.rpm"
RPM_HASH = "ae49c9ed5a029d8a23f705670a43f13b91c5be24fc26968c88e7cfa2382f89e9c46f4efef2c19fee031c197f6f05f201b1319610b89f9f71fd0d273bbf5afc83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-opentelemetry-exporter \
python3.13dist-azure-monitor-opentelemetry-exporter \
python313-azure-monitor-opentelemetry-exporter \
python3dist-azure-monitor-opentelemetry-exporter"

RDEPENDS:${PN} += "-python313-azure-core >= 1.23.0 with python313-azure-core < 2.0.0 \
-python313-opentelemetry-api >= 1.21 with python313-opentelemetry-api < 2.0.0 \
-python313-opentelemetry-sdk >= 1.21 with python313-opentelemetry-sdk < 2.0.0 \
python-abi \
python313-azure-monitor-nspkg \
python313-azure-nspkg \
python313-fixedint \
python313-msrest"

inherit rpm
