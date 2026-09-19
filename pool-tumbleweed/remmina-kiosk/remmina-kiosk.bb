SUMMARY = "Login manager extension for a Remmina kiosk mode"
DESCRIPTION = "This package installs a Remmina Kiosk mode to the list of the \
available sessions for all freedesktop compliant login managers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.43"

RPM_NAME = "remmina-kiosk-1.4.43-2.2.aarch64.rpm"
RPM_HASH = "bae5c92a15460f93467ec831e792bde6c22b5cf3f698447a120fb6baad1b50c98ca74fd8e2b7c8ef496d6d51fc672a9d590095d8ab6826d7c5732c0f2d026918"

RPROVIDES:${PN} += "remmina-kiosk"

RDEPENDS:${PN} += "/usr/bin/sh \
remmina"

inherit rpm
