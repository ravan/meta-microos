SUMMARY = "Grafana Dashboards displaying metrics about SAP HANA databases."
DESCRIPTION = "Grafana Dashboards displaying metrics about SAP HANA databases."
LICENSE = "Apache-2.0"

PV = "1.0.2+git.1623658432.f49b536"

RPM_NAME = "grafana-sap-hana-dashboards-1.0.2+git.1623658432.f49b536-1.14.noarch.rpm"
RPM_HASH = "3a3662b8a82c55bc66f4691749a980b6c2b7929593636d2be5f4956c06bd7800da871063799ae5d9ee405c1ceb07ce0ff5eaa803e51967a480a12d470f350b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grafana-sap-hana-dashboards \
grafana-sap-hana-dashboards"

RDEPENDS:${PN} += "grafana-sap-providers \
group-grafana \
user-grafana"

inherit rpm
