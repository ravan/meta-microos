SUMMARY = "Development files for librubberband"
DESCRIPTION = "The librubberband-devel package contains libraries and header files for \
developing applications that use librubberband."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "librubberband-devel-4.0.0-1.6.aarch64.rpm"
RPM_HASH = "2d37837ec31b6f2d350fe4c15a72d3a3054cd3ad5315fbf598e8fb56d96c15305dc4cd08c268f53d5b348db18125bf90d1615de0635914e1c1bf5d1022dac05c"

RPROVIDES:${PN} += "librubberband-devel \
pkgconfig-rubberband"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librubberband3 \
pkgconfig \
pkgconfig-fftw3"

inherit rpm
