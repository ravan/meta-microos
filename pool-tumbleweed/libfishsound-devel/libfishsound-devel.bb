SUMMARY = "Audio Decoding and Encoding Library"
DESCRIPTION = "libfishsound provides a programming interface for decoding and \
encoding audio data using the three Xiph.org codecs FLAC, Speex and \
Vorbis. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfishsound."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "libfishsound-devel-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "c639e9653abfc3f2e93aad5cb93c32a71f383846f3e2ac3fe9ceaccd76e510b61f6fb5e71d85c1d41861c17e6ac81f581c2a9df83bb2fd8002425a42a53bfb55"

RPROVIDES:${PN} += "libfishsound-devel \
pkgconfig-fishsound"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfishsound1"

inherit rpm
