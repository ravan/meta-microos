SUMMARY = "Development files for Compiz"
DESCRIPTION = "Compiz is an OpenGL compositing manager that uses \
GLX_EXT_texture_from_drawable for binding redirected top-level \
windows to texture objects. It has a flexible plug-in system and it \
is designed to run well on most graphics hardware."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-devel-0.8.18-4.5.aarch64.rpm"
RPM_HASH = "e5d1dfbdeb80bebf129b006fd04ed21570272c4fc65398cfcad0825146732d57b73c1a882b46dcf93ac9545ed8c1fc9655a430f1e5c785e1bcc05a667f466af2"

RPROVIDES:${PN} += "compiz-devel \
pkgconfig-compiz \
pkgconfig-compiz-cube \
pkgconfig-compiz-scale \
pkgconfig-libdecoration"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-plugins \
libjpeg-devel \
libxslt-tools \
pkgconfig \
pkgconfig-cairo \
pkgconfig-cairo-xlib-xrender \
pkgconfig-compiz \
pkgconfig-fuse \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-gtk+-3.0 \
pkgconfig-ice \
pkgconfig-libpng \
pkgconfig-librsvg-2.0 \
pkgconfig-libstartup-notification-1.0 \
pkgconfig-libwnck-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-pangocairo \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xcomposite \
pkgconfig-xcursor \
pkgconfig-xdamage \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xi \
pkgconfig-xinerama \
pkgconfig-xrandr \
pkgconfig-xrender"

inherit rpm
