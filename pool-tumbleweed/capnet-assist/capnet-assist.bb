SUMMARY = "Captive Portal Assistant"
DESCRIPTION = "Assists users in connective to Captive Portals such as those found on \
public access points in train stations, coffee shops, universities, etc. \
Upon detection, the assistant appears showing the captive portal. Once a \
connection is known to have been established, it dismisses itself. Written \
in Vala and using WebkitGtk+."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "capnet-assist-8.0.2-1.5.aarch64.rpm"
RPM_HASH = "25bae903e6f43d16a2257e0dd9a70c7395189bfec5d897ad252c725e632179163c206e9192552c9c7ae90a2077a9c726ec5f864c27c90cc4408cada419650f62"

RPROVIDES:${PN} += "capnet-assist \
elementary-capnet-assist"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libwebkitgtk-6.0.so.4"

inherit rpm
