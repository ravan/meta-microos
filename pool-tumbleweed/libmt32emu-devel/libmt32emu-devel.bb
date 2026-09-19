SUMMARY = "Development files for libmt32emu"
DESCRIPTION = "A multi-platform software synthesiser emulating pre-GM MIDI devices such as the Roland MT-32, CM-32L, CM-64 and LAPC-I. \
Development files for libmt32emu."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.8.3"

RPM_NAME = "libmt32emu-devel-2.8.3-1.3.aarch64.rpm"
RPM_HASH = "57afd2ad3acecb84ba662e1aa15c58ad2d4ca48abab2fcde1adaeba1d8da647437b6743a1fb98e443fc6e997ab2a1700ce4a105d251a7d78fddbb64ae398ac06"

RPROVIDES:${PN} += "libmt32emu-devel \
pkgconfig-mt32emu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmt32emu2"

inherit rpm
