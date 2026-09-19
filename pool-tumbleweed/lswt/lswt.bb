SUMMARY = "Wayland toplevel lister"
DESCRIPTION = "A program to list Wayland toplevels. \
 \
Requires the Wayland server to implement the foreign-toplevel-management-unstable-v1 \
protocol extension."
LICENSE = "GPL-3.0-only"

PV = "2.0.0"

RPM_NAME = "lswt-2.0.0-2.6.aarch64.rpm"
RPM_HASH = "599701d3313d26b8847fd385af1ea5727f1e03e6c9703969753b8e24deea467e9b672a791673eb28cbeb7b3f3f07c0b1b3b155dd8f2174ccebf157d53fd3d3f6"

RPROVIDES:${PN} += "lswt"

RDEPENDS:${PN} += "libc.so.6 \
libwayland-client.so.0"

inherit rpm
