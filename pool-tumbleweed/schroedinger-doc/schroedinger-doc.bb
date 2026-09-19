SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "schroedinger-doc-1.0.11-11.28.aarch64.rpm"
RPM_HASH = "178a4508ab459e5ccac73fa636164255d485a038c2a15d7dc6e6403819199e7de861c23005303cc8a1adeb31f7e3a452e2c3d25759d84def27aa2fc406f18db8"

RPROVIDES:${PN} += "schroedinger-doc"

RDEPENDS:${PN} += "libschroedinger-1-0-0"

inherit rpm
