SUMMARY = "ALSA based audio support for QEMU"
DESCRIPTION = "This package contains a module for ALSA based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-audio-alsa-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "eed47efd42e9a5af155b5c7a32a307f028614f033be1142cccbe1f66eff328d3819cda75ee3f0db9f077b3e0ba4779212800dc3edde2a655145af38161cfdc26"

RPROVIDES:${PN} += "qemu-audio-alsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
