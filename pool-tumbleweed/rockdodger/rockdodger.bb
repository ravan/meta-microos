SUMMARY = "Addictive rock-dodging greeblie-killing platform game"
DESCRIPTION = "Addictive rock-dodging greeblie-killing platform game. \
 \
Dodge the rocks for as long as possible until you die. Kill greeblies to \
make the universe safe for non-greeblie life once again."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "rockdodger-1.1.4-1.23.aarch64.rpm"
RPM_HASH = "700d29dd2d6c34bb79863cdd49aa002371f5ae7356e065f28ffe1a7ef57d4c06175972966e6f02c8ee2848d8f8a69059f8dcf6b8ed0473450ec30a0569575d91"

RPROVIDES:${PN} += "rockdodger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
