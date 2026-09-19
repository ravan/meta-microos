SUMMARY = "Check nagios server"
DESCRIPTION = "This plugin checks the status of the Nagios process on the local machine. The \
plugin will check to make sure the Nagios status log is no older than the \
number of minutes specified by the expires option. \
 \
It also checks the process table for a process matching the command argument."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-nagios-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "1066311ec6d266f665737dc36bb158f2bd7cfd324b5424751cf11cb720bed9f6935721d305359fac0d8f79b98979a417b8535e9dd88367144b8645e16897c9d2"

RPROVIDES:${PN} += "monitoring-plugins-nagios \
nagios-plugins-nagios"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
monitoring-daemon"

inherit rpm
