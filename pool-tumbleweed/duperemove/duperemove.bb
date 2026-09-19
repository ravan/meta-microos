SUMMARY = "Software to find duplicate extents in files and remove them"
DESCRIPTION = "Duperemove finds duplicate extents in files and prints them to the \
console. It also has the option to deduplicate extents on those file \
systems which support the Linux extent-same ioctl."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "duperemove-0.15-1.7.aarch64.rpm"
RPM_HASH = "9ca4b6cc40f89e420f65f3cb1838d801d7294c95c5ed0d9bfbf9fc8a64de8686dfda2197ba209bebe08ddeb222137d7f791ec2aa30111f0afd23442895b87492"

RPROVIDES:${PN} += "duperemove"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmount.so.1 \
libsqlite3.so.0 \
libuuid.so.1"

inherit rpm
