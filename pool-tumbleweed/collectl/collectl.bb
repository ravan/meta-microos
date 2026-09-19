SUMMARY = "System status data collection utility"
DESCRIPTION = "Similar to the 'sar' program, collectl does collection of device performance \
information. It features: \
* Fine-grained non-drifting monitoring \
* Aggregates performance numbers or device-individual reports \
* Aligned monitoring intervals \
* Process and slab monitoring \
* Monitoring of process i/o statistics \
* IPMI monitoring for fans and temperature sensors \
* API for importing additional data"
LICENSE = "Artistic-1.0 & GPL-2.0-or-later"

PV = "4.3.8"

RPM_NAME = "collectl-4.3.8-2.7.noarch.rpm"
RPM_HASH = "5fbebcb732253a922d3fa14a7c5a7e763f3ec77de178be4e9990e637dc7c758428b148e5fc0a158000094621d035274997384f932bf799c3ee51e3f6585c4ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectl \
config-collectl"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
systemd"

inherit rpm
