SUMMARY = "Shared library for Flash hardware identification"
DESCRIPTION = "The Flash plugin currently requires libhal for playback of drm content. \
 \
This library provides a compatibility layer and minimal libhal implementation for that purpose. \
This library does NOT provide a full HAL interface or daemon."
LICENSE = "GPL-2.0+ | AFL-2.1"

PV = "0.3.3"

RPM_NAME = "libhal1-0.3.3-1.38.aarch64.rpm"
RPM_HASH = "7e1a0ab43fd8ecb372b36373525f76109c92ee3741558a1e4d2d3d1a0eaa25d694159cc77fdf3ef8ddf1911782b245853da4240123a38b5e868305b270d65f12"

RPROVIDES:${PN} += "hal-flash \
libhal.so.1 \
libhal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
