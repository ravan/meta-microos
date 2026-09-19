SUMMARY = "Qt 6 WlShellIntegration library"
DESCRIPTION = "The Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WlShellIntegration6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "9887f85a00ee0bc0757f02d48564c9cfe55f4aa4b779f58927c06f4d322c6508a46db4d938849772bfa432f1d0330ca3dcab4d91edb1901522c3aefb281be7fc"

RPROVIDES:${PN} += "libQt6WlShellIntegration.so.6 \
libQt6WlShellIntegration6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
