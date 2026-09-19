SUMMARY = "Tool to measure"
DESCRIPTION = "QLoud - tool to measure loudspeaker frequency and step responses and \
distortions. \
 \
Target use: \
 * loudspeakers DIY-ing (xovers tuning)."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.3"

RPM_NAME = "qloud-1.4.3-1.4.aarch64.rpm"
RPM_HASH = "86cd442526973cff397160431b75c8081ac7fcf28af7342ec7977914166de6217b3446cee8c43ec1cb2bc33fc6778ee686371476e76f4f045fe485bfb51d7eb7"

RPROVIDES:${PN} += "qloud"

RDEPENDS:${PN} += "jack \
ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
