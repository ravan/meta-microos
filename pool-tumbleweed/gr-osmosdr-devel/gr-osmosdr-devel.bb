SUMMARY = "Development files for gr-osmosdr"
DESCRIPTION = "Library headers for gr-osmosdr. \
OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.6"

RPM_NAME = "gr-osmosdr-devel-0.2.6-3.9.aarch64.rpm"
RPM_HASH = "448748ce7be398440fc22a74e6146de342d25cf35f748ebd920206a0533c65c928d14fb00f4119af47d5c0d9f9faf25a23596c87db9a77d08bbad0c6fab14fa7"

RPROVIDES:${PN} += "cmake-gnuradio-osmosdr \
gr-osmosdr-devel"

RDEPENDS:${PN} += "gr-osmosdr \
libgnuradio-osmosdr0-2-0"

inherit rpm
