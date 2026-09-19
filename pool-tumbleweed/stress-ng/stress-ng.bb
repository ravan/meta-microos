SUMMARY = "Tool to load and stress a computer"
DESCRIPTION = "stress-ng can stress various subsystems of a computer. It can stress load CPU, \
cache, disk, memory, socket and pipe I/O, scheduling and much more. stress-ng \
is a re-write of the original stress tool by Amos Waterland but has many \
additional features such as specifying the number of bogo operations to run, \
execution metrics, a stress verification on memory and compute operations and \
considerably more stress mechanisms."
LICENSE = "GPL-2.0-or-later"

PV = "0.22.00"

RPM_NAME = "stress-ng-0.22.00-1.1.aarch64.rpm"
RPM_HASH = "9bdb897dfb50d5cf259ea70a3a2a2ab1a64916f08b66633543c5f82101548715f64922f098f40e73a0cb95a3a5e67fe600d548a53d4f5e4a5d84f9840a875784"

RPROVIDES:${PN} += "stress-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libbsd.so.0 \
libc.so.6 \
libcrypt.so.1 \
libgbm.so.1 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libsctp.so.1 \
libz.so.1"

inherit rpm
