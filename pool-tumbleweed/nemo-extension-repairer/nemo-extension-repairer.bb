SUMMARY = "Nemo extension for filename encoding repair"
DESCRIPTION = "This is a Nemo extension which repairs filename which uses wrong \
encoding in Nemo. This extension provides the context menu for any \
file whose filename uses wrong encoding, so that you cannot read the \
filename in Nemo. \
 \
You can find a candidate for filename in context menu or submenu. \
This extension also provides a decoded name for URL encoded filename."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-repairer-6.4.0-6.4.aarch64.rpm"
RPM_HASH = "3e39737da3eda5c282629ca05eb3865790b7b97f865c833577fffd5d069e915378ccbdd55eaa0707010065aaaa14a8acace8d298326aa1d2c3cdb9512601dc79"

RPROVIDES:${PN} += "libnemo-filename-repairer.so \
nemo-extension-repairer \
nemo-repairer"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
nemo"

inherit rpm
