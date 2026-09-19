SUMMARY = "System user for the osc-collab server component"
DESCRIPTION = "System user for the osc-collab server component."
LICENSE = "BSD-3-Clause"

PV = "0.104+30"

RPM_NAME = "system-user-osc-collab-0.104+30-1.9.noarch.rpm"
RPM_HASH = "1db50f7f44061c9dbc13f4ae0c4b3ec9d2470c5425b677e46807edf56b591aca0da1a29246065f0a698b3a20809c63e5823f0c2cd6c4bb71555f8daf41a3fa9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-osc-collab \
system-user-osc-collab \
user-osc-collab"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
