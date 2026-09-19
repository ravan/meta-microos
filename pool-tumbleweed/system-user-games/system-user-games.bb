SUMMARY = "System user and group games"
DESCRIPTION = "This package provides the system account and group 'games'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-games-20250822-2.3.noarch.rpm"
RPM_HASH = "cd6368b9b514bdb164fed1bb35e0af6faf35109cb516184f158e5badc9c2c04066aa96877fec8d5c474aec70f4ac364fb340c4642997d6b4ada7ab34c31f97c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-games \
system-user-games \
user-games"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
