SUMMARY = "Instrument Neutral Distributed Interface"
DESCRIPTION = "INDI is an Instrument Neutral Distributed Interface control protocol \
for astronomical devices, which provides a framework that decouples low \
level hardware drivers from high level front end clients. Clients that \
use the device drivers are completely unaware of the device \
capabilities and communicate with the device drivers and build a \
completely dynamic GUI based on the services provided by the device."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.2.4.2"

RPM_NAME = "libindidriver2-2.2.4.2-1.1.aarch64.rpm"
RPM_HASH = "068e283b49d4aafef9b798cdced4254ae4bb96162cdd75f9cfacd62fdbaeb967201cf5725d12c67f33815e2756bfd0d842ab16c9d47635fb6145eac9a573ed3a"

RPROVIDES:${PN} += "libindidriver.so.2 \
libindidriver2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXISF.so.0 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3.so.3 \
libgcc-s.so.1 \
libindiAlignmentDriver.so.2 \
libjpeg.so.8 \
libm.so.6 \
libnova-0.15.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libtheoradec.so.2 \
libtheoraenc.so.2 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
