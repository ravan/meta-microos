SUMMARY = "Fast ping check"
DESCRIPTION = "This plugin will use the fping command to ping the specified host for \
a fast check. Note that it is necessary to set the suid flag on fping."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-fping-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "4dbd29a4ddad6cc907d0ef4b4ce6aa9ee0ed69cbe2aa97bd6302fedd06bccc7a63c7e4f74dfb8370f863afa61abf60f287ee0ad0781f60524662f1d1d0f79562"

RPROVIDES:${PN} += "monitoring-plugins-fping \
nagios-plugins-fping"

RDEPENDS:${PN} += "fping \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
