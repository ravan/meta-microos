SUMMARY = "MPRIS plugin for mpv"
DESCRIPTION = "This package contains a plugin for mpv which allows control of the \
player using the MPRIS D-Bus interface, which enables control with \
multimedia keys in desktop environments such as GNOME and KDE \
as well as through tools like playerctl."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "mpv-mpris-1.2-1.6.aarch64.rpm"
RPM_HASH = "a2fcb441c8190404788f10c16e2159d30e61adab204a42de0fd3591ec6ca58958325c9dcb9448614bcbfd037520ab4cc4a09e0e62caba4fe0fd67aedcb1cc85e"

RPROVIDES:${PN} += "mpv-mpris"

RDEPENDS:${PN} += "libavformat.so.62 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0"

inherit rpm
