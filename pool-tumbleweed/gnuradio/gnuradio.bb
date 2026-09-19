SUMMARY = "GNU software radio"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.12.0"

RPM_NAME = "gnuradio-3.10.12.0-4.1.aarch64.rpm"
RPM_HASH = "38e5f6347a66412418253fdf940f739b3dbdb7c6ea2604a2eb52125a8ca8a1c4d35f0e5ac11fc199f64568398acda2a0917fa475c73551e04ba4f1d64e0d8504"

RPROVIDES:${PN} += "config-gnuradio \
gnuradio"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libQt5Widgets.so.5 \
libSoapySDR.so.0.8-3 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libgmp.so.10 \
libgnuradio-analog.so.3.10.12 \
libgnuradio-audio.so.3.10.12 \
libgnuradio-blocks.so.3.10.12 \
libgnuradio-channels.so.3.10.12 \
libgnuradio-digital.so.3.10.12 \
libgnuradio-dtv.so.3.10.12 \
libgnuradio-fec.so.3.10.12 \
libgnuradio-fft.so.3.10.12 \
libgnuradio-filter.so.3.10.12 \
libgnuradio-iio.so.3.10.12 \
libgnuradio-network.so.3.10.12 \
libgnuradio-pdu.so.3.10.12 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-qtgui.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libgnuradio-soapy.so.3.10.12 \
libgnuradio-trellis.so.3.10.12 \
libgnuradio-uhd.so.3.10.12 \
libgnuradio-video-sdl.so.3.10.12 \
libgnuradio-vocoder.so.3.10.12 \
libgnuradio-wavelet.so.3.10.12 \
libgnuradio-zeromq.so.3.10.12 \
libm.so.6 \
libspdlog.so.1.17 \
libstdc++.so.6 \
libuhd.so.4.10.0 \
libvolk.so.3.3 \
python-abi \
python3-QDarkStyle \
python3-QtPy \
python3-SoapySDR \
python3-cairo \
python3-click \
python3-click-plugins \
python3-gobject-Gdk \
python3-jsonschema \
python3-mako \
python3-numpy \
python3-pyaml \
python3-pyqtgraph \
python3-pyzmq \
python3-qt5 \
python3-scipy \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo"

inherit rpm
