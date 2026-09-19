SUMMARY = "Kernel latency measuring tool"
DESCRIPTION = "LatencyTOP is a Linux* tool for software developers (both kernel and \
userspace), aimed at identifying where in the system latency is \
happening, and what kind of operation/action is causing the latency to \
happen so that the code can be changed to avoid the worst latency \
hiccups. This package contains version with graphic interface."
LICENSE = "GPL-2.0"

PV = "0.5"

RPM_NAME = "xlatencytop-0.5-26.8.aarch64.rpm"
RPM_HASH = "8fd26f9b272a0434b41c9fc7dae1331d6dc9e93b1fec0041971b14a154afd1574ba4500b7526ff6ee683a3fcf473dfd12324b27a4808a75d28e473a9d6794bf3"

RPROVIDES:${PN} += "xlatencytop"

RDEPENDS:${PN} += "latencytop \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
