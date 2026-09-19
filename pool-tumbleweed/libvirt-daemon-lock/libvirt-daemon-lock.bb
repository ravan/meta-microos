SUMMARY = "Server side daemon for managing locks"
DESCRIPTION = "Server side daemon used to manage locks held against virtual machine \
resources"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-lock-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "c1d846c14cbb49668230a639683a438342d55d63fa52fbb0a5e8f30fbab2bfc4f3c361b021184f0a1f13807c486039f649befa1205e815bfd4d02e74d7b55873"

RPROVIDES:${PN} += "config-libvirt-daemon-lock \
libvirt-daemon-lock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libvirt.so.0"

inherit rpm
