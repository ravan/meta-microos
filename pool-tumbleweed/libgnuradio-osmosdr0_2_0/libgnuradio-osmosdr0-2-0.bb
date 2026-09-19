SUMMARY = "Library for gr-osmosdr"
DESCRIPTION = "OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.6"

RPM_NAME = "libgnuradio-osmosdr0_2_0-0.2.6-3.9.aarch64.rpm"
RPM_HASH = "2c422bb3369be6d9638c2c1092ba2bf78237a40aef676dea467979308451b01b4b2f49b7c71751c99274d4765e6c51811aec0c27ef2b6c1151790095c8b00029"

RPROVIDES:${PN} += "libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-osmosdr0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libairspy.so.0 \
libairspyhf.so.0 \
libbladeRF.so.2 \
libboost-chrono.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-blocks.so.3.10.12 \
libgnuradio-funcube.so.3.10.0 \
libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libgnuradio-uhd.so.3.10.12 \
libhackrf.so.0 \
libmirisdr.so.4 \
librtlsdr.so.0 \
libstdc++.so.6 \
libuhd.so.4.10.0 \
libvolk.so.3.3"

inherit rpm
