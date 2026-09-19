SUMMARY = "Monolithic server side daemon and supporting files for the libvirt library"
DESCRIPTION = "Monolithic server side daemon used to manage the virtualization capabilities \
of recent versions of Linux. Requires a hypervisor specific sub-RPM for \
specific drivers."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "d93492f902ffe8004dccf3aaba6809a668127f24cacb39841ecfe3b0e90e4d2755d2e2f690ae74052bcd2dc990a7730daebc60b35f790c0a3718a4415191b2ca"

RPROVIDES:${PN} += "config-libvirt-daemon \
libvirt-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-daemon-common \
libvirt-daemon-lock \
libvirt-daemon-log \
libvirt-daemon-plugin-lockd \
libvirt-daemon-proxy \
libvirt-libs \
libvirt-lxc.so.0 \
libvirt-qemu.so.0 \
libvirt.so.0"

inherit rpm
