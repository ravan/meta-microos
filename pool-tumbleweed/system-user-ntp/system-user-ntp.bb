SUMMARY = "System user ntp and group"
DESCRIPTION = "This package provides the system user and group 'ntp'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-ntp-20250822-2.3.noarch.rpm"
RPM_HASH = "11ddccf0144a60d3718a85327e7543ab40d21d0f099ed727ef58b4a334b6b238644fb5e6834f5ef30c28b5a3f666c0ac8f48d4c77fd81d98baab51abad2ba965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-ntp \
system-user-ntp \
user-ntp"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
