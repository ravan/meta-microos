SUMMARY = "System user and group 'alloy'"
DESCRIPTION = "This package provides a system user for Grafana Alloy."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-alloy-1.0.0-3.6.noarch.rpm"
RPM_HASH = "259ee5172a0039c3ee616db85b15513f9ada692c9efdfbee66561d0fc26e47ccd954be95597055c9dabda27bc1421e8f222bd436c84b3551e8686dfa27fdf583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-alloy \
system-user-alloy \
user-alloy"

RDEPENDS:${PN} += "/usr/bin/sh \
group-systemd-journal \
sysuser-shadow"

inherit rpm
