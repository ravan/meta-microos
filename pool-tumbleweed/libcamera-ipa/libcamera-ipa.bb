SUMMARY = "Plugins for hardware specific image processing blocks"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
This package provides plugins for interfacing with various ISP \
(Image Signal Processor) hardware blocks, as well as \
calibration data for some camera sensors."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libcamera-ipa-0.7.2-1.2.aarch64.rpm"
RPM_HASH = "c5b84a928060fd04f9024c2762d3a4611fd15dfe1f658f0a5c200375287174acac78f1729405d367f1ed3eeb0a85f8dde60eb8f81e56e6a8a48f503edf93274c"

RPROVIDES:${PN} += "libcamera-ipa \
libcamera-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcamera-base.so.0.7 \
libcamera.so.0.7 \
libgcc-s.so.1 \
libm.so.6 \
libpisp.so.1 \
libstdc++.so.6"

inherit rpm
