SUMMARY = "System user for pgadmin"
DESCRIPTION = "System user for pgadmin."
LICENSE = "PostgreSQL"

PV = "9.17"

RPM_NAME = "system-user-pgadmin-9.17-1.1.noarch.rpm"
RPM_HASH = "05e9085e04eb330f90c0d37726cddc1f61bb4667abf79ea24fe2efb22e042887c4f42de999d7115f22d068a56bccae0ce581f4500aed7b40b78a58b409762daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-pgadmin \
system-user-pgadmin \
user-pgadmin"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
