SUMMARY = "Fileroller support for the Nemo Filemanager"
DESCRIPTION = "Nemo-fileroller adds File-roller support to the Nemo file manager."
LICENSE = "GPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-fileroller-6.4.0-6.4.aarch64.rpm"
RPM_HASH = "e1075b1bfef39428ae541834cbd14204394f2c7f71f13d811309cff686a0788147e6f0b44b3db49762118d46f6fd560c1d4d40807b1de73e1ed4b77a9c66ed4c"

RPROVIDES:${PN} += "libnemo-fileroller.so \
nemo-extension-fileroller \
nemo-fileroller"

RDEPENDS:${PN} += "/sbin/ldconfig \
file-roller \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
