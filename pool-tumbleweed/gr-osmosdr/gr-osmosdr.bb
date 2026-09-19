SUMMARY = "Gnuradio Source for OsmoSDR"
DESCRIPTION = "OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.6"

RPM_NAME = "gr-osmosdr-0.2.6-3.9.aarch64.rpm"
RPM_HASH = "15f54f50d64793350cbecb9a3f74e7d0e91f673abdb9b5b83b6f436f3db5ec66eba7cda880ded48c45e83f9914b2ab39014aab4750b19c552fb400bf02298cb0"

RPROVIDES:${PN} += "gr-osmosdr"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gr-osmosdr"

inherit rpm
