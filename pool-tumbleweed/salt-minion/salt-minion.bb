SUMMARY = "The client component for Saltstack"
DESCRIPTION = "Salt minion is queried and controlled from the master. \
Listens to the salt master and execute the commands."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-minion-3006.0-70.1.aarch64.rpm"
RPM_HASH = "8910a7f215146a80f9fa59e5c9818c076225c4f32d03005e42f07b15b54d70455595fd2421af1cfad5d5e74ddc62bdded2b9df7550c70e7a3acad52c3b78b7d8"

RPROVIDES:${PN} += "config-salt-minion \
salt-minion"

RDEPENDS:${PN} += "/usr/bin/sh \
salt \
systemd"

inherit rpm
