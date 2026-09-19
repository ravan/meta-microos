SUMMARY = "ESpeak driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the eSpeak speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-driver-espeak-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "017ae0107425b5d6cc7620fb3236f8bf6f5e0e9ecba9d3a2fe14309008b26a9f20eab32d58f3ebc9b8e3065cf71a23aa9fc71ab37b7aff47bcdcae072bb2d11b"

RPROVIDES:${PN} += "brltty-driver-espeak \
libbrlttyses.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libespeak-ng.so.1"

inherit rpm
