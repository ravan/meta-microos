SUMMARY = "Messaging application with a focus on speed and security"
DESCRIPTION = "Telegram is a non-profit cloud-based instant messaging service. \
Users can send messages and exchange photos, videos, stickers, audio and files of any type. \
Its client-side code is open-source software but the source code for recent versions is not \
always immediately published, whereas its server-side code is closed-source and proprietary. \
The service also provides APIs to independent developers."
LICENSE = "GPL-3.0-only"

PV = "6.1.4"

RPM_NAME = "telegram-desktop-6.1.4-2.2.aarch64.rpm"
RPM_HASH = "6a662f82b766cc553fee0be18a54fd765bcf95858e257499d2dde9cac9cc9ac99cdbbe47ec9b22f90e0e8e084157895af1dd94170ffef5a489435a9a8bf29ef0"

RPROVIDES:${PN} += "telegram-desktop"

RDEPENDS:${PN} += "icu \
kf6-kimageformats \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Svg.so.6 \
libQt6WaylandCompositor.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libabsl-strings.so.2508.0.0 \
libabsl-throw-delegate.so.2508.0.0 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcrypto.so.3 \
libdispatch.so.1.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhunspell-1.7.so.0 \
libjpeg.so.8 \
liblz4.so.1 \
libm.so.6 \
libminizip.so.1 \
libopenal.so.1 \
libopus.so.0 \
libpipewire-0.3.so.0 \
libprotobuf-lite.so.32.0.0 \
libqrcodegencpp.so.1 \
librnnoise.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libvpx.so.11 \
libxcb-keysyms.so.1 \
libxcb-record.so.0 \
libxcb-screensaver.so.0 \
libxcb.so.1 \
libxxhash.so.0 \
libz.so.1 \
xdg-desktop-portal"

inherit rpm
