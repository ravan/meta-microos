SUMMARY = "Development files for the libblockdev-loop plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_loop plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_loop-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "73e7f7f742ed936f6446450709c2232745632d3569ffc8f752aaca4e046872d6064cc769e3ab3f9a29520dc0053addaeceaefed5caf50ccf22b559ee82e054e3"

RPROVIDES:${PN} += "libbd-loop-devel \
libblockdev-loop-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-loop3 \
libbd-utils-devel"

inherit rpm
