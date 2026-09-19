SUMMARY = "Development files for the libblockdev-nvme plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_nvme plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_nvme-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "9477adfe6cc1e5567e78fc1cd831ac3b75bca6fb7230a5b4634638b8c2251b8147efb9b439e481a0bb436e45f969cfa9c1f3070266986bf6f099c2745e21788e"

RPROVIDES:${PN} += "libbd-nvme-devel \
libblockdev-nvme-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-nvme3 \
libbd-utils-devel"

inherit rpm
