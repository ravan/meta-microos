SUMMARY = "Xfdashboard library"
DESCRIPTION = "A library providing authenticators for Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "libxfdashboard0-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "f775c998657f0781227ac30cc5b2b57eae7946385a79726d2d72e883f6b9d4dba27b979bfe69d3a2a32d43be5cb3d8b31610e46169969fb589b83d35fdcbac3b"

RPROVIDES:${PN} += "libxfdashboard.so.0.10100.0 \
libxfdashboard0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXinerama.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libcogl.so.20 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwnck-3.so.0 \
libxfce4util.so.7"

inherit rpm
