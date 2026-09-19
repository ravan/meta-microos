SUMMARY = "Simple animation program used for testing X11 operations and extensions"
DESCRIPTION = "ico is a simple animation program that may be used for testing various \
X11 operations and extensions. It displays a wire-frame rotating \
polyhedron, with hidden lines removed, or a solid-fill polyhedron with \
hidden faces removed."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "ico-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "315ec90f068e49a13a1350998365d44e23a550dd6fdab97f56f839dc95cd221bb779f40b3d2057038a37bc59e75f36a476e56d370f9c0646b6ba357b6ab2825c"

RPROVIDES:${PN} += "ico"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
