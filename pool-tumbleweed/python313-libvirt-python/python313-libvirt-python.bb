SUMMARY = "Library providing a virtualization API"
DESCRIPTION = "The python-libvirt-python package contains a module that permits applications \
written in the Python programming language to use the interface \
supplied by the libvirt library to use the virtualization capabilities \
of recent versions of Linux (v2.6.20+)."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "python313-libvirt-python-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "c90d9b61a343522ad7f980dfdccd7315895f2b2f32ea97d7dbb225406d87a1a585b4e93d5e1a8b606b4a6e400b39285707aa134327875ec3477c8f1da6269077"

RPROVIDES:${PN} += "libvirtmod-lxc.cpython-313-aarch64-linux-gnu.so \
libvirtmod-qemu.cpython-313-aarch64-linux-gnu.so \
libvirtmod.cpython-313-aarch64-linux-gnu.so \
python3-libvirt-python \
python3.13dist-libvirt-python \
python313-libvirt-python \
python3dist-libvirt-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
python-abi"

inherit rpm
