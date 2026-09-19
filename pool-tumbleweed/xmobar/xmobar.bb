SUMMARY = "A Minimalistic Text Based Status Bar"
DESCRIPTION = "Xmobar is a minimalistic text based status bar. \
 \
Inspired by the Ion3 status bar, it supports similar features, like dynamic \
color management, output templates, and extensibility through plugins."
LICENSE = "BSD-3-Clause"

PV = "0.51.1"

RPM_NAME = "xmobar-0.51.1-1.2.aarch64.rpm"
RPM_HASH = "5df6125f4337650d3fa11ad55e715195687c55efdf0131a6b4499347028bcfc01db75ace316cfcdfca2a1c1f6078a8798d9e9f7fef075b6fea2a5fad9d204728"

RPROVIDES:${PN} += "xmobar"

RDEPENDS:${PN} += "libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXpm.so.4 \
libXrandr.so.2 \
libXrender.so.1 \
libXss.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libffi.so.8 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libnuma.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libz.so.1"

inherit rpm
