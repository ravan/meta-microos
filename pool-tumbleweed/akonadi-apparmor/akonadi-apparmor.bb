SUMMARY = "AppArmor profiles for Akonadi"
DESCRIPTION = "This package contains AppArmor profiles for Akonadi."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-apparmor-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c53ebbf9b766e88170f8d09c31a26021e1b981d5c1b2b58d10153c392c3bb014f167770b8451c1cafe4a96e09b8e661e9515228fa5e2735faeee607b19417da3"

RPROVIDES:${PN} += "akonadi-apparmor \
akonadi-server-apparmor \
config-akonadi-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-abstractions"

inherit rpm
