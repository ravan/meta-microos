SUMMARY = "Utility Library for the Xfce Desktop Environment"
DESCRIPTION = "libxfce4util is a general-purpose utility library with core application support \
for the Xfce Desktop Environment."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.1"

RPM_NAME = "libxfce4util7-4.20.1-1.5.aarch64.rpm"
RPM_HASH = "84bf951cf14638ad181820f2d812a0b543acc5d1d713cb7d3bcbd4f967c9a845b464d18289c1df185eecfbc9c0634217a712ba014986924d4c83191f9c334b85"

RPROVIDES:${PN} += "libxfce4util \
libxfce4util.so.7 \
libxfce4util7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
