SUMMARY = "Pipewire based audio support for QEMU"
DESCRIPTION = "This package contains a module for Pipewire based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-audio-pipewire-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "8cc8238bd6c14c7c3bae4fff9f3b10a93f1c516dfe4b86109760700eb61e87118472e5d01b5a2249f1add19c425c8b25de3c59d136a4d31662e739c6ce9e16b9"

RPROVIDES:${PN} += "qemu-audio-pipewire"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpipewire-0.3.so.0"

inherit rpm
