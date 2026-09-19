SUMMARY = "Development files for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides development files for rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "rygel-devel-45.2-1.2.aarch64.rpm"
RPM_HASH = "c33b149edf433345ef335e050c3a50274f5936d9b6e7dc0d79fe2280762cd0b2ac01883326a5dc9f843dd63d7eb547fbf4b8e4ad0818c02d086374775c43bac8"

RPROVIDES:${PN} += "pkgconfig-rygel-core-2.8 \
pkgconfig-rygel-renderer-2.8 \
pkgconfig-rygel-renderer-gst-2.8 \
pkgconfig-rygel-ruih-2.8 \
pkgconfig-rygel-server-2.8 \
rygel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librygel-core-2-8-0 \
librygel-db-2-8-0 \
librygel-renderer-2-8-0 \
librygel-renderer-gst-2-8-0 \
librygel-ruih-2-8-0 \
librygel-server-2-8-0 \
pkgconfig-gee-0.8 \
pkgconfig-gmodule-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gupnp-av-1.0 \
pkgconfig-rygel-core-2.8 \
rygel \
typelib-1-0-RygelCore-2-8 \
typelib-1-0-RygelRenderer-2-8 \
typelib-1-0-RygelRendererGst-2-8 \
typelib-1-0-RygelServer-2-8"

inherit rpm
