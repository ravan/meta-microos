SUMMARY = "GREYC's Magick for Image Computing (denoise and others)"
DESCRIPTION = "G'MIC is a framework for image processing, providing \
several different user interfaces to convert/manipulate/filter/visualize \
generic image datasets, from 1d scalar signals to 3d+t sequences of \
multi-spectral volumetric images."
LICENSE = "CECILL-2.1"

PV = "4.0.3"

RPM_NAME = "gmic-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "4f8869b1492bfab1ff6fd8585929c6d60bafc8cf07225d38c09c893c7e2bd9ad92451ac55377ab6229c34c4f0130c5cc9b3ae52638c9857165fbfdfffa8c7c27"

RPROVIDES:${PN} += "gmic"

RDEPENDS:${PN} += "gmic-data \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libfftw3-threads.so.3 \
libgcc-s.so.1 \
libgmic.so.4 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
