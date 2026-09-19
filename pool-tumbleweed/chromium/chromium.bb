SUMMARY = "Google's open source browser project"
DESCRIPTION = "Chromium is the open-source project behind Google Chrome. We invite you to join us in our effort to help build a safer, faster, and more stable way for all Internet users to experience the web, and to create a powerful platform for developing a new generation of web applications."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "153.0.8010.36"

RPM_NAME = "chromium-153.0.8010.36-2.1.aarch64.rpm"
RPM_HASH = "d9d8a140ec7e3f6fe5f7e1e8390bbdcb20c3c04f23429fa834a6492ed2b8bba47836f6915755f83bf24f5760b00c0356cbcae8b15a663dea9714a740e3e4b130"

RPROVIDES:${PN} += "chromium \
chromium-based-browser \
chromium-browser \
chromium-suid-helper \
config-chromium \
web-browser"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libasound.so.2 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libatspi.so.0 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc++.so.1 \
libc++abi.so.1 \
libc.so.6 \
libcairo.so.2 \
libcups.so.2 \
libdbus-1.so.3 \
libdrm.so.2 \
libexpat.so.1 \
libffi.so.8 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libopenh264.so.8 \
libopus.so.0 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libsmime3.so \
libudev.so.1 \
libxcb.so.1 \
libxkbcommon.so.0 \
libxml2.so.16 \
libxslt.so.1 \
permissions \
xdg-utils"

inherit rpm
