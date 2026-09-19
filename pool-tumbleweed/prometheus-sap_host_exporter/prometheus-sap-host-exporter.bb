SUMMARY = "Prometheus exporter for SAP hosts"
DESCRIPTION = "A Prometheus metrics exporter that connects to the SAPControl web interface \
to collect data about SAP systems like NetWeaver and S4/HANA."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "prometheus-sap_host_exporter-0.7.0-1.10.aarch64.rpm"
RPM_HASH = "9ae7d8977b28f1ab809f296db7f5f14b13912cd6754d3d27ddd64b3b5d0ecc4bca1499bfb14510f831f49f8dffed4f9c66f301ab99642c863fea2bd0ccb20ee0"

RPROVIDES:${PN} += "config-prometheus-sap-host-exporter \
prometheus-sap-host-exporter \
sap-host-exporter"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh"

inherit rpm
