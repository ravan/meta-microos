SUMMARY = "Speech Dispatcher driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the Speech Dispatcher speech driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-driver-speech-dispatcher-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "77d09287d94481746e766a21ee07bc9effd8ab513210db0b40aed8b335c72cfdedce904c387d01618c57ca8372d662a51fd29e9ee2747a05afe668b8781e6e11"

RPROVIDES:${PN} += "brltty-driver-speech-dispatcher \
libbrlttyssd.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libspeechd.so.2"

inherit rpm
