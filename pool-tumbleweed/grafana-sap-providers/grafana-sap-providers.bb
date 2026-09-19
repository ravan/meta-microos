SUMMARY = "Grafana configuration providers for SAP applications"
DESCRIPTION = "Automated configuration provisioners leveraged by other packages to enable a zero-config installation of Grafana dashboards."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "grafana-sap-providers-1.1-1.16.noarch.rpm"
RPM_HASH = "a4e409c68c0d159d81d5c30977decf860aae1bf5797b4d5337b3013dfd27806df1c8258083e5d4fae17e01ac7b3f904a4d655e62ed0173d7a1eac889caf4f01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grafana-sap-providers \
grafana-sap-providers"

RDEPENDS:${PN} += "/usr/bin/sh \
group-grafana \
shadow \
user-grafana"

inherit rpm
