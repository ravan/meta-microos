SUMMARY = "Audio library for the OpenShot video editor"
DESCRIPTION = "The OpenShot Audio Library allows editing and playback of audio. \
It was derived from the JUCE library. \
 \
This package contains the shared library."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libopenshot-audio10-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "4d1202fd5ab9e15d676d1e4d28fe284b6cb0cab1004647f621ff8b3f90ede51f934fcf8a39c202c2edc6ce889a7526e44c5506d653ebb2b139215689d62f597c"

RPROVIDES:${PN} += "libopenshot-audio.so.10 \
libopenshot-audio10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
