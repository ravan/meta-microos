SUMMARY = "Stand-alone compositor for X11"
DESCRIPTION = "Picom is a stand-alone compositor for X11. It supports both GLX and \
XRender backends and has various options to control shadows, blur \
and fade animations."
LICENSE = "MIT & MPL-2.0"

PV = "13"

RPM_NAME = "picom-13-1.6.aarch64.rpm"
RPM_HASH = "351ad0052a3ab7aed569554acbfe8cc272003091e9d76a36703328dce76ce61991b7817d6080c4415877326e81e71a82afb31c7868ef2a69b9babafee9ec3737"

RPROVIDES:${PN} += "compton \
picom"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libconfig.so.15 \
libdbus-1.so.3 \
libepoxy.so.0 \
libev.so.4 \
libm.so.6 \
libpcre2-8.so.0 \
libpixman-1.so.0 \
libxcb-composite.so.0 \
libxcb-damage.so.0 \
libxcb-glx.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-util.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
