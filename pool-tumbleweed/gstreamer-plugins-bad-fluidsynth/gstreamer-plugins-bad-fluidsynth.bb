SUMMARY = "Fluidsynth plugin for GStreamer"
DESCRIPTION = "Add fluidsynth midi support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-bad-fluidsynth-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "6496d418dbeae8e34667a36d6489b2e919c66ecf2baaeb332312574df824656d5685e9bf2462c7bb7a211024a0765906b08779633f103de8d16d8ae5edd0da94"

RPROVIDES:${PN} += "gstreamer-plugins-bad-fluidsynth \
gstreamer1 \
libgstfluidsynthmidi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfluidsynth.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
