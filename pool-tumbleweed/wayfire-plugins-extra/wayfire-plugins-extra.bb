SUMMARY = "Additional plugins for Wayfire"
DESCRIPTION = "Additional plugins for Wayfire \
The plugins that come here are plugins that have external dependencies, for ex. giomm."
LICENSE = "MIT"

PV = "0.11.2"

RPM_NAME = "wayfire-plugins-extra-0.11.2-1.1.aarch64.rpm"
RPM_HASH = "988c5f70a00ea24c458d19a0928a268b7a39720351f0c233eded45d0c24cc9a2c953aea4418c4863977f2c94ce5202f5abf8ac9ca26d1d2988aa4b4a4bcf5220"

RPROVIDES:${PN} += "libannotate.so \
libautorotate-iio.so \
libbench.so \
libcrosshair.so \
libextra-animations.so \
libfilters.so \
libfisheye.so \
libfocus-change.so \
libfocus-request.so \
libfocus-steal-prevent.so \
libfollow-focus.so \
libforce-fullscreen.so \
libghost.so \
libglib-main-loop.so \
libhide-cursor.so \
libjoin-views.so \
libkeycolor.so \
libmag.so \
libobs.so \
libpin-view.so \
libpixdecor.so \
libshowrepaint.so \
libshowtouch.so \
libview-shot.so \
libwater.so \
libwinshadows.so \
libwinzoom.so \
libworkspace-names.so \
wayfire-plugins-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libgcc-s.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libwayland-server.so.0 \
libwf-config.so.1 \
libwlroots-0.20.so \
wayfire"

inherit rpm
