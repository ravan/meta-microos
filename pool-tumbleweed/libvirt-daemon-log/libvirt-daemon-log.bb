SUMMARY = "Server side daemon for managing logs"
DESCRIPTION = "Server side daemon used to manage logs from virtual machine consoles"
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "libvirt-daemon-log-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "616885def17386cf6300a149f75f482fc78379d5f81ff1c6b9e2c10c575fa3cd346d7e5a4a6f9203044bfe2fc526816fb5ff374496817d94f1c63a27d1b4f3a0"

RPROVIDES:${PN} += "config-libvirt-daemon-log \
libvirt-daemon-log"

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
