SUMMARY = "Development files for the libblockdev-mpath plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_mpath plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_mpath-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "0c350726ba75ea837d3aeb0c5e7fa554f6c81f2beb490d863e7a04edf434d401605bd361ce745f1030d4e7e9bf857cfffb20be6a181a45df68f29fd63192e607"

RPROVIDES:${PN} += "libbd-mpath-devel \
libblockdev-mpath-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-mpath3 \
libbd-utils-devel"

inherit rpm
