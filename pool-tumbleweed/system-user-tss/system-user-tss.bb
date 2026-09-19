SUMMARY = "System user and group tss"
DESCRIPTION = "This package provides the system account and group 'tss'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-tss-20250822-2.3.noarch.rpm"
RPM_HASH = "5e69b90c5556d04b8aaff94dc660bfa9e14f7ddbe731392779e8c37033c08c4324d8c8bcdc5d60573af26f1b70c120ab0da4cba8046e4eaa04c8b1bbc28c0c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-tss \
system-user-tss \
user-tss"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
