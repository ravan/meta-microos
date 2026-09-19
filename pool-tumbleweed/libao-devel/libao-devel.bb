SUMMARY = "Development files for libao, an audio outputl ibrary"
DESCRIPTION = "This package contains the headers for developing applications that \
want to make use of libao."
LICENSE = "GPL-2.0+"

PV = "1.2.2+git20180114.d522165"

RPM_NAME = "libao-devel-1.2.2+git20180114.d522165-3.9.aarch64.rpm"
RPM_HASH = "06766d83e926eaa9f67c2194805dc6e0f1c5e6829a435d5a84cca068737a88a5541bb07e0c0976015fa31648a2b7b745ea8049f1e46721479afd82b4c220a907"

RPROVIDES:${PN} += "libao-devel \
pkgconfig-ao"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libao4"

inherit rpm
