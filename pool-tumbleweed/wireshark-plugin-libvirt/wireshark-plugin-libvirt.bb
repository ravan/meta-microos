SUMMARY = "Wireshark plugin for libvirt RPC protocol"
DESCRIPTION = "Wireshark dissector plugin for better analysis of libvirt RPC traffic."
LICENSE = "LGPL-2.1-or-later"

PV = "12.7.0"

RPM_NAME = "wireshark-plugin-libvirt-12.7.0-1.1.aarch64.rpm"
RPM_HASH = "4360b56d1da0d31f98ef082f3be82b7eee4946e098b8a8b413d5a69e02ee04af01e47a51bb4104eef18e951a4d6302b171986d8ce01a219926aac3b2ed3185c9"

RPROVIDES:${PN} += "libvirt.so \
wireshark-plugin-libvirt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libtirpc.so.3 \
libvirt-libs \
libwireshark.so.19 \
libwsutil.so.17 \
wireshark"

inherit rpm
