SUMMARY = "Hamradio transceiver control software"
DESCRIPTION = "FLRIG is a transceiver control program designed to be used either stand alone or \
as an adjunct to FLDIGI. The supported transceivers all have some degree of CAT. \
The FLRIG user interface changes to accommodate the degree of CAT support \
available for the transceiver in use."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later & LGPL-3.0-or-later"

PV = "2.0.12"

RPM_NAME = "flrig-2.0.12-1.1.aarch64.rpm"
RPM_HASH = "84846199a01878e22a4de0aacedd734ee5d8192f5b84832b56ddb6d3ffdf7a92272cddd6b253b449b9f2b8f8cfa8c4e4eedaf399777b4e9fd370f1a59327b24e"

RPROVIDES:${PN} += "bundled-flxmlrpc \
flrig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgpiod.so.3 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
