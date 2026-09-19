SUMMARY = "A library to link together with mpv player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types. \
 \
This package contains a library that can other apps use to utilize the mpv \
features."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.0+git20260309.07c3ff3725"

RPM_NAME = "libmpv2-0.41.0+git20260309.07c3ff3725-2.2.aarch64.rpm"
RPM_HASH = "b3991094d386abee5a1c3f29a7fd63d5de3c0aecfa3e5e171efeff50dcb9a6b70dff08b11b98e9c6951ced3734eee66d707741e65a76aa5b43e9c92c2b7acd99"

RPROVIDES:${PN} += "libmpv.so.2 \
libmpv2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXpresent.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libXv.so.1 \
libarchive.so.13 \
libasound.so.2 \
libass.so.9 \
libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libbluray.so.3 \
libc.so.6 \
libcaca.so.0 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libdisplay-info.so.3 \
libdrm.so.2 \
libdvdnav.so.4 \
libgbm.so.1 \
libjack.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libluajit-5.1.so.2 \
libm.so.6 \
libopenal.so.1 \
libpipewire-0.3.so.0 \
libplacebo.so.360 \
libpulse.so.0 \
librubberband.so.3 \
libsixel.so.1 \
libswresample.so.6 \
libswscale.so.9 \
libuchardet.so.0 \
libva-drm.so.2 \
libva-wayland.so.2 \
libva-x11.so.2 \
libva.so.2 \
libvdpau.so.1 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0 \
libz.so.1 \
libzimg.so.2"

inherit rpm
