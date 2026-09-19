SUMMARY = "Audio library with an OpenGL-resembling API"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
libopenal.so.0 is just a wrapper around libopenal.so.1 for \
compatibility with old software."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.3~179"

RPM_NAME = "libopenal0-1.24.3~179-1.6.aarch64.rpm"
RPM_HASH = "2a79a93284ab8f638fd816947141fa231aec86a7bacd097c3efa2152545b3e937c64b950496f703a7ac01783bc89fa243917e204dcdd226698a1d99ea750fb28"

RPROVIDES:${PN} += "libopenal.so.0 \
libopenal0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libopenal.so.1"

inherit rpm
