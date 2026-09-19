SUMMARY = "Libraries for GNU Radio"
DESCRIPTION = "GNU Radio is a collection of software that when combined with minimal \
hardware, allows the construction of radios where the actual waveforms \
transmitted and received are defined by software. What this means is \
that it turns the digital modulation schemes used in today's high \
performance wireless devices into software problems. \
 \
This package contains the libraries for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.12.0"

RPM_NAME = "libgnuradio-3_10_12-3.10.12.0-4.1.aarch64.rpm"
RPM_HASH = "66a217382bfdbf853c543f5cb6e05674b13ce2d8cfadeb905a1de319864165d709ba31c467dd35463838cdb942583abceeb460f012e95e164114c7c6d6853e89"

RPROVIDES:${PN} += "libgnuradio-3-10-12 \
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
libgnuradio-zeromq.so.3.10.12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libSDL-1.2.so.0 \
libSoapySDR.so.0.8-3 \
libad9361.so.0 \
libasound.so.2 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcodec2.so.1.2 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfmt.so.12 \
libgcc-s.so.1 \
libgmp.so.10 \
libgsl.so.28 \
libgslcblas.so.0 \
libgsm.so.1 \
libiio.so.0 \
libjack.so.0 \
libm.so.6 \
libportaudio.so.2 \
libqwt-qt5.so.6.3 \
libsndfile.so.1 \
libspdlog.so.1.17 \
libstdc++.so.6 \
libthrift-0.24.0.so \
libuhd.so.4.10.0 \
libunwind.so.8 \
libvolk.so.3.3 \
libzmq.so.5"

inherit rpm
