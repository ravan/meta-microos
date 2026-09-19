SUMMARY = "Tiled layout generator for river"
DESCRIPTION = "A layout generator for river. It provides a simple tiled layout with split main/secondary stacks. \
The initial state may be configured with various options passed on startup. Some values may additionally be modified while rivertile is running with the help of riverctl."
LICENSE = "GPL-3.0-only"

PV = "0.3.12"

RPM_NAME = "river-rivertile-0.3.12-2.6.aarch64.rpm"
RPM_HASH = "def4e66ea4fee919fd3056f35444431082a71645e87f7aaa3284f4e7d16d068ec1ec647bed9158dd54a283e228ff2623e06cc51293d09ea665e1045809279e78"

RPROVIDES:${PN} += "river-rivertile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
river"

inherit rpm
