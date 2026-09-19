SUMMARY = "Simple X Image Viewer"
DESCRIPTION = "sxiv is an image viewer which only has the most basic features \
for image viewing. It has vi key bindings and works with \
tiling window managers. \
 \
Features: \
- Basic image operations, e.g. zooming, panning, rotating \
- Thumbnail mode: grid of selectable previews of all images \
- Ability to cache thumbnails for fast re-loading \
- Basic support for multi-frame images \
- Loads all frames from GIF files and plays GIF animations \
- Displays image information in status bar"
LICENSE = "GPL-2.0-only"

PV = "26"

RPM_NAME = "sxiv-26-1.24.aarch64.rpm"
RPM_HASH = "d03bac47d9e73475bd1dc4d259f994e46df6efb043ec2bdf07275f3dff23c5edef0e70c8d88fdba1e75f9b2da7bd50d15a29ece17d655c87fb5a031df010f922"

RPROVIDES:${PN} += "sxiv"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
hicolor-icon-theme \
imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libexif.so.12 \
libfontconfig.so.1 \
libgif.so.7"

inherit rpm
