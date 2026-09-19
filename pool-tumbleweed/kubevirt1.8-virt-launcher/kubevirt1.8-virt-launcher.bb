SUMMARY = "Launcher component for kubevirt"
DESCRIPTION = "The virt-launcher package provides a launcher for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virt-launcher-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "b429788bee6c0b50e0b71e76b8a91c0c52570de9c89c5fdc7a7006efcf7c359a9dc1826419d911695b73b70d5acd4327636f43ad533bcd2e6ad81bd79d03e2d1"

RPROVIDES:${PN} += "kubevirt-1.8-virt-launcher \
kubevirt-virt-launcher \
kubevirt1.8-virt-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libnbd.so.0 \
libvirt-admin.so.0 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
