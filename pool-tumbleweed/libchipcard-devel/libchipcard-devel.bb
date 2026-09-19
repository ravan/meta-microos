SUMMARY = "Header files for libchipcard, a library for accessing smartcards"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard-devel-5.1.6-2.9.aarch64.rpm"
RPM_HASH = "f4994c54d584cc53b2bcb0573f7ca837bfac6711839d47b36a9cad889c0880556b57834adb7bf104cc95915c906d92622cad692945bc99a90ff74198419f80bb"

RPROVIDES:${PN} += "libchipcard-devel \
pkgconfig-libchipcard-client \
pkgconfig-libchipcard-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gwenhywfar-devel \
libchipcard \
libchipcard6 \
libusb-devel \
pcsc-lite-devel \
sysfsutils"

inherit rpm
