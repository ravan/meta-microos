SUMMARY = "System user _cscreen"
DESCRIPTION = "System user _cscreen"
LICENSE = "BSD-4-Clause"

PV = "1.8"

RPM_NAME = "system-user-cscreen-1.8-1.7.noarch.rpm"
RPM_HASH = "3e9434278d4a9ae404f25ab81b8e1089b9a0f7fd9b8495539f60a60b5293f9522d858f7ae62b73eacb6ac0d2656f03b22c7c4ef57996a7d3e3b40a6cb29ba3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group--cscreen \
system-user-cscreen \
user--cscreen"

RDEPENDS:${PN} += "/usr/bin/sh \
group-dialout \
group-tty \
sysuser-shadow"

inherit rpm
