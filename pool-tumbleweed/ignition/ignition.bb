SUMMARY = "First boot installer and configuration tool"
DESCRIPTION = "Ignition is an utility to manipulate disks and configuration files \
during the initramfs. This includes partitioning disks, formatting \
partitions, writing files (regular files, systemd units, etc.), and \
creating users. \
On first boot, Ignition reads its configuration from a source of truth \
(remote URL, network metadata service, hypervisor bridge, etc.) and \
applies the configuration."
LICENSE = "Apache-2.0"

PV = "2.26.0"

RPM_NAME = "ignition-2.26.0-5.2.aarch64.rpm"
RPM_HASH = "ae6ace1997898e21d7573699b31fc7157431c92a06565ab1e10f933c6ff6cb7001deac2fea063bc4605694b18bb0709c5cc1549726c271fc88ddcfc06ef5194f"

RPROVIDES:${PN} += "ignition \
ignition-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
combustion \
dracut \
libblkid.so.1 \
libc.so.6"

inherit rpm
