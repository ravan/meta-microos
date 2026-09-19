SUMMARY = "System group 'audit'"
DESCRIPTION = "This package contains the system group 'audit' for read access to logs."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "system-group-audit-4.0.2-3.5.noarch.rpm"
RPM_HASH = "d8c5727f6e7ef4369c0d8df89e6fcc463c55860249ddf595473c375dbae27a1fc02dd9e68b6d2c86f254182216f65a8534a4f9f7c8d02e76e7f059eb8290e848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-audit \
system-group-audit"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
