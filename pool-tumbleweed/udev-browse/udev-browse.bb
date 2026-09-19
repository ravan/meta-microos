SUMMARY = "A Udev browsing tool"
DESCRIPTION = "It's easy to get lost in /sys and not much fun typing long udevadm info command lines all the time. \
This is a little UI for exploring the udev/sysfs tree: udev-browse. \
This provides a little bit simpler access to the device tree"
LICENSE = "LGPL-2.1+"

PV = "0.3"

RPM_NAME = "udev-browse-0.3-10.10.aarch64.rpm"
RPM_HASH = "0f41fdd5fd85e32fb4bd598abf54dd2604d5c4cc31fb8d96cded9c6d60fa15ecb1a4861ae5248476a3a4698b75bbcef7c322ca4ee092ea54bf55142ccfb5f5e7"

RPROVIDES:${PN} += "udev-browse"

RDEPENDS:${PN} += "libc.so.6 \
libgee-0.8.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0"

inherit rpm
