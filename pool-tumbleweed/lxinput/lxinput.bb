SUMMARY = "Keyboard and mouse configuration tool"
DESCRIPTION = "LXinput is just the LXDE Keyboard and mouse config tool"
LICENSE = "GPL-2.0-only"

PV = "0.3.6"

RPM_NAME = "lxinput-0.3.6-1.3.aarch64.rpm"
RPM_HASH = "0a5b1873fa8c7732be0b7cfd2385ee1a70f300d9f99ef7ba2990e3a1015b8841cad7b68da0b5cbcf8f3dbd8b5f67f71a0b85fb9182707f658132d0003e25a84d"

RPROVIDES:${PN} += "lxinput"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
