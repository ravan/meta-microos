SUMMARY = "Collect data from NSClient service"
DESCRIPTION = "This plugin collects data from the NSClient service running on a \
Windows NT/2000/XP/2003 server."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-nt-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "823d88061768d56e9b4f6e580faaa44e9f79a8cecd4804559113f5c6f342ffc9f8298d8f9dc48890a5b1bd0ec5abf0e919b8d899feaa87809f79756823794d72"

RPROVIDES:${PN} += "monitoring-plugins-nt \
nagios-plugins-nt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
