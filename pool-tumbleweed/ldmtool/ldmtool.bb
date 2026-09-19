SUMMARY = "A tool to manage Windows dynamic disks"
DESCRIPTION = "Command-line tool for managing Microsoft Windows dynamic disks, which use \
Microsoft's LDM metadata. It can inspect them, and also create and remove \
device-mapper block devices which can be mounted."
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "ldmtool-0.2.5-1.7.aarch64.rpm"
RPM_HASH = "a39731dd406e23676157bef04784e0db14c92f103339b8a15fd56d7276d4daeaf26a44c3dc1bc31c16c290038eae495a05071a105f03408dcaf96c2915ff4f8c"

RPROVIDES:${PN} += "ldmtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libldm-1-0-0 \
libldm-1.0.so.0 \
libreadline.so.8 \
libuuid.so.1"

inherit rpm
