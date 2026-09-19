SUMMARY = "BrlAPI driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the BrlAPI braille driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-driver-brlapi-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "da7a5f4249442ad3c3b2a44c865330fdf34a1a53824ef0943e0c67e051b4dafb269c9391cbef4da75c16b99495663104c4af182aa41a1e221060f15d9279421d"

RPROVIDES:${PN} += "brltty-driver-brlapi \
libbrlttybba.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
