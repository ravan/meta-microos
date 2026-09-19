SUMMARY = "Grafana Dashboards displaying metrics about a SAP NetWeaver landscape."
DESCRIPTION = "Grafana Dashboards displaying metrics about a SAP NetWeaver landscape."
LICENSE = "Apache-2.0"

PV = "1.0.3+git.1601889366.9f71957"

RPM_NAME = "grafana-sap-netweaver-dashboards-1.0.3+git.1601889366.9f71957-1.16.noarch.rpm"
RPM_HASH = "84fe4b89054c173cf61a10b64b79b03c96a494dca8e3b9c4374893e8def52ef51da7582f4b00c271c036a7a2d6e6dbf85443f30c02ca9ad76bb96e14aa193606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grafana-sap-netweaver-dashboards \
grafana-sap-netweaver-dashboards"

RDEPENDS:${PN} += "grafana-sap-providers \
group-grafana \
user-grafana"

inherit rpm
