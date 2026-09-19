SUMMARY = "A Pulseaudio mixer in Qt"
DESCRIPTION = "pavucontrol-qt is the Qt port of the volume control pavucontrol for the \
sound server PulseAudio. As such it can be used to adjust all controls \
provided by PulseAudio and ALSA as well as some additional settings."
LICENSE = "GPL-2.0-only"

PV = "2.4.0"

RPM_NAME = "pavucontrol-qt-2.4.0-1.3.aarch64.rpm"
RPM_HASH = "4d120af5be7578e2f0e0f5133acf02328a8ce99b03545a6c14f4d2a80f6c9bf06118b7e0ff62139151822807f0d836f4f1815620b796fdd330d10bf064a90679"

RPROVIDES:${PN} += "pavucontrol-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
