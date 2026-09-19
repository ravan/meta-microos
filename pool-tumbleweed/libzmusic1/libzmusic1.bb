SUMMARY = "ZDoom component library for music handling"
DESCRIPTION = "This is the music playback code from gzdoom, which was separated into its own \
code repository starting with gzdoom-4.4.0."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "libzmusic1-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "64c8b25a9bd06d3b98d9f0d92c238bd585a74c770e898a83d7c1c8ffa2ab8e839c7439eb16c57d1f52f8ebbe9bd541e84184fd48b8b81c44dc6c51dfc78e8481"

RPROVIDES:${PN} += "libzmusic.so.1 \
libzmusic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libgme.so.0 \
libm.so.6 \
libmpg123.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libxmp.so.4 \
libz.so.1"

inherit rpm
