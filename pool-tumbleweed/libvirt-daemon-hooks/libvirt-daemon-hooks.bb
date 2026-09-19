SUMMARY = "Hook scripts for QEMU"
DESCRIPTION = "Hook scripts for the virtqemud daemon"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-hooks-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "ada251482cbe53a21da312c6f100f72e8a56604f133fdcc25249706fe4c0646cf1650e93b7fb949d0cfd3e4764d49ad91bd8df41edbf8cf8e4eeb0e9c1f9a726"

RPROVIDES:${PN} += "libvirt-daemon-hooks"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
libselinux-utils \
libvirt-daemon-driver-qemu \
policycoreutils \
policycoreutils-python-utils \
python3-lxml \
selinux-policy \
selinux-policy-base"

inherit rpm
