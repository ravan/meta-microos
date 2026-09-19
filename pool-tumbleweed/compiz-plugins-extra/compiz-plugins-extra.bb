SUMMARY = "OpenGL window and compositing manager community extra plugins"
DESCRIPTION = "This package contains the community extra Compiz compositing \
manager plugins. \
 \
Contains: addhelper crashhandler extrawm firepaint goto-viewport \
mswitch scalefilter splash bench cubereflex fadedesktop gears group \
mblur reflex showdesktop trailfocus."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-extra-0.8.18-2.6.aarch64.rpm"
RPM_HASH = "b8703d9255ff9102f973f89839bd31425aadf17b8f8b44fb6cd36abc4063adec125c3ee970ced7856915b7aecfcf7b9cd8a1bd318a26947436b0903ef88bb233"

RPROVIDES:${PN} += "compiz-fusion-plugins-extra \
compiz-plugins-extra \
lib3d.so \
libaddhelper.so \
libanimationaddon.so \
libbench.so \
libbicubic.so \
libcrashhandler.so \
libcubeaddon.so \
libextrawm.so \
libfadedesktop.so \
libfirepaint.so \
libgears.so \
libgrid.so \
libgroup.so \
libhighlightcontent.so \
libloginout.so \
libmaximumize.so \
libmblur.so \
libnotification.so \
libreflex.so \
libscalefilter.so \
libshelf.so \
libshowdesktop.so \
libshowmouse.so \
libsplash.so \
libtrailfocus.so \
libvidcap.so \
libwallpaper.so \
libwidget.so \
libworkspacenames.so"

RDEPENDS:${PN} += "compiz \
compiz-plugins-main \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libnotify.so.4"

inherit rpm
