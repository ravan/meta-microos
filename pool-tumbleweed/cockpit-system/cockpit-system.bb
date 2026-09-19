SUMMARY = "Cockpit admin interface package for configuring and troubleshooting a system"
DESCRIPTION = "This package contains the Cockpit shell and system configuration interfaces."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-system-365-2.1.noarch.rpm"
RPM_HASH = "03914f5356376eb726fdb328977c20bffffc540bb4f5e6d301dd4029a5be4b98290055581d8a502b01b0308601d2c2c4f99568984ac68c003802973f5b357521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-shell \
cockpit-system \
cockpit-systemd \
cockpit-tuned \
cockpit-users"

RDEPENDS:${PN} += "/usr/bin/date \
/usr/bin/pwscore \
cockpit-bridge \
grep \
jeos-firstboot"

inherit rpm
