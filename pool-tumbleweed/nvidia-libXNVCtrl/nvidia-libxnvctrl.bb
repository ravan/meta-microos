SUMMARY = "Library providing the NV-CONTROL API"
DESCRIPTION = "This library provides the NV-CONTROL API for communicating with the proprietary \
NVidia xorg driver. It is required for proper operation of the nvidia-settings utility."
LICENSE = "GPL-2.0-only"

PV = "580.159.03"

RPM_NAME = "nvidia-libXNVCtrl-580.159.03-1.3.aarch64.rpm"
RPM_HASH = "cbb679ada939640c0d01e139334d549d7d76876404df29586856089447fcd55c3378e0617dc7010453a17060ea31e58a69c27243e17c8a2b8be5d40b84d1089b"

RPROVIDES:${PN} += "libXNVCtrl.so.0 \
libXNVCtrl0 \
nvidia-libXNVCtrl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
