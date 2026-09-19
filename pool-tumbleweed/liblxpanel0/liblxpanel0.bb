SUMMARY = "LXDE panel libraries"
DESCRIPTION = "Library for interpolability and access to the lxpanel API by plugins."
LICENSE = "GPL-2.0-only"

PV = "0.11.1"

RPM_NAME = "liblxpanel0-0.11.1-1.4.aarch64.rpm"
RPM_HASH = "7731649e66b314d173a861d014abc9230535b0274d4b01ad2c687eda9117c9fcb458d783b7c56b8ca102d5653610dcfbfc7eda3af9557b7d169c08d3a21b4ff3"

RPROVIDES:${PN} += "liblxpanel.so.0 \
liblxpanel0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfm-gtk3.so.4 \
libfm.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libpango-1.0.so.0"

inherit rpm
