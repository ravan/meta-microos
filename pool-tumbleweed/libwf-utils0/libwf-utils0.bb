SUMMARY = "Library for wayfire"
DESCRIPTION = "Library for wayfire."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "libwf-utils0-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "2d3a4a36e6423ad291ec634014c399d4c61d3d2e06ac0aaa2048c5a69b131ffaf35554c71f502d9c49fe68d89813a0531bc55382d16be9c0a8ea5dc371b2296e"

RPROVIDES:${PN} += "libalpha.so \
libanimate.so \
libautostart.so \
libblur.so \
libcommand.so \
libcube.so \
libdecoration.so \
libdefault-config-backend.so \
libexpo.so \
libext-toplevel.so \
libextra-gestures.so \
libfast-switcher.so \
libforeign-toplevel.so \
libgrid.so \
libgtk-shell.so \
libidle.so \
libinput-method-v1.so \
libinvert.so \
libipc-rules.so \
libipc.so \
libkde-appmenu.so \
libmove.so \
liboswitch.so \
libplace.so \
libpreserve-output.so \
libresize.so \
libscale-title-filter.so \
libscale.so \
libsecurity-context-v1.so \
libsession-lock.so \
libshortcuts-inhibit.so \
libsimple-tile.so \
libstipc.so \
libswitcher.so \
libvk-color-management.so \
libvswipe.so \
libvswitch.so \
libwayfire-blur-base.so \
libwayfire-shell.so \
libwf-utils.so.0 \
libwf-utils0 \
libwindow-rules.so \
libwm-actions.so \
libwobbly.so \
libwrot.so \
libwsets.so \
libxdg-activation.so \
libxkb-bindings.so \
libzoom.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libwf-config.so.1 \
libwlroots-0.20.so \
libyyjson.so.0"

inherit rpm
