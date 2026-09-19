SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "BSD-2-Clause"

PV = "0.2.2"

RPM_NAME = "libsamplerate-devel-0.2.2-3.8.aarch64.rpm"
RPM_HASH = "a3157603369768a715418950b189d848d404beeb33e1f70e5204b9c3b4a3d428ca27f8558f12cb4b5aa03294258994080b436db5d5cd0467d85d33fc289f88c7"

RPROVIDES:${PN} += "libsamplerate-devel \
pkgconfig-samplerate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsamplerate0"

inherit rpm
