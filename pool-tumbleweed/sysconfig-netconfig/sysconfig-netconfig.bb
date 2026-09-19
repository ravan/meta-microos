SUMMARY = "Script to apply network provided settings"
DESCRIPTION = "This package provides the netconfig scripts to apply network \
provided settings like DNS, NTP or NIS into system files."
LICENSE = "GPL-2.0-or-later"

PV = "0.90.5"

RPM_NAME = "sysconfig-netconfig-0.90.5-1.2.noarch.rpm"
RPM_HASH = "8f1f07d904f7657b9a194eb641d4a941618ef889637734a8a0c79da6e428872860aca2920242faf29c2851cff44ac1cea71647f8fb2193ee708b99e3b2813fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/netconfig \
config-sysconfig-netconfig \
sysconfig-netconfig"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gawk \
/usr/bin/logger \
sysconfig"

inherit rpm
