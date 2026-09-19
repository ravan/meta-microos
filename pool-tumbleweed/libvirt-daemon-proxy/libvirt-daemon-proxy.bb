SUMMARY = "Server side daemon providing libvirtd proxy"
DESCRIPTION = "Server side daemon providing functionality previously provided by \
the monolithic libvirtd"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-proxy-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "187ebecd8aeb3007afac232efc075e9ec612ecd633d07aaab0aa9f562745da95a991d7e384510fda2a8c74f9221aa907424faf2fc127c40c588f473dc6929323"

RPROVIDES:${PN} += "config-libvirt-daemon-proxy \
libvirt-daemon-proxy"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
