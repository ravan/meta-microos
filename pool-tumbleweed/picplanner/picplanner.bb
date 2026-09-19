SUMMARY = "A GTK application for photographers using GNU Linux or especially Linux phones"
DESCRIPTION = "A GTK application for photographers using GNU Linux or especially \
Linux phones. It can be used to calculate the position of the Sun, \
Moon and Milky Way in order to plan the position and time for an \
photograph."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.4+git4.2ea8588"

RPM_NAME = "picplanner-0.5.4+git4.2ea8588-1.4.aarch64.rpm"
RPM_HASH = "c7ebb1024581b7f21cad7dca06d847ce028ed1a8895052861935ad2c44ba59ec403d636c07ba5067864d73a37f173dbf6e38d7958ec9d7ff2c690ac4e719ee51"

RPROVIDES:${PN} += "picplanner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgeoclue-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgweather-4.so.0 \
libm.so.6 \
libshumate-1.0.so.1"

inherit rpm
