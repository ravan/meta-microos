SUMMARY = "A panel for COSMIC DE"
DESCRIPTION = "A panel for COSMIC DE."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-panel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "c1343d00fba503cf6208f429a738582a238813fb602d3dd69a3697e10eb4c2d81ec95e6cf951257becd86ad5275a5a7e3fa997d528a5ad0897e8cd64396f4546"

RPROVIDES:${PN} += "cosmic-panel"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libwayland-server0 \
libxkbcommon.so.0"

inherit rpm
