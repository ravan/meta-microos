SUMMARY = "Client side utilities of the libvirt library"
DESCRIPTION = "The client binaries needed to access the virtualization \
capabilities of recent versions of Linux (and other OSes)."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-client-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "669d4ca4fbbe328f218673ceac920eb7a36b4a9154ebb343efbdee18375a36370dfbae00c55f491229b777306aef56a70d8125fdb7a02247bf1396ed7aef0ce6"

RPROVIDES:${PN} += "libvirt-client"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libreadline.so.8 \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0 \
libxml2.so.16"

inherit rpm
