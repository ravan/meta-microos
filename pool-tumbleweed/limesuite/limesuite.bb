SUMMARY = "Collection of software supporting LMS7-based hardware"
DESCRIPTION = "Lime Suite is a collection of software supporting several hardware \
platforms including the LimeSDR, drivers for the LMS7002M transceiver \
RFIC, and other tools for developing with LMS7-based hardware. Lime \
Suite enables many SDR applications, such as GQRX for example, to \
work with supported hardware through the bundled SoapySDR support \
module."
LICENSE = "Apache-2.0"

PV = "23.11.0"

RPM_NAME = "limesuite-23.11.0-4.1.aarch64.rpm"
RPM_HASH = "e86beb52ec89b051fa9f89ca83b2f874c3f2c6a950864435eb8d06b3e37cceed6de5e35dcbc19da71b1c9768037d8527e35a2fe660cd6fa81e7507122d573a91"

RPROVIDES:${PN} += "limesuite"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libLimeSuite.so.23.11-1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0"

inherit rpm
