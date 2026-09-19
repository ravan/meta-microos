SUMMARY = "Advanced general-purpose multimedia player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.0+git20260309.07c3ff3725"

RPM_NAME = "mpv-0.41.0+git20260309.07c3ff3725-2.2.aarch64.rpm"
RPM_HASH = "a8ecc065a910c622a38bd1ff607e1bbf631ace8246bf6f15412fce3f43ba7823e6e36d9cd0a423ed6e1b56de071f011a2e59cd504f13c5a1641989a1ccec0051"

RPROVIDES:${PN} += "mpv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
