SUMMARY = "SELinux security policy for cockpit-ws"
DESCRIPTION = "SELinux policy module for the cockpit-ws package."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-ws-selinux-365-2.1.aarch64.rpm"
RPM_HASH = "b2ea012e46466b626d53d0a80cf110d40ef7bf74ffab2e78d6fbe9fb8ed6ced2aa0e9d8345eaa33c55f97bc5c8b2d6bdd078e39dff4f17624f979db0c8ca83d2"

RPROVIDES:${PN} += "cockpit-ws-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
libselinux-utils \
policycoreutils \
selinux-policy-targeted"

inherit rpm
