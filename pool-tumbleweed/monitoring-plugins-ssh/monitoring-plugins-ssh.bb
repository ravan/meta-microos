SUMMARY = "Check SSH service"
DESCRIPTION = "Try to connect to an SSH server at specified server and port."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-ssh-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "201ae52552bf7c038d1a358c6458f54a770ae10bb9ce9a21e7540801987fbd46940ae7d37fa0b7f9e1e91f7cebbc0527a127460f95c324a89d54a24ac651dd0d"

RPROVIDES:${PN} += "config-monitoring-plugins-ssh \
monitoring-plugins-ssh \
nagios-plugins-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
