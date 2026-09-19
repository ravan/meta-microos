SUMMARY = "Native Games launcher for GOG, Epic and Amazon"
DESCRIPTION = "Game launcher and manager for GOG, Epic Games, and Amazon"
LICENSE = "GPL-3.0-only"

PV = "2.21.0"

RPM_NAME = "heroic-games-launcher-2.21.0-2.2.aarch64.rpm"
RPM_HASH = "5bdbdac1c62545ea65cb46c4863b2e7d7b6a0debde8d2709e32cd99eb21900855a9b4640c229d2914159a66bfdef7cdae591fbad3ff94e50c02e6a7e7cb68d90"

RPROVIDES:${PN} += "heroic-games-launcher \
libEGL.so \
libGLESv2.so \
libvk-swiftshader.so"

RDEPENDS:${PN} += "ca-certificates \
comet \
electron \
heroic-epic-integration \
heroic-gogdl \
ld-linux-aarch64.so.1 \
legendary \
libFLAC.so.14 \
libGL.so.1 \
libLLVM.so.21.1 \
libSPIRV-Tools-2026.1.so \
libSPIRV-Tools-opt-2026.1.so \
libX11.so.6 \
libXNVCtrl.so.0 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXtst.so.6 \
libabsl-cord.so.2601.0.0 \
libabsl-cordz-info.so.2601.0.0 \
libabsl-hash.so.2601.0.0 \
libabsl-int128.so.2601.0.0 \
libabsl-kernel-timeout-internal.so.2601.0.0 \
libabsl-log-internal-check-op.so.2601.0.0 \
libabsl-log-internal-message.so.2601.0.0 \
libabsl-raw-hash-set.so.2601.0.0 \
libabsl-raw-logging-internal.so.2601.0.0 \
libabsl-spinlock-wait.so.2601.0.0 \
libabsl-status.so.2601.0.0 \
libabsl-statusor.so.2601.0.0 \
libabsl-str-format-internal.so.2601.0.0 \
libabsl-strings.so.2601.0.0 \
libabsl-synchronization.so.2601.0.0 \
libabsl-throw-delegate.so.2601.0.0 \
libabsl-time.so.2601.0.0 \
libaom.so.3 \
libasound.so.2 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libatspi.so.0 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcairo.so.2 \
libcares.so.2 \
libcrc32c.so.1 \
libdav1d.so.7 \
libdbus-1.so.3 \
libdouble-conversion.so.3 \
libdrm.so.2 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjpeg.so.8 \
libm.so.6 \
libminizip.so.1 \
libnghttp2.so.14 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libopus.so.0 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libre2.so.11 \
libsmime3.so \
libsnappy.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libudev.so.1 \
libvpx.so.12 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libwoff2dec.so.1.0.2 \
libxcb.so.1 \
libxkbcommon.so.0 \
libxml2.so.16 \
libxslt.so.1 \
libxxhash.so.0 \
libz.so.1 \
libzstd.so.1 \
nile \
vulkan-helper"

inherit rpm
