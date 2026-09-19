SUMMARY = "Video player that gets sync from Jack"
DESCRIPTION = "Xjadeo is a video player that gets sync from JACK. When a \
sequencer like Muse or Rosegarden acts as a timebase master, xjadeo will \
display the video frame in sync with the sequencer transport. This means \
that an audio event can be visually synchronized with a certain frame in \
the movie, which may be useful for creating a soundtrack for \
a video clip."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.15"

RPM_NAME = "xjadeo-0.8.15-1.7.aarch64.rpm"
RPM_HASH = "9d2f7b6819148568e980900626f03b378bac52c3388bd476aa772746a0957fa91d8cf6a936a3d173c6148f3055c4527dfbef8723395970904178bf78a93e4488"

RPROVIDES:${PN} += "xjadeo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libImlib2.so.1 \
libOpenGL.so.0 \
libSDL-1.2.so.0 \
libX11.so.6 \
libXpm.so.4 \
libasound.so.2 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libfreetype.so.6 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libswscale.so.9"

inherit rpm
