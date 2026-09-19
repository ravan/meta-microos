SUMMARY = "Python bindings for gr-osmosdr"
DESCRIPTION = "Python Bindings for gr-osmosdr. \
OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.6"

RPM_NAME = "python3-gr-osmosdr-0.2.6-3.9.aarch64.rpm"
RPM_HASH = "645d69059c663a06bdbd3f7ed1869dca72517cb2bad337fe2e2f06de32ca63201e0461053ee471e9b74975f529663f48783f3fa103e77816de261dd3ab1fed63"

RPROVIDES:${PN} += "python3-gr-osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-runtime.so.3.10.12 \
libstdc++.so.6 \
python-abi"

inherit rpm
