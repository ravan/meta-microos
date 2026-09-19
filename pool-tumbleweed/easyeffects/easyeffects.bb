SUMMARY = "Simple audio effects"
DESCRIPTION = "Easy Effects is a collection of audio effects, providing limiter, \
compressor, convolver, equalizer and auto volume and many other \
plugins for PipeWire applications."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.9"

RPM_NAME = "easyeffects-8.2.9-1.1.aarch64.rpm"
RPM_HASH = "dcbe35be21e4c603fc4a3181ff6b73f0f1ced4ce737978c83401b032158ea188bf948f5ec512e5a0359937ce27a9f99a729fed0144226a58df16215c2ee61728"

RPROVIDES:${PN} += "easyeffects"

RDEPENDS:${PN} += "kf6-kirigami \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libSoundTouch.so.1 \
libbs2b.so.0 \
libc.so.6 \
libebur128.so.1 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libpipewire-0.3.so.0 \
librnnoise.so.0 \
libsndfile.so.1 \
libspeexdsp.so.1 \
libstdc++.so.6 \
libtbb.so.12 \
libwebrtc-audio-processing-2.so.1 \
libzita-convolver.so.4 \
qt6-graphs-imports"

inherit rpm
