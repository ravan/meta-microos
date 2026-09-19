SUMMARY = "Management component for Saltstack with ssh protocol"
DESCRIPTION = "Salt ssh is a master running without zmq. \
it enables the management of minions over a ssh connection."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-ssh-3006.0-70.1.aarch64.rpm"
RPM_HASH = "c2d03dafac01986a32ace9c4668a3dbf119fbca7a9ccff274fc3814f0b6c21951f5da0ce691257a55ca3483b73687db3ddc168deb9178a33ecb177dc30163fdd"

RPROVIDES:${PN} += "salt-ssh"

RDEPENDS:${PN} += "salt \
salt-master \
systemd"

inherit rpm
