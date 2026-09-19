SUMMARY = "SSH tunnels to remote server"
DESCRIPTION = "The sshtunnel package allows one to create SSH tunnels using local \
or remote port forwarding. Thus, it provides a Python wrapper to \
the same functionality provided by the SSH command using the -L \
and -R parameters."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-sshtunnel-0.4.0-7.2.noarch.rpm"
RPM_HASH = "08d4cfacaf23c01d3f3658ceeceb35f7d14c0ec6679e30959e79f4df2b865b9298206ba1bce0100cf61a800bbf15c540f8ce51fa5beb995f6f9dc98367c9de26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sshtunnel \
python314-sshtunnel \
python3dist-sshtunnel"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
openssh \
python-abi \
python314-paramiko"

inherit rpm
