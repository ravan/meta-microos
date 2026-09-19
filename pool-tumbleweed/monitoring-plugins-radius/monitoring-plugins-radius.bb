SUMMARY = "Test RADIUS server"
DESCRIPTION = "This plugin tests a RADIUS server to see if it is accepting connections.  The \
server to test must be specified in the invocation, as well as a user name and \
password. A configuration file may also be present. The format of the \
configuration file is described in the radiusclient library sources.  The \
password option presents a substantial security issue because the password can \
possibly be determined by careful watching of the command line in a process \
listing. This risk is exacerbated because nagios will run the plugin at regular \
predictable intervals. Please be sure that the password used does not allow \
access to sensitive system resources."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-radius-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "72d49caa7e013e8d76d5a5d0588e414801f3d343710ee5280da97542f6f1332f97d6ccbd144646baf5c7f96767107c0df84f9b5caf4fd4139031fe90895fc47b"

RPROVIDES:${PN} += "monitoring-plugins-radius \
nagios-plugins-radius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeradius-client.so.2"

inherit rpm
