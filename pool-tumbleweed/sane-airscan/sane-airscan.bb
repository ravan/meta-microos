SUMMARY = "Universal driver for Apple AirScan (eSCL) and WSD"
DESCRIPTION = "This package contains a SANE backend for MFP and document scanners that \
implements either eSCL (AirScan/AirPrint scanning) or WSD 'driverless' \
scanning protocol"
LICENSE = "SUSE-GPL-2.0+-with-sane-exception"

PV = "0.99.38"

RPM_NAME = "sane-airscan-0.99.38-1.1.aarch64.rpm"
RPM_HASH = "d5d85860de330e4e864f8c8fba493fb20d448887485ea441436c4ae3840bbd3c6ace6c4ba466195fd471198f21f0671615079ed2e03659a44e9958ab29fbe2a9"

RPROVIDES:${PN} += "config-sane-airscan \
libsane-airscan.so.1 \
libsane-airscan1 \
sane-airscan \
sane-airscan-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgnutls.so.30 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libxml2.so.16"

inherit rpm
