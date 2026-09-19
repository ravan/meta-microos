SUMMARY = "Sanlock lock manager plugin for QEMU driver"
DESCRIPTION = "Includes the Sanlock lock manager plugin for the QEMU driver"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-plugin-sanlock-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "87cf03d64ae1e3b82fd929eb353085e9898c8afcc47f2b1a33aae7bcb96d3048994333e23919f869dc1e0d499a2bf9d825ec44694ca635412f58163abd280c95"

RPROVIDES:${PN} += "config-libvirt-daemon-plugin-sanlock \
libvirt-daemon-plugin-sanlock \
libvirt-lock-sanlock"

RDEPENDS:${PN} += "/usr/bin/sh \
augeas \
group-sanlock \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libsanlock-client.so.1 \
libvirt-daemon-common \
libvirt-libs \
libvirt.so.0 \
sanlock"

inherit rpm
