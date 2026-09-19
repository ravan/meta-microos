SUMMARY = "Hex/bin format conversion package"
DESCRIPTION = "The srecord package is a collection of powerful tools for manipulating EPROM \
load files. It reads and writes numerous EPROM file formats, and can perform \
many different manipulations."
LICENSE = "GPL-3.0-or-later"

PV = "1.65.0"

RPM_NAME = "srecord-1.65.0-2.7.aarch64.rpm"
RPM_HASH = "8f1370a377a7b533a81a82eac41b38f439a7ad6c8c34ff90401dd80184181e5f8265d0611e28c61c549c039803c33851271c035a5a05432bd75d3c84524cd518"

RPROVIDES:${PN} += "srecord"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsrecord.so.0 \
libstdc++.so.6"

inherit rpm
