SUMMARY = "NRPE plugin"
DESCRIPTION = "This package contains the plugin for the host runing the Nagios \
daemon. \
 \
It is used to contact the NRPE process on remote hosts. The plugin \
requests that a plugin be executed on the remote host and wait for the \
NRPE process to execute the plugin and return the result. \
 \
The plugin then uses the output and return code from the plugin \
execution on the remote host for its own output and return code."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.1"

RPM_NAME = "monitoring-plugins-nrpe-4.1.1-1.14.aarch64.rpm"
RPM_HASH = "1a4e79e2b1686486f15d141240244dc346bf685545aaeee889007663b0122d8f0a21244aabdf8f24048f4d398d5792efc607457a9d5e6c00aa2d11a96dbb746a"

RPROVIDES:${PN} += "config-monitoring-plugins-nrpe \
monitoring-plugins-nrpe \
nagios-nrpe-server \
nagios-plugins-nrpe"

RDEPENDS:${PN} += "group-nagcmd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
system-user-nagios"

inherit rpm
