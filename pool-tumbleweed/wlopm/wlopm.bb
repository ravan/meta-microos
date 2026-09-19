SUMMARY = "Wayland output power management"
DESCRIPTION = "Simple client implementing zwlr-output-power-management-v1. Helps \
turning off screen output e.g. laptops after closing the lid \
and turning it on e.g. laptops after opening the lid"
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "wlopm-1.0.0-1.8.aarch64.rpm"
RPM_HASH = "1567a1d79a32d653e9cca8f1b20387c86b22b41de41b6f9bded9ea214f8d8bdcad88b45225b8f1ae3858e5418ee76f71c03acdc711d83863e5f317c88894fc5e"

RPROVIDES:${PN} += "wlopm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0"

inherit rpm
