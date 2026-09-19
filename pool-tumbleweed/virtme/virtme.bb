SUMMARY = "Tools for virtualize the running distro or a rootfs"
DESCRIPTION = "Virtme is a set of tools to run a virtualized Linux kernel that \
uses the host Linux distribution or a rootfs instead of a whole \
disk image."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "virtme-1.41-1.2.noarch.rpm"
RPM_HASH = "23dbc98373c04d37e087d2c1b4b1c3cbd1fc96a52e96feb2cc47e0c56b431a6473a06076e3b2c0e870d80b1a24d084a277593544f454668209cd8cd5e3ba11cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-virtme-ng \
python3dist-virtme-ng \
virtme"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
busybox-static \
python-abi \
python3-argcomplete \
python3-requests \
python3-setuptools \
qemu \
virtiofsd"

inherit rpm
