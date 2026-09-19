SUMMARY = "A library to link together with mpv player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types. \
 \
This package contains all the development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.0+git20260309.07c3ff3725"

RPM_NAME = "mpv-devel-0.41.0+git20260309.07c3ff3725-2.2.aarch64.rpm"
RPM_HASH = "ba7cf142300ecbc6e6d657fb885c0de1d6d4705a3d9ec9d3cab25a00f162b22eb067090fd48a77a3b7d04c22d11ce84676901b925449b958616e09247b352d91"

RPROVIDES:${PN} += "mpv-devel \
pkgconfig-mpv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpv2 \
pkgconfig-alsa \
pkgconfig-caca \
pkgconfig-dvdnav \
pkgconfig-egl \
pkgconfig-ffnvcodec \
pkgconfig-gbm \
pkgconfig-jack \
pkgconfig-lcms2 \
pkgconfig-libarchive \
pkgconfig-libass \
pkgconfig-libavcodec \
pkgconfig-libavdevice \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libbluray \
pkgconfig-libcdio \
pkgconfig-libcdio-paranoia \
pkgconfig-libdisplay-info \
pkgconfig-libdrm \
pkgconfig-libjpeg \
pkgconfig-libpipewire-0.3 \
pkgconfig-libplacebo \
pkgconfig-libpulse \
pkgconfig-libsixel \
pkgconfig-libswresample \
pkgconfig-libswscale \
pkgconfig-libva \
pkgconfig-libva-drm \
pkgconfig-libva-wayland \
pkgconfig-libva-x11 \
pkgconfig-luajit \
pkgconfig-mujs \
pkgconfig-openal \
pkgconfig-rubberband \
pkgconfig-uchardet \
pkgconfig-vdpau \
pkgconfig-vulkan \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-egl \
pkgconfig-wayland-protocols \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xkbcommon \
pkgconfig-xpresent \
pkgconfig-xrandr \
pkgconfig-xscrnsaver \
pkgconfig-xv \
pkgconfig-zimg \
pkgconfig-zlib"

inherit rpm
