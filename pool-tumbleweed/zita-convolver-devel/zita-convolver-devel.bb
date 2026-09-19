SUMMARY = "Development files for zita-convolver"
DESCRIPTION = "Development package for zita-convolver, a partitioned convolution engine \
library."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "zita-convolver-devel-4.0.3-1.25.aarch64.rpm"
RPM_HASH = "76c30ec181d57822113a82cc247b59edf9e845893eb7a0567e38c9069aa3559ec9f73e3e3674c621e4e2905e02bc735e20b0a7ed3b41e75df9e16bde23ddca3a"

RPROVIDES:${PN} += "zita-convolver-devel"

RDEPENDS:${PN} += "libzita-convolver4 \
pkgconfig-fftw3f"

inherit rpm
