SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "python314-libvirt-python-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "3be1ec9c8667e4496112c2acd1989ada5e834f2e53f573bc1a822dd935b947af4c1fb96232a95d2247f4799e56495107144e813742057da9f987e0e8f0b69017"

RPROVIDES:${PN} += "libvirtmod-lxc.cpython-314-aarch64-linux-gnu.so \
libvirtmod-qemu.cpython-314-aarch64-linux-gnu.so \
libvirtmod.cpython-314-aarch64-linux-gnu.so \
python3.14dist-libvirt-python \
python314-libvirt-python \
python3dist-libvirt-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
python-abi"

inherit rpm
