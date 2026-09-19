SUMMARY = "Development files for neatvnc"
DESCRIPTION = "Development files and headers for neatvnc."
LICENSE = "ISC"

PV = "1.0.1"

RPM_NAME = "neatvnc-devel-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "7077745001acaced37e599bf35834f8cb58823f0ea3ee4a6cd498dbd900bc408a1cf5541adc67f4f05a04fc329d82879eac324b6b20ebca27fe2279267728a22"

RPROVIDES:${PN} += "neatvnc-devel \
pkgconfig-neatvnc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libneatvnc1 \
pkgconfig-aml1 \
pkgconfig-gbm \
pkgconfig-gnutls \
pkgconfig-hogweed \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavutil \
pkgconfig-libdrm \
pkgconfig-libturbojpeg \
pkgconfig-nettle \
pkgconfig-pixman-1 \
pkgconfig-zlib"

inherit rpm
