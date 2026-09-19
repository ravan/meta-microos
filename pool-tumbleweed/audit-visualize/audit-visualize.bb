SUMMARY = "Visualization tools for the audit subsystem"
DESCRIPTION = "The audit-visualize package contains scripts to produce flow graphs and \
bar charts from audit data."
LICENSE = "GPL-2.0+"

PV = "1.5.2"

RPM_NAME = "audit-visualize-1.5.2-115.7.noarch.rpm"
RPM_HASH = "894a360391b6128831de1db6a199b8e592e7d23ae8fe3a0645fff7f68027214352aaeb13ea70ef07fe38e4baefba2b9a4922c512663825c601142869d2b80bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audit-visualize"

RDEPENDS:${PN} += "audit \
gnuplot \
graphviz"

inherit rpm
