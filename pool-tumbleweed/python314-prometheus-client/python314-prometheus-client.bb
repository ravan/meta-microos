SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python client for Prometheus."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "0.25.0"

RPM_NAME = "python314-prometheus-client-0.25.0-1.2.noarch.rpm"
RPM_HASH = "73a063adb0c7c91719f8939c1ffc851033c57379bec840aa9677b18f5e45a60a13b08fdbd7cc9fe7d86e27b06f3e4d09b11cda85319d79d0003c1a42ac7c4f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-prometheus-client \
python314-prometheus-client \
python3dist-prometheus-client"

RDEPENDS:${PN} += "python-abi"

inherit rpm
