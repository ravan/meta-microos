SUMMARY = "Development files for the libblockdev-mdraid plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_mdraid plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_mdraid-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "a5ffbd73ae357a43b2a67a579e9538eb202ead86e12c53b8b64744443a2cc8db665fc24e371f425404dcf5936258ac2af954ee1f6b0194cdbd587cfb510293b4"

RPROVIDES:${PN} += "libbd-mdraid-devel \
libblockdev-mdraid-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-mdraid3 \
libbd-utils-devel"

inherit rpm
