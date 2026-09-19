SUMMARY = "VPN over an SSH tunnel"
DESCRIPTION = "Transparent proxy server that works as a poor man's VPN. Forwards over ssh. \
Doesn't require admin. Supports DNS tunneling. \
sshuttle is a program that solves the following case: \
- You have access to a remote network via ssh. \
- You don't necessarily have admin access on the remote network. \
- The remote network has no VPN, or only complex VPN \
  protocols (IPsec, PPTP, etc). \
- You don't want to create an SSH port forward for every \
  single host/port on the remote network. \
- You can't use openssh's PermitTunnel feature because \
  it's disabled by default on openssh servers; plus it does \
  TCP-over-TCP, which has terrible performance."
LICENSE = "LGPL-2.1-only"

PV = "1.3.2"

RPM_NAME = "sshuttle-1.3.2-1.5.noarch.rpm"
RPM_HASH = "939325fb21675c828e72e131ea5de5e24a0faa6020ee95d29fdc572baf2fb4fbb6228e13e6d9e4ff7629615cc5ee05df50cb0b03ba2987198101b52a3f816667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-sshuttle \
python3dist-sshuttle \
sshuttle"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3.13 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
python-abi \
sysuser-shadow"

inherit rpm
