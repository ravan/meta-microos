SUMMARY = "Simple Terminal Implementation for X"
DESCRIPTION = "Simple and lightweight and unbloated X11 terminal."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "st-0.9-2.13.aarch64.rpm"
RPM_HASH = "cacf7f327d9296e81b5519dbe45b94dbf3121bd83653f96c24ffc17d9560aea64492126c66d11eda814b8c550daf08ce73618e0b12a4dff1df0c54d2afba4252"

RPROVIDES:${PN} += "st"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libfontconfig.so.1 \
terminfo"

inherit rpm
