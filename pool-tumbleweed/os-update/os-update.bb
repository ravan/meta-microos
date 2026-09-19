SUMMARY = "Updates the system regularly to stay current and safe"
DESCRIPTION = "Service to keep an OS update to date and secure. It is run by a \
systemd.timer daily and can inform rebootmgrd that the update \
requires a reboot."
LICENSE = "GPL-2.0-or-later"

PV = "1.21+git.20260212"

RPM_NAME = "os-update-1.21+git.20260212-1.2.noarch.rpm"
RPM_HASH = "5cd9fc25d6212c293d1efb9f0eda8f744d283dccb5c1faa2e4439248d82aa808cb7f124f6a0e1ced976705b1995b379714fca63166ff379d997abf4562c5696d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
lsof \
zypp-boot-plugin \
zypper-needs-restarting"

inherit rpm
