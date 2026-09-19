SUMMARY = "Check processes"
DESCRIPTION = "This plugin checks the number of currently running processes and generates \
WARNING or CRITICAL states if the process count is outside the specified \
threshold ranges. \
 \
The process count can be filtered by process owner, parent process PID, current \
state (e.g., 'Z'), or may be the total number of running processes."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-procs-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "3ac861213d3ebce3e1c6025c280321fca046922f958410ba386196127750582dbafb7ee5b7becca4e0f98f605ba9ed6a0931232377f8d7506ef9ef526ffc2d6f"

RPROVIDES:${PN} += "config-monitoring-plugins-procs \
monitoring-plugins-procs \
monitoring-plugins-procs-perf \
nagios-plugins-procs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
