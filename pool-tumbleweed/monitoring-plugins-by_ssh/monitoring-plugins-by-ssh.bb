SUMMARY = "Execute checks via SSH"
DESCRIPTION = "This plugin uses SSH to execute commands on a remote host. \
 \
The most common mode of use is to refer to a local identity file with \
the '-i' option. In this mode, the identity pair should have a null \
passphrase and the public key should be listed in the authorized_keys \
file of the remote host. Usually the key will be restricted to running \
only one command on the remote server. If the remote SSH server tracks \
invocation arguments, the one remote program may be an agent that can \
execute additional commands as proxy."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-by_ssh-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "64471ba4c3a4b0a0fbe00f9ea9773aaccd28fc6ea9c4c750c59aa4548edfccc641336fe78e0ce22d3076d08050d8de2374be11f51c94cc41e4dbb8bdd433679f"

RPROVIDES:${PN} += "monitoring-plugins-by-ssh \
nagios-plugins-by-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
openssh"

inherit rpm
