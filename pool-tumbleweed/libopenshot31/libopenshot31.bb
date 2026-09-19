SUMMARY = "The core library for the OpenShot video editor"
DESCRIPTION = "A library for video editing, composition, animation, and playback, \
which focuses on The library is written in C++ and includes full \
bindings for Python and Ruby. It features: \
 \
* Multi-layer compositing \
* Video and audio effects (chroma key, color adjustment, \
  grayscale, etc.) \
* Animation curves (Bézier, linear, constant) \
* Time mapping (curve-based slow-down, speed-up, reverse) \
* Audio mixing & resampling (curve-based) \
* Audio plug-ins (VST & AU) \
* Telecine and Inverse Telecine (film to TV, TV to film) \
* Frame rate conversions \
* Multi-processor support \
* Uses ffmpeg for format and codec support \
 \
This package contains the shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libopenshot31-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "3f1df7cc8538ac9289dae186f0eb20b96f6fd9a1b4b1771a1b649498e1ff544e256a62544626191fc116712bd2399282216407216a0df3950ee651b0e0492635"

RPROVIDES:${PN} += "libopenshot.so.31 \
libopenshot31"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libbabl-0.1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-dnn.so.413 \
libopencv-flann.so.413 \
libopencv-imgproc.so.413 \
libopencv-tracking.so.413 \
libopencv-video.so.413 \
libopenshot-audio.so.10 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libzmq.so.5"

inherit rpm
