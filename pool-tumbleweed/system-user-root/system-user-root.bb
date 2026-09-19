SUMMARY = "System user and group root"
DESCRIPTION = "This package provides the root account including the groups root, \
shadow and users."
LICENSE = "MIT"

PV = "20190513"

RPM_NAME = "system-user-root-20190513-2.23.noarch.rpm"
RPM_HASH = "466ac74959927d8f3003eed7c1135d36c13be79959a320da8bfee84522f0d062e1b4bc5a5ee82cface8f6c6683c8341adbe4e1485abaea33454806e61281749c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-root \
group-shadow \
group-trusted \
group-users \
system-user-root \
user-root"

RDEPENDS:${PN} += ""

inherit rpm
