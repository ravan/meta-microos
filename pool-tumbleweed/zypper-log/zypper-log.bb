SUMMARY = "CLI for accessing the zypper logfile"
DESCRIPTION = "CLI for accessing the zypper logfile"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.101"

RPM_NAME = "zypper-log-1.14.101-1.1.noarch.rpm"
RPM_HASH = "3eba4c130e8d75b8fccf52575330499a598acced2d665c80b3a3143dfae98ddeaea311bba47c4dcbb283379db259bc32fa8e559bc8f6f3fb18f497b680ca66ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-log"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/grep"

inherit rpm
