SUMMARY = "A nwfilter daemon and driver plugin"
DESCRIPTION = "The nwfilter daemon and driver plugin, providing an implementation of the \
firewall APIs using the ebtables, iptables and ip6tables capabilities"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-driver-nwfilter-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "9d557c644cb8c3fd5bebfb50802ecada3d579d77c51910a01439e92036fd874a000fb60c39aef79f2d689c8b4fcde8999c3813d3529bad9f9a4a7bbcd74a1d8e"

RPROVIDES:${PN} += "config-libvirt-daemon-driver-nwfilter \
libvirt-daemon-driver-nwfilter \
libvirt-driver-nwfilter.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ebtables \
iptables \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpcap.so.1 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
