SUMMARY = "Automatic controlled reboot during a maintenance window"
DESCRIPTION = "RebootManager is a dbus service to execute a controlled reboot after updates in a defined maintenance window. \
 \
If you updated a system with e.g. transactional updates or a kernel update was applied, you can tell rebootmgrd with rebootmgrctl, that the machine should be reboot at the next possible time. This can either be immediately or during a defined maintenance window."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.3+git20250722.adf0149"

RPM_NAME = "rebootmgr-3.3+git20250722.adf0149-1.6.aarch64.rpm"
RPM_HASH = "e420793f99b280295cc425fea415551ce74d7215848b2a06aafe6c8b163d339eb6a55d3b4a807d176100b8e54a2b5fe0a3cd337ac200d036f2e3f87461db0947"

RPROVIDES:${PN} += "rebootmgr"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0 \
libsystemd.so.0"

inherit rpm
