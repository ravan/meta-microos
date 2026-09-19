SUMMARY = "Tool to read and control device brightness"
DESCRIPTION = "A utility to read and control the display brightness."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "brightnessctl-0.5.1-1.22.aarch64.rpm"
RPM_HASH = "8bf5813e271b18c6a6daa75f0db74f19621d142fd3126677e15649d0a0ba68a99fa6b9455e035e7bd38939ad0edc0e913b1d40b94a52d6ea8597e4cffc43f264"

RPROVIDES:${PN} += "brightnessctl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsystemd.so.0 \
permissions \
systemd"

inherit rpm
