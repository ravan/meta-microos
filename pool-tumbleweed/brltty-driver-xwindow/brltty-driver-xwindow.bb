SUMMARY = "XWindow driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the XWindow braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-driver-xwindow-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "3ae90f21b463c8268df510631f63d728247597ec61734a4ba050faa04b48c123f971c6b1c0a1f67188463d7c8480b14993f1f21126d2bc4076a46029ee790839"

RPROVIDES:${PN} += "brltty-driver-xwindow \
libbrlttybxw.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
