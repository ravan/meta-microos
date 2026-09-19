SUMMARY = "OpenGL window and compositing manager plugins"
DESCRIPTION = "This package contains the non-default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "f913479338ebce3a6146981f36894705c576ff924a376f8e54f37511521914052e9406a247cefd7c53e461f6ac655696431364942d7446b694f52de0c2b1891c"

RPROVIDES:${PN} += "compiz-plugins-main \
libanimation.so \
libcolorfilter.so \
libexpo.so \
libezoom.so \
libfocuspoll.so \
libimgjpeg.so \
libmag.so \
libmousepoll.so \
libneg.so \
libopacify.so \
libput.so \
libresizeinfo.so \
libring.so \
libscaleaddon.so \
libsession.so \
libshift.so \
libsnap.so \
libstaticswitcher.so \
libtext.so \
libthumbnail.so \
libtitleinfo.so \
libvpswitch.so \
libwinrules.so \
libworkarounds.so"

RDEPENDS:${PN} += "compiz-plugins \
ld-linux-aarch64.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libXrender.so.1 \
libatspi.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
