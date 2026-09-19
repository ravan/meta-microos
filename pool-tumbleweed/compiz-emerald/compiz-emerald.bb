SUMMARY = "Themeable window decorator for Compiz"
DESCRIPTION = "Emerald is a themeable window decorator for Compiz."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-0.8.18-2.25.aarch64.rpm"
RPM_HASH = "32bd65c20f8edce832177eb72fafce5e33dfac98ec3bf9d6adcec3abb46d28e864839d640cea2fd505d63534aa0a8ccedd237b80a3e63249d84d3a9a76e0415f"

RPROVIDES:${PN} += "compiz-decorator \
compiz-emerald \
libemeraldengine.so.0 \
liblegacy.so \
libline.so \
liboxygen.so \
libpixmap.so \
libtruglass.so \
libvrunner.so \
libzootreeves.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
compiz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libdecoration.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
