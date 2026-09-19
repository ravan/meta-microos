SUMMARY = "System user and group 'grafana'"
DESCRIPTION = "This package provides a shared system user for all grafana components"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "system-user-grafana-1.0.0-2.3.noarch.rpm"
RPM_HASH = "79cd8da4666215f14242ed13d001260760af1382f45a1ee25f93caa24523ccf43622fb402cae4af62dbd453e96dbf75d626566ef90ef5b16d918e6fafb6c551a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-grafana \
system-user-grafana \
user-grafana"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
