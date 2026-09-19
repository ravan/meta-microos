SUMMARY = "A system for controlling process state under UNIX"
DESCRIPTION = "Supervisor is a client/server system that allows its users to \
control a number of processes on UNIX-like operating systems."
LICENSE = "SUSE-Repoze"

PV = "4.3.0"

RPM_NAME = "supervisor-4.3.0-1.3.noarch.rpm"
RPM_HASH = "483d7bfc623529b88d45c1b2bc02cd078f9d7115d6401549089ee563a458b3cd9b3ebf62f69bd42fb49da29255e95cf0ad77d193bfd0f3d4c5849fece1dfbc4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-supervisor \
python3.13dist-supervisor \
python3dist-supervisor \
supervisor"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
systemd"

inherit rpm
