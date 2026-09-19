SUMMARY = "Image Acquisition functions for Octave"
DESCRIPTION = "The Octave-forge Image Aquisition package provides functions to capture \
images from connected devices. Currently only v4l2 is supported. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.3"

RPM_NAME = "octave-forge-image-acquisition-0.3.3-2.3.aarch64.rpm"
RPM_HASH = "d64ba5cef2065aa25c7c2329b30e23cc21c5e382e67ff50821751f742e433631ce6d0ca03f326faed26de903ce8a78ce58909c86f7e135dad64b87690d19af88"

RPROVIDES:${PN} += "octave-forge-image-acquisition"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libjpeg.so.8 \
libstdc++.so.6 \
libv4l2.so.0 \
octave-api-v61 \
octave-cli"

inherit rpm
