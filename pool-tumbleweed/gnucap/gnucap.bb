SUMMARY = "Gnu Circuit Analysis Package"
DESCRIPTION = "The primary component is a general purpose circuit simulator. It \
performs nonlinear dc and transient analyses, fourier analysis, and ac \
analysis. Spice compatible models for the MOSFET (level 1-7), BJT, and \
diode are included in this release. \
 \
Gnucap is not based on Spice, but some of the models have been derived \
from the Berkeley models. \
 \
Unlike Spice, the engine is designed to do true mixed-mode \
simulation. Most of the code is in place for future support of event \
driven analog simulation, and true multi-rate simulation."
LICENSE = "GPL-2.0+"

PV = "0.35"

RPM_NAME = "gnucap-0.35-18.10.aarch64.rpm"
RPM_HASH = "fbea9a3740b31c28d5645910ef589998600c64f188bdf3fe97742e646d2527107ddf5d6d4aaa5b39c0f3b65b393a0570df5d3b575085b6a1f9a701c09e73d78b"

RPROVIDES:${PN} += "gnucap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
