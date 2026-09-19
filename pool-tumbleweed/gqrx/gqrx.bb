SUMMARY = "Software defined radio receiver"
DESCRIPTION = "Gqrx is an experimental software defined radio receiver implemented using \
GNU Radio and the Qt GUI toolkit. Currently it works on Linux and Mac and it \
can use the Funcube Dongle, RTL2832U-based DVB-T dongles, OsmoSDR devices and \
USRP devices as input source."
LICENSE = "GPL-3.0-only"

PV = "2.17.7"

RPM_NAME = "gqrx-2.17.7-3.6.aarch64.rpm"
RPM_HASH = "a05ff45b150f69d62d3e7236bfd36c896b89639dbe6e78eec005ef7191450e96677b76e0c05170725ab8aa315462a09c829fc3b5e7d26b8edceff9d44884cc51"

RPROVIDES:${PN} += "gqrx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-analog.so.3.10.12 \
libgnuradio-blocks.so.3.10.12 \
libgnuradio-digital.so.3.10.12 \
libgnuradio-fft.so.3.10.12 \
libgnuradio-filter.so.3.10.12 \
libgnuradio-network.so.3.10.12 \
libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libvolk.so.3.3"

inherit rpm
