SUMMARY = "Mesa Khronos development headers"
DESCRIPTION = "Mesa Khronos development headers."
LICENSE = "MIT"

PV = "26.2.2"

RPM_NAME = "Mesa-KHR-devel-26.2.2-2.1.aarch64.rpm"
RPM_HASH = "c37a8b7f3a7911e1e8df65623d4fb0b10ecdc56d481807334d973fb1d8e0c5e43c375c8665f020b5ea3aa2d020f394e63b3550473badd6aca210809672f48719"

RPROVIDES:${PN} += "Mesa-KHR-devel \
Mesa-libGL-devel-/usr/include/KHR/khrplatform.h"

RDEPENDS:${PN} += ""

inherit rpm
