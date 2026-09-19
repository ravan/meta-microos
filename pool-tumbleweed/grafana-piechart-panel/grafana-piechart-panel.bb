SUMMARY = "Grafana Piechart panel"
DESCRIPTION = "Pie chart panel for grafana"
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "grafana-piechart-panel-1.6.1-3.10.noarch.rpm"
RPM_HASH = "50fd7fd17f6b99849b55a6b077c8fb28f2982488fbea4e680e1be10e6d723e4aad8bddcfeb5e8505f48551672a577cd10d2b4e5407affdeca1e763828063eea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grafana-piechart-panel"

RDEPENDS:${PN} += "grafana \
group-grafana \
user-grafana"

inherit rpm
