SUMMARY = "Development files for cdparanoia, a library for extractnig audio tracks from CDs"
DESCRIPTION = "This CDDA reader distribution ('cdparanoia') reads audio from the \
CD-ROM directly as data and writes the data to a file or pipe as .wav, \
.aifc, or raw 16-bit linear PCM."
LICENSE = "LGPL-2.1-or-later"

PV = "3.10.2"

RPM_NAME = "cdparanoia-devel-3.10.2-30.8.aarch64.rpm"
RPM_HASH = "051bb6c3b9c68585fc895775d0aab517d621c8a97d37f3a0540a1bf3bc027c622799b26352bcee54115299b66b28a8f096c29afb909aeee262a0aedac75a74b9"

RPROVIDES:${PN} += "cdparanoia-devel"

RDEPENDS:${PN} += "libcdda-interface0 \
libcdda-paranoia0"

inherit rpm
